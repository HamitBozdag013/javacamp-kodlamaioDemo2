package kodlamaioDemo2;

public class UserManager {

	public void login(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +  " isimli kullanici sisteme giris yapti.");
		
		
	}
	
	public void setting(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanici ayarlarinda degisiklik yapti.");
		
	}
	
	public void exit(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanici oturumunu kapatti.");
		
	}
}
