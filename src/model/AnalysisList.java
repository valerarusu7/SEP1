package model;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class AnalysisList implements Serializable
{
   private ArrayList<Analysis> jobs;

   public AnalysisList()
   {
      this.jobs = new ArrayList<>();
   }

   public void addWorker(Analysis Analysis)
   {
      jobs.add(Analysis);
   }

   public ArrayList<Analysis> getJobList()
   {
      return this.jobs;
   }

   public Analysis getAnalysis(String name) throws IOException
   {
      for (int i = 0; i < this.jobs.size(); i++)
      {
         if (this.jobs.get(i).getName().equals(name))
         {
            return this.jobs.get(i);
         }
      }
      throw new IOException();
   }

   public boolean equals(Object obj) throws NullPointerException
   {
      if (!(obj instanceof AnalysisList))
      {
         return false;
      }
      AnalysisList other = (AnalysisList) obj;
      return this.jobs.equals(other.jobs);
   }
}
