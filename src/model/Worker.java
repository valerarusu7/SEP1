package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Worker implements Serializable
{
   private String fullName;
   private String IDnr;
   private ArrayList<String> notes;
   private AnalysisList training;

   public Worker(String fullName, String IDnr)
   {
      this.fullName = fullName;
      this.IDnr = IDnr;
      this.notes = new ArrayList<>();
      this.training = new AnalysisList();
   }

   public Worker(String fullName, String IDnr, ArrayList<String> notes,
         AnalysisList training)
   {
      this.fullName = fullName;
      this.IDnr = IDnr;
      this.notes = notes;
      this.training = training;
   }

   public String getIDnr()
   {
      return IDnr;
   }

   public void setID(String iDnr)
   {
      this.IDnr = iDnr;
   }

   public String getFullName()
   {
      return this.fullName;
   }

   public void setFullName(String fullName)
   {
      this.fullName = fullName;
   }

   public ArrayList<String> getNotes()
   {
      return this.notes;
   }

   public void setNotes(ArrayList<String> notes)
   {
      this.notes = notes;
   }

   public void addToTraining(Analysis training)
   {
      this.training.addWorker(training);
   }

   public AnalysisList getTraining()
   {
      return this.training;
   }

   public void setTraining(AnalysisList training)
   {
      this.training = training;
   }

   public boolean equals(Object obj) throws NullPointerException
   {
      if (!(obj instanceof Worker))
      {
         return false;
      }
      Worker other = (Worker) obj;
      return this.fullName.equals(other.fullName)
            && this.IDnr.equals(other.IDnr)
            && this.training.equals(other.training)
            && this.notes.equals(other.notes);
   }

}
