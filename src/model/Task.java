package model;

import java.io.IOException;
import java.io.Serializable;

public abstract class Task implements Serializable
{
   private Worker who;
   private MyDate start;

   public Task(Worker who, MyDate start)
   {
      this.who = who;
      this.start = start;
   }

   public Task(MyDate start)
   {
      this.who = null;
      this.start = start;
   }

   public Worker getWorker() throws IOException
   {
      if(this.who.equals(null)) throw new IOException("There is no worker assigned to this task, it's probably a template");
      else return this.who;
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