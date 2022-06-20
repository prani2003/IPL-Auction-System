package Usermanagement;
import Functions.Func;
import Functions.Readwrite;
import Users.Admin;

//import java.util.concurrent.locks.ReadWriteLock;

public class CreateUser {

    public static void createuser()
    {
        Readwrite readwrite = new Readwrite("/home/singh/Desktop/Singh/IPL-Audition-System/lib/Database/user.csv");
        String fname = Func.input("Enter the First Name of the user");
        Func.delay(1000);
        //String lname = Func.input("Enter the Last Name of the user");
        String role = Func.input("Enter the Role(admin/teamsManager)");
        String pass = Func.input("Enter your password");

        String Data = fname+"@"+role+","+pass;
    
        readwrite.save(Data);
        Func.print("Your userID:" +fname+"@"+role);
        Func.print("--- User Successfully Registered ---");
        String fun = Func.input("Enter 'register' to register new user / 'home' to return");
        Func.clear();
        if (fun.equals("register"))
        {
            createuser();
        }
        else if(fun.equals("home"))
         {
             Admin.admin();
         }
    }
    
}
