package credentials;
//Check data base for lgetting the password 
public class CheckCredentials
{
    public static boolean validate(String email , String password)
    {
        if(password.equals("Singh"))   // check for the Password if true , if false 
        {
            return true;
        }     
        else 
        {
        return false;
       }
        
    }
}