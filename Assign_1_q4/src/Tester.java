import java.util.Objects;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id || Objects.equals(name, other.name)
				|| Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
}


public class Tester {
	public static int findById(Employee err[], int id)
	{
		for(int i=0 ; i<err.length ; i++)
		{
			if(err[i].getId() == id)
			{
				return i;
			}
		}
		return -1;
	}
	public static int findByName(Employee err[],String name)
	{
		for(int i=0 ; i < err.length ; i++)
		{
			if(err[i].getName().equals(name))
				return i;
		}
		return -1;
	}
	public static int findBySal(Employee err[],Double sal)
	{
		for(int i=0 ; i < err.length ; i++)
		{
			if(err[i].getSalary() == (sal))
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee err[] = {
				new Employee(4,"emp1",1000),
				new Employee(7,"emp2",1500),
				new Employee(8, "emp4", 500)
		};
		int i=0;
//		System.out.print("Enter Id: ");
//		int id = sc.nextInt();
//		 i = findById(err, id);
//		System.out.println("emp found at : "+i);
//		
		
//		System.out.print("Enter name: ");
//		String name = sc.next();
//		i = findByName(err, name);
//		System.out.println("emp found at : "+i);
		
		System.out.print("Enter Salary: ");
		double sal = sc.nextDouble();
		i = findBySal(err,sal);
		System.out.println("emp found at : "+i);
	}

}
