package methods;

public class LoginSystem {

	static boolean checkUser(String user){
		return user.equals("admin");
	}
	
	static boolean checkPassword(String password){
		return password.equals("1234");
	}
	
	static void login(String user, String password){
		if(checkUser(user) && checkPassword(password)) {
			System.out.println("Login succesful!");
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
	
	public static void main(String[] args) {
		login("admin","1234");
	}

}
