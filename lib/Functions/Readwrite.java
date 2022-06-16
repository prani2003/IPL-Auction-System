package Functions;
//This module will read and write the files.
import java.io.*;
import java.util.Scanner;
public class Readwrite
{
    private String filename;
    
     public Readwrite(String name)
     {
       this.filename = name;
     }
    public String Read(String filename) throws FileNotFoundException
    {
        System.out.println(filename);
        FileInputStream fis = new FileInputStream(filename);
        try (Scanner scan = new Scanner(fis)) {
          while(scan.hasNextLine())
          { 
            String line = (scan.nextLine()); 
            return line;
          };
        }
            return "";
           }
     //Creating a new asm file and saving everything in the file 
     public  void save(String data)
   { 
     File asmfile = new File (filename);
     if(asmfile.exists())
       {
         try {
         FileWriter fr = new FileWriter(filename,true);
          PrintWriter pw = new PrintWriter(fr);
          pw.println();
          pw.print(data);
          pw.close();
         } catch (IOException e) {
           e.printStackTrace();
         }
 
       }
   else
   {
     try {
       if(asmfile.createNewFile());
     } catch (IOException e) {
     
       e.printStackTrace();
      }
      try {
       FileWriter fr = new FileWriter(filename);
       PrintWriter pw = new PrintWriter(fr);
       pw.print(data);
       pw.close();
     } catch (IOException e) {
       e.printStackTrace();
     }
   } 
 }
 public  void delete(String name)
 {
   File file = new File(name);
   file.delete();
 }
}