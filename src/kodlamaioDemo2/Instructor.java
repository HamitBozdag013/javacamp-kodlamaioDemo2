package kodlamaioDemo2;

public class Instructor extends User {
	
	private String departmant;
	private double salary;
	
	
	public Instructor() {
		
	}


	public Instructor(String departamant, double salary) {
		super();
		this.departmant = departamant;
		this.salary = salary;
	}
	
	public Instructor(int id, String firstName, String lastName, String mail, String password, String courseNumber, String courseName, String departmant, double salary) {
		super(id, firstName, lastName, mail, password, courseNumber, courseName);
		this.departmant = departmant;
		this.salary = salary;
		
	}
	
	


	public String getDepartamant() {
		return departmant;
	}


	public void setDepartamant(String departamant) {
		this.departmant = departamant;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
