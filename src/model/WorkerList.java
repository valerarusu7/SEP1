package model;

import java.util.ArrayList;

public class WorkerList
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

public void removeWorker(int index)
{
   list.remove(index);
}

public Worker getWorker(int index) 
{
return list.get(index);
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

public Worker[] getWorkerByName(String name) {
   Worker[] listByName = new Worker[getNumberOfWorkersByName(name)];
   int index = 0;
   for (int i = 0; i <= list.size(); i++) {
      if (list.get(i).getFullName().equals(name)) {
         listByName[index] = list.get(i);
         index++;
      }
   }
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

public Worker[] getWorkerByIDnr(String IDnr) {
   Worker[] listByIDnr = new Worker[getNumberOfWorkersByName(IDnr)];
   int index = 0;
   for (int i = 0; i <= list.size(); i++) {
      if (list.get(i).getIDnr().equals(IDnr)) {
         listByIDnr[index] = list.get(i);
         index++;
      }
   }
   return listByIDnr;
}

public int getNumberOfWorkersByAnalysis(String name)
{
   int count = 0;
   for (int i = 0; i <= list.size(); i++) 
   {
      for (int j = 0; j <= list.get(i).getTraining().size(); j++)
      {
         for (int z = 0; z <=list.get(i).getTraining().size(); z++)
      if (list.get(i).getTraining().get(j).getAnalysis(z).getName().equals(name))
         count++;
      }
   }
   return count;
}

public Worker[] getWorkerByAnalysis(String name) {
   Worker[] listByAnalysis = new Worker[getNumberOfWorkersByAnalysis(name)];
   int index = 0;
   for (int i = 0; i <= list.size(); i++) 
   {
      for (int j = 0; j <= list.get(i).getTraining().size(); j++)
      {
         for (int z = 0; z <=list.get(i).getTraining().size(); z++)
      if (list.get(i).getTraining().get(j).getAnalysis(z).getName().equals(name))
         listByAnalysis[index] = list.get(i);
         index++;
      }
   }
   return listByAnalysis;
}


}



