package model;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate
{
   private int day, month, year;

   public MyDate(int day, int month, int year)
   {
      set(day, month, year);
   }

   public MyDate()
   {
      Calendar now = GregorianCalendar.getInstance();
      this.day = now.get(Calendar.DAY_OF_MONTH);
      this.month = now.get(Calendar.MONTH) + 1;
      this.year = now.get(Calendar.YEAR);
   }

   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = java.lang.Math.abs(year);

      if (this.month < 1)
         this.month = 1;
      else if (this.month > 12)
         this.month = 12;

      if (this.day < 1)
         this.month = 1;
      else if (this.day > this.numberOfDaysInMonth())
         this.day = this.numberOfDaysInMonth();
   }

   public int getDay()
   {
      return this.day;
   }

   public int getMonth()
   {
      return this.month;
   }

   public int getYear()
   {
      return this.year;
   }

   public boolean isLeapYear()
   {
      return (this.year % 4 == 0
            && (this.year % 100 != 0 || this.year % 400 == 0));
   }

   public int numberOfDaysInMonth()
   {
      switch (this.month)
      {
         case 2:
            if (this.isLeapYear())
               return 29;
            else
               return 28;
         case 4:
         case 6:
         case 9:
         case 11:
            return 30;
         default:
            return 31;
      }
   }

   public String getMonthName()
   {
      switch (this.month)
      {
         case 1:
            return "January";
         case 2:
            return "February";
         case 3:
            return "March";
         case 4:
            return "April";
         case 5:
            return "May";
         case 6:
            return "June";
         case 7:
            return "July";
         case 8:
            return "August";
         case 9:
            return "September";
         case 10:
            return "October";
         case 11:
            return "November";
         default:
            return "December";
      }
   }

   public void stepForwardOneDay()
   {
      this.day++;
      if (this.day > this.numberOfDaysInMonth())
      {
         this.day = 1;
         this.month++;
         if (this.month > 12)
         {
            month = 1;
            this.year++;
         }
      }
   }

   public void stepForward(int days)
   {
      for (int i = 0; i < days; i++)
      {
         this.stepForwardOneDay();
      }
   }

   public boolean isBefore(MyDate other)
   {
      if (this.year < other.year)
         return true;
      else if (this.month < other.month)
         return true;
      else if (this.day < other.day)
         return true;
      else
         return false;
   }

   public int yearsBetween(MyDate other)
   {
      int years = Math.abs(this.year - other.year);
      if (isBefore(other))
      {
         if (this.month < other.month)
         {
            return years;
         }
         if (this.month > other.month)
         {
            return years - 1;
         }
         if (this.day < other.day)
         {
            return years;
         }
         else
         {
            return years - 1;
         }
      }
      else
      {
         if (other.month < this.month)
         {
            return years;
         }
         if (other.month > this.month)
         {
            return years - 1;
         }
         if (other.day < this.day)
         {
            return years;
         }
         else
         {
            return years - 1;
         }
      }

   }

   public String toString()
   {
      return this.day + "/" + this.month + "/" + this.year;
   }
}
