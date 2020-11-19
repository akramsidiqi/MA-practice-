
public class Employee {
	
	
	private String id;
	private String firstName;
	private String lastName;
	private double Salary;
	
	public Employee(String id, String firstName, String lastName, double Salary) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Salary = Salary;
		
	}
	
	public double checkSalary() {
		if (Salary <= 3000) {
			
			System.out.println("Employee works in a restuarant.");
		} else {
			System.out.println("Employee works in a bank.");
		}
		return Salary;
		
	}

	public static void main(String[] args) {
		
		Employee firstEmployee = new Employee ("A123", "Ahmad", "Mahmood", 2900);
		Employee secondEmployee = new Employee("B123", "Amin", "Maihan", 3900);
		
		System.out.println(firstEmployee.id);
		System.out.println(firstEmployee.firstName);
		System.out.println(firstEmployee.lastName);
		//System.out.println(firstEmployee.Salary);
		System.out.println(firstEmployee.checkSalary());
		
		System.out.println("*************************************************");
		
		System.out.println(secondEmployee.id);
		System.out.println(secondEmployee.firstName);
		System.out.println(secondEmployee.lastName);
		//System.out.println(secondEmployee.Salary);
		System.out.println(secondEmployee.checkSalary());
		
		
		
		
		
		
		

	}

}
