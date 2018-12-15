package model;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class WorkerList implements Serializable
{
   private ArrayList<Worker> list;

   public WorkerList()
   {
      this.list = new ArrayList<>();
   }

   public void addWorker(Worker worker)
   {
      list.add(worker);
   }

   public void removeWorker(Worker worker)
   {
      list.remove(worker);
   }

   public Worker getWorker(int index)
   {
      return list.get(index);
   }

   public int getSize()
   {
      return this.list.size();
   }

   public ArrayList<Worker> getWorkers()
   {
      return this.list;
   }

   public int getNumberOfWorkersByName(String name)
   {
      int count = 0;
      for (int i = 0; i <= list.size(); i++)
      {
         if (list.get(i).getFullName().equals(name))
            count++;
      }
      return count;
   }

   public ArrayList<Worker> getWorkersByName(String name) throws IOException
   {
      ArrayList<Worker> listByName = new ArrayList<Worker>();
      for (int i = 0; i <= list.size(); i++)
      {
         if (list.get(i).getFullName().equals(name))
         {
            listByName.add(list.get(i));
         }
      }
      if (listByName.size() == 0)
         throw new IOException("There doesn't exist anyone by that name");
      else
         return listByName;
   }

   public int getNumberOfWorkersByIDnr(String IDnr)
   {
      int count = 0;
      for (int i = 0; i <= list.size(); i++)
      {
         if (list.get(i).getIDnr().equals(IDnr))
            count++;
      }
      return count;
   }

   public ArrayList<Worker> getWorkersByIDnr(String IDnr) throws IOException
   {
      ArrayList<Worker> listByIDnr = new ArrayList<Worker>();
      for (int i = 0; i <= list.size(); i++)
      {
         if (list.get(i).getIDnr().equals(IDnr))
         {
            listByIDnr.add(list.get(i));
         }
      }
      if (listByIDnr.size() == 0)
         throw new IOException("There doesn't exist anyone by that ID");
      else
         return listByIDnr;
   }

   public int getNumberOfWorkersByAnalysis(String name)
   {
      int count = 0;
      for (int i = 0; i <= list.size(); i++)
      {
         for (int j = 0; j <= list.get(i).getTraining().getJobList()
               .size(); j++)
         {
            for (int z = 0; z <= list.get(i).getTraining().getJobList()
                  .size(); z++)
               if (list.get(i).getTraining().getJobList().get(j).getName()
                     .equals(name))
                  count++;
         }
      }
      return count;
   }

   public ArrayList<Worker> getWorkersByAnalysis(String name) throws IOException
   {
      ArrayList<Worker> listByAnalysis = new ArrayList<Worker>();
      for (int i = 0; i <= list.size(); i++)
      {
         for (int j = 0; j <= list.get(i).getTraining().getJobList()
               .size(); j++)
         {
            for (int z = 0; z <= list.get(i).getTraining().getJobList()
                  .size(); z++)
               if (list.get(i).getTraining().getJobList().get(j).getName()
                     .equals(name))
                  listByAnalysis.add(list.get(i));
         }
      }
      if (listByAnalysis.size() == 0)
         throw new IOException("There doesn't exist anyone by that analysis");
      else
         return listByAnalysis;
   }

   public Worker getWorkerByName(String name) throws IOException 
   {
      for (int i = 0; i <= list.size(); i++)
      {
         if (list.get(i).getFullName().equals(name))
            return list.get(i);
      }
      throw new IOException("There doesn't exist anyone by that name");
   }

   public Worker getWorkerByID(String ID) throws IOException
   {
      for (int i = 0; i <= list.size(); i++)
      {
         if (list.get(i).getIDnr().equals(ID))
            return list.get(i);
      }
      throw new IOException("There doesn't exist anyone by that ID");
   }

   public ArrayList<String> getNotesByName(String name) throws IOException
   {
      for (int i = 0; i <= list.size(); i++)
      {
         if (list.get(i).getFullName().equals(name))
            this.list.get(i).getNotes();
      }
      throw new IOException("No notes exist for this worker");
   }

   public AnalysisList getTrainingByName(String name) throws IOException
   {
      for (int i = 0; i <= list.size(); i++)
      {
         if (list.get(i).getFullName().equals(name))
            this.list.get(i).getTraining();
      }
      throw new IOException("No training exists for this worker");
   }
}
