package Day2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Loggerexample {
	public static void main(String[] args) {
		Log log = LogFactory.getLog(Loggerexample.class);
//		log.info("HelloWOrld");
		try {
			UserAuthentication auth = new UserAuthentication();
			auth.loginUser("admin", "Asdf@123");
			System.out.println("User has logged in");
			
		}catch(Exception e) {
			System.out.println("Catch");
		}
	}
	
}
