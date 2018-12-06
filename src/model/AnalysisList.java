package model;

import java.util.ArrayList;

public class AnalysisList

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

   public void removeAnalysis(int index)
   {
      jobs.remove(index);
   }

   public Analysis getAnalysis(int index) 
   {
   return jobs.get(index);
   }


}
