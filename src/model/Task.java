package model;

public abstract class Task
{
   private Worker who;
   private MyDate start;

   public Task(Worker who, MyDate start)
   {
      this.who = who;
      this.start = start;
   }

   public Worker getWorker()
   {
      return this.who;
   }

   public MyDate getStart()
   {
      return this.start;
   }

   public void setWorker(Worker who)
   {
      this.who = who;
   }

   public void setStart(MyDate start)
   {
      this.start = start;
   }

   public boolean equals(Object obj) throws NullPointerException
   {
      if (!(obj instanceof Task))
      {
         return false;
      }
      Task other = (Task) obj;
      return this.who.equals(other.who) && this.start.equals(other.start);
   }
}