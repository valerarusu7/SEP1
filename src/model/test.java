package model;

import java.util.ArrayList;

public class test
{

   public static void main(String[] args)
   {
      ArrayList<String> k = new ArrayList<>();
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
      System.out.println(a.equals(b));
   }

}
