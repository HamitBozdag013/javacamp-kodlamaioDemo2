package kodlamaioDemo2;

public class Student extends User {
	
	private String studentNumber;
	
	public Student() {
		
	}

	public Student(String studentNumber) {
		super();
		this.studentNumber = studentNumber;
	}
	
	public Student(int id, String firstName, String lastName, String mail, String password, String courseNumber, String courseName, String studentNumber) {
		super(id, firstName, lastName, mail, password, courseNumber, courseName);
		this.studentNumber = studentNumber;
		
	}
	

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	

}
