package model;

import java.util.ArrayList;

public class Worker
{
private String fullName;
private String IDnr;
private ArrayList<String> Notes; 
private ArrayList<AnalysisList> training;

public Worker(String fullName, String IDnr)
{
   this.fullName=fullName;
   this.IDnr=IDnr;
}

public String getIDnr()
{
   return IDnr;
}

public void setID(String iDnr)
{
   IDnr = iDnr;
}

public String getFullName()
{
   return fullName;
}

public void setFullName(String fullName)
{
   this.fullName = fullName;
}

public ArrayList<String> getNotes()
{
   return Notes;
}

public void setNotes(ArrayList<String> notes)
{
   this.Notes = notes;
}

public void manageTraining(int index, AnalysisList training)
{
   
}

public ArrayList<AnalysisList> getTraining()
{
   return training;
}

public void setTraining(ArrayList<AnalysisList> training)
{
   this.training = training;
}



}
