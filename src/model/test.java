package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class test
{

   public static void main(String[] args) throws FileNotFoundException
   {
      /*ArrayList<String> k = new ArrayList<>();
      ArrayList<String> i = new ArrayList<>();
      ArrayList<AnalysisList> o = new ArrayList<>();

      Worker a = new Worker("Pesho", "ID12");
      Worker b = new Worker("Miho", "ID12");
      a.setNotes(k);
      a.setTraining(o);
      b.setNotes(i);
      b.setTraining(o);

      MyDate c = new MyDate(12, 12, 2018);
      MyDate d = new MyDate(12, 11, 2018);

      MyDate e = new MyDate(18, 12, 2018);
      MyDate f = new MyDate(18, 11, 2018);

      Vacation g = new Vacation(a, "Gay", c, f);
      Vacation h = new Vacation(b, "Gay", c, f);

      //k.add("Gay");

      System.out.println(g.equals(h));
      System.out.println(a.equals(b));*/
      
      String filename = "test.txt";
      File file = new File(filename);

      PrintWriter out = new PrintWriter(file); // Open the file

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

      PrintWriter out2 = new PrintWriter(file1); // Open the file
      
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
