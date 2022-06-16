package Main;
import Functions.*;

import Usermanagement.CreateUser;
public class Main{
    public static void main(String[] args) {
        CreateUser.createuser();
        getID_psw();
        
    }

//can call this function again if id and password is wrong 
   public static void getID_psw()  
   { 
    
    Func.print("Login");
    //String user = Func.input("Enter your user ID");
    //String pass = Func.input("Enter your Password");
}
}
