package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileManager
{
   private String filename;
   private File file;

   public FileManager(String filename)
   {
      this.filename = filename;
      this.file = new File(filename);
   }

   public void writeToBin(String filename, Object obj) throws IOException
   {
      switch (filename)
      {
         case "Workers.bin":
         {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = null;
            out = new ObjectOutputStream(fos);
            if (obj instanceof WorkerList)
            {
               WorkerList other = (WorkerList) obj;
               out.writeObject(other);
               out.close();
            }
            else
            {
               out.close();
               throw new IOException();
            }
         }
            break;

         case "Analysis.bin":
         {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = null;
            out = new ObjectOutputStream(fos);
            if (obj instanceof AnalysisList)
            {
               AnalysisList other = (AnalysisList) obj;
               out.writeObject(other);
               out.close();
            }
            else
            {
               out.close();
               throw new IOException();
            }
         }
            break;

         case "Schedule.bin":
         {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = null;
            out = new ObjectOutputStream(fos);
            if (obj instanceof TaskList)
            {
               TaskList other = (TaskList) obj;
               out.writeObject(other);
               out.close();
            }
            else
            {
               out.close();
               throw new IOException();
            }
         }
            break;

         case "Template.bin":
         {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = null;
            out = new ObjectOutputStream(fos);
            if (obj instanceof TaskList)
            {
               TaskList other = (TaskList) obj;
               out.writeObject(other);
               out.close();
            }
            else
            {
               out.close();
               throw new IOException();
            }
         }
            break;

         default:
         {
            throw new IOException();
         }
      }
   }

   public Object loadFromBin() throws IOException, ClassNotFoundException
   {
      switch (this.filename)
      {
         case "Workers.bin":
         {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = null;
            in = new ObjectInputStream(fis);
            WorkerList worker = (WorkerList) in.readObject();
            in.close();
            return worker;
         }

         case "Analysis.bin":
         {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = null;
            in = new ObjectInputStream(fis);
            AnalysisList analysis = (AnalysisList) in.readObject();
            in.close();
            return analysis;
         }

         case "Schedule.bin":
         {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = null;
            in = new ObjectInputStream(fis);
            TaskList master = (TaskList) in.readObject();
            in.close();
            return master;
         }

         case "Template.bin":
         {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = null;
            in = new ObjectInputStream(fis);
            TaskList template = (TaskList) in.readObject();
            in.close();
            return template;
         }

         default:
         {
            throw new IOException();
         }
      }
   }

   public void loadWorkersFromTxt() throws IOException
   {
      WorkerList workers = new WorkerList();
      Scanner in = new Scanner(file);
      while (in.hasNext())
      {
         String line = in.nextLine();
         String[] token = line.split(";");
         workers.addWorker(new Worker(token[0].trim(), token[1].trim()));
      }
      in.close();
      File rFile = new File("Workers.bin");
      FileOutputStream fos = new FileOutputStream(rFile, true);
      ObjectOutputStream out = null;
      out = new ObjectOutputStream(fos);
      out.writeObject(workers);
      out.close();
   }
}
