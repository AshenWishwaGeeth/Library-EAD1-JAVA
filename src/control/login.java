package control;



import java.io.FileWriter;
import java.io.IOException;

public class login {
	public int checkCredentials(String username, String pass) {
		
		int status;
		
		if(username.equals("admin") && pass.equals("admin123")){
			status = 1;
		}else if(username.equals("member") && pass.equals("member123")){
			status = 2;
		}else {
			status = 111;
		}
		
		return status;
	}
}

