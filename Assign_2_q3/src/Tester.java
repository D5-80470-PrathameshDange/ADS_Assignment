import java.util.Arrays;

class Employee{
	int id;
	double sal;
	public Employee(int id, double sal) {
		super();
		this.id = id;
		this.sal = sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + "]";
	}
}


public class Tester {
	
	public static void insertionSort(Employee err[],int n)
	{
		for(int i=1 ; i < n ; i++)
		{
			Employee temp = err[i];
			int j;
			for(j = i-1 ; j >=0 && err[j].getSal() > temp.getSal() ; j--)
			{
				err[j+1] = err[j];
			}
			err[j+1] = temp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Employee err[] = {
				new Employee(2, 500),
				new Employee(5, 400),
				new Employee(1, 600),
				new Employee(7, 200),
				new Employee(6, 150),
				new Employee(9, 250)
		};
		//System.out.println("Array brfore sort: "+Arrays.toString(err));
		for (Employee employee : err) {
			System.out.println(employee);
		}
		insertionSort(err, err.length);
		//System.out.println("Array after sort: "+Arrays.toString(err));
		
		System.out.println();
		for (Employee employee : err) {
			System.out.println(employee);
		}
		

	}

}
