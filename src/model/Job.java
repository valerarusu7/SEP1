package model;

import java.io.IOException;
import java.io.Serializable;

public class Job extends Task implements Serializable
{
   private boolean isTraining;
   private Worker trainer;
   private Analysis analysis;

   public Job(Worker who, MyDate start, Analysis analysis) throws IOException
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
      }
      if(this.analysis.equals(null)) throw new IOException();
   }

   public Job(MyDate start, Analysis analysis) throws IOException
   {
      super(start);
      this.isTraining = false;
      this.trainer = null;
      this.analysis = analysis;
   }

   public Job(Worker who, MyDate start, Analysis analysis, Worker trainer)
         throws IOException
   {
      super(who, start);
      this.isTraining = true;
      this.trainer = trainer;
      this.analysis = analysis;
      super.getWorker().addToTraining(analysis);
   }

   public Job(MyDate start, Analysis analysis, Worker trainer)
         throws IOException
   {
      super(start);
      this.isTraining = true;
      this.trainer = trainer;
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

   public boolean equals(Object obj) throws NullPointerException
   {
      if (super.equals(obj))
      {
         Job other = (Job) obj;
         return this.isTraining==other.isTraining && this.analysis.equals(other.analysis)
               && this.trainer.equals(other.trainer);
      }
      else
         return false;
   }
}
