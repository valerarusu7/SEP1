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
}