package model;

public class Vacation extends Task
{
   private String type, status;
   private MyDate end;

   public Vacation(Worker who, String type, MyDate start, MyDate end)
   {
      super(who, start);
      this.type = type;
      this.end = end;
      this.status = "Pending";
   }

   public String getType()
   {
      return this.type;
   }

   public String getStatus()
   {
      return this.status;
   }

   public MyDate getEnd()
   {
      return this.end;
   }

   public void setStatus(String status)
   {
      this.status = status;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   public void setEnd(MyDate end)
   {
      this.end = end;
   }

   public boolean equals(Object obj) throws NullPointerException
   {
      if (super.equals(obj))
      {
         /*
          * if (!(obj instanceof Vacation)) { return false; }
          */
         Vacation other = (Vacation) obj;
         return this.type.equals(other.type) && this.status.equals(other.status)
               && this.end.equals(other.end);
      }
      else
         return false;
   }
}
