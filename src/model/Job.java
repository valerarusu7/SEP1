package model;

public class Job extends Task
{
   private boolean isTraining;
   private Analysis analysis;
   
   public Job(Worker who, MyDate start, Analysis analysis)
   {
      super(who, start);
      this.isTraining = false;
      for(int i = 0; i < super.getWorker().getTraining().size(); i++)
      {
         try
         {
            if(super.getWorker().getTraining().get(i).equals(analysis))
         }
      }
   }
   
   public boolean getIsTraining()
   {
      return this.isTraining;
   }
   
   
}
