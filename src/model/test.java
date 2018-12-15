package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class test
{

   public static void main(String[] args) throws FileNotFoundException
   {  
      String filename = "test.txt";
      File file = new File(filename);

      
      PrintWriter out = new PrintWriter(file);

      String[] text = { "Line 1; 1; 2.9", "Line 2; 4; 3.4", 
                        "Line 3; 4; 3.3", "Line 4; 9; 1.1", 
                        "Line 5; 3; 3.2" };
      for (int i = 0; i < text.length; i++)
      {
         out.println(text[i]);
      }
      for (int i = 0; i < text.length; i++)
      {
         out.println(text[i]);
      }
      out.flush();    // Force it to write the text
      out.close();    // Close the file

      System.out.println("End writing data to file: " + file.getAbsolutePath());
      
      File file1 = new File(filename);
      FileOutputStream fos = new FileOutputStream(file1, true);
      PrintWriter out2 = new PrintWriter(fos); // Open the file
      
      for (int i = 0; i < text.length; i++)
      {
         out2.println(text[i]);
      }
      
      out2.flush();    // Force it to write the text
      out2.close();

      Scanner in = new Scanner(file);      // Open the file

      while (in.hasNext())
      {
         String line = in.nextLine();      // Read a line
         String[] token = line.split(";"); // Split the line
         String txt = token[0].trim();
         int x = Integer.parseInt(token[1].trim());
         double d = Double.parseDouble(token[2].trim());
         System.out.println(txt + " - " + x + " - " + d);
      }
      in.close();                          // Close the file
      System.out.println("End reading data from file: "
                  + file.getAbsolutePath());

   }

}
