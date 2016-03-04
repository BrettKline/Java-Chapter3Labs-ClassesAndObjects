//Dependency: Employee.java
public class Prog1 {
	
	public static void main(String[] args) {

		/* One way to do it
		Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		*/
		//The way I think the actual lab wants me to do it
		Employee employee1 = new Employee();
		employee1.setName("Susan Meyers");
		employee1.setIdNumber(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");

		Employee employee2 = new Employee();
		employee2.setName("Mark Jones");
		employee2.setIdNumber(39119);
		employee2.setDepartment("IT");
		employee2.setPosition("Programmer");

		Employee employee3 = new Employee();
		employee3.setName("Joy Rogers");
		employee3.setIdNumber(81774);
		employee3.setDepartment("Manufacturing");
		employee3.setPosition("Engineer");
		
		System.out.printf("Name: %s, ID Number: %d, Department: %s, Position: %s \r\n", employee1.getName(), employee1.getIdNumber(), employee1.getDepartment(), employee1.getPosition());
		System.out.printf("Name: %s, ID Number: %d, Department: %s, Position: %s \r\n", employee2.getName(), employee2.getIdNumber(), employee2.getDepartment(), employee2.getPosition());
		System.out.printf("Name: %s, ID Number: %d, Department: %s, Position: %s \r\n", employee3.getName(), employee3.getIdNumber(), employee3.getDepartment(), employee3.getPosition());
		
	}
	
}
