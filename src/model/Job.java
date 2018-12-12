package model;

import java.io.IOException;

public class Job extends Task
{
   private boolean isTraining;
   private Worker trainer;
   private Analysis analysis;

   public Job(Worker who, MyDate start, Analysis analysis)
         throws NullPointerException, IOException
   {
      super(who, start);
      this.isTraining = false;
      this.trainer = null;
      for (int i = 0; i < super.getWorker().getTraining().getJobList()
            .size(); i++)
      {
         if (super.getWorker().getTraining().getJobList().get(i)
               .equals(analysis))
         {
            this.analysis = analysis;
            break;
         }
         else
            throw new IOException();
      }
   }

   public Job(Worker who, MyDate start, Analysis analysis, Worker trainer)
   {
      super(who, start);
      this.isTraining = true;
      this.trainer = this.trainer;
      this.analysis = analysis;
      super.getWorker().addToTraining(analysis);
   }

   public boolean getIsTraining()
   {
      return this.isTraining;
   }

   public Worker getTrainer() throws IOException
   {
      if (this.trainer.equals(null))
         throw new IOException();
      else
         return this.trainer;
   }

   public Analysis getAnalysis() throws IOException
   {
      if (this.analysis.equals(null))
         throw new IOException();
      else
         return this.analysis;
   }
}
