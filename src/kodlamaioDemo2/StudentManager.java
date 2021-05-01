package kodlamaioDemo2;

public class StudentManager extends UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirstName() + " isimli ogrenci java krusuna katildi.");
	}

}
