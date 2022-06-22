package iplauctionsystem;

import functions.Func;
import credentials.*;

public class Login {
    public static void login()
    {
        String email = Func.input("Enter your Email: ");
        String password = Func.input("Enter your Password: ");
        if(CheckCredentials.validate(email, password));
        {
            //goto homepage
            Func.print("Login Successful");
        }
            Func.print("Invalid Login_id or password");
            login();  // use of recurssioln for the lwrong login Id and password 


    }
    
}
