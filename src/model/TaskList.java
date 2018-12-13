package model;

import java.io.Serializable;
import java.util.ArrayList;

public class TaskList implements Serializable
{
   private ArrayList<Task> tasks;
   
   public TaskList()
   {
      this.tasks = new ArrayList<Task>();
   }
   
   public TaskList(ArrayList<Task> template)
   {
      this.tasks = template;
   }
   
   public void setTasks(ArrayList<Task> template)
   {
      this.tasks = template;
   }
   
   public ArrayList<Task> getTasks()
   {
      return this.tasks;
   }
   
   public boolean equals(Object obj) throws NullPointerException
   {
      if (!(obj instanceof TaskList))
      {
         return false;
      }
      TaskList other = (TaskList) obj;
      return this.tasks.equals(other.tasks);
   }
}
