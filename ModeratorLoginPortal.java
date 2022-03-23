
public class ModeratorLoginPortal {

	public static void main(String[] args) {
		
		LoginInformation loginInfo = new LoginInformation();
		
		
		
		SignInWindow signIn = new SignInWindow(loginInfo.getUserEntry());
		
	}

}
