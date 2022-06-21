package users;
//import iplauctionsystem.*;
//import usermanagement.CreateUser;
import functions.Func;

public class Teams {
    public static void admin()
    {
        

         feature();
    }

private  static void feature() {
  
      Func.delay(2000);
       String obj = Func.input("Enter command /type 'help'");
       
    //list all the Actions that can be done in this project
         switch(obj)
         {    
         case "help": 
         {
         Func.print("\n");
         Func.print("--commands--    :  -------------Actions---------------- ");
         Func.print("  create        :        create cases profile");
         Func.print("  view          :        To view the cases profile");
         Func.print("  update        :        To update the cases details/ user details");
         Func.print("  changepsw     :        to change the password");
         Func.print("  createuser    :        to create a new user profile");
         Func.print("  logout        :        to logout");
         
         feature();
         break; 
         }
          case "create":
          {
         
        
         break;
          }
          case "view":
          {
         
        
         break;
          }
          case "update":
          {
         
        
         break;
          }

          case "changepsw":
          {
         
        
         break;
          }
          case "createuser":
          {
            //CreateUser.createuser();
         
        
         break;
          }
          case "logout":
          {
         
            //Auction.getID_psw();
        
         break;
          }


            default:     
            System.out.println("Invalid Input /type 'help' "); 
            feature();
            
        }
         
    }
}