package chap05.sec03.exam01;

public class EnumExample {

	public static void main(String[] args) {
		 Week today = Week.MONDAY; 
		 LoginResult result = LoginResult.LOGIN_SUCCESS;
	}
	
	public static LoginResult login(String id, String password) {
		if (id.equals("admin")) {
			if (password.equals("12345")) {
				return LoginResult.LOGIN_SUCCESS;
			} else {
				return LoginResult.LOGIN_FAIL_PASSWORD;
			}
		} else {
			return LoginResult.LOGIN_FAIL_ID;
		}
		
	}

}
