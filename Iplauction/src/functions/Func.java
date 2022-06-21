package functions;
import java.util.*;
//functions to get input and return the inputs taken 
public class Func
{
    //getting Return String
    static Scanner scan = new Scanner(System.in);

    public static String input(String message)
    {
        String data = "";
        
        System.out.println(message);
        data = scan.nextLine();
        return data;
        
    }
    public static void print(String mes)
    {
        System.out.println(mes);
    }
    public static void welcome()
    {
        System.out.println("------------------------------------------  welcome to the dashboard  ------------------------------------------");
    }

   //Function to create delay in the program
   public static void delay(int sec)
   {
    try {
        // Delay for 1 seonds
        Thread.sleep(sec);   
      }
      catch (InterruptedException ex)
      {
          ex.printStackTrace();
      }

   }

//clear the screen 
public static void clear() {
    System.out.print("033[H033[2J");  
    System.out.flush();
}
public static void printarr(String[] arr)
{
    for(String i:arr)
    {
        print(i+ " ");
    }
}
}