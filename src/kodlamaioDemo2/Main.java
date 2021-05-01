package kodlamaioDemo2;

public class Main {

	public static void main(String[] args) {
		
	
	Instructor instructor = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", "123ed", "202102", "Java & React", "Yazılım", 10000 );
		
		//Instructor[] instructors = {instructor};
	
	
		
		Student student1 = new Student(1, "Hamit", "Bozdag", "bozdag.013@gmail.com", "123hb", "202102", "Java & React", "20210131051");
		Student student2 = new Student(2, "Erva Betul", "Bozdag", "ebbozdag.013@gmail.com", "123eb", "202102", "Java & React", "20210131052");
		
		//Student[] students = {student1,student2};
		
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.addCourse(instructor);
		instructorManager.exit(instructor);
		
		
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.login(student1);
		studentManager.add(student1);
		studentManager.exit(student1);
		
		studentManager.login(student2);
		
		
		
	
		

	}

}
