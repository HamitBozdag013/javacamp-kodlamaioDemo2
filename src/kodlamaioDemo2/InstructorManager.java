package kodlamaioDemo2;

public class InstructorManager extends UserManager {
	
	public void addCourse(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + " " +instructor.getLastName() + " isimli egitmen tarafindan" + instructor.getCourseName() + " kursu eklendi.");
	}

}
