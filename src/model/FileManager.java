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
               throw new IOException("You're trying to fit something different than a WorkerList into the Worker bin");
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
               throw new IOException("You're trying to fit something different than an AnalysisList into the Analysis bin");
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
               throw new IOException("You're trying to fit something different than a TaskList into the Master Schedule bin");
            }
         }
            break;

         case "TemplateS.bin":
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
               throw new IOException("You're trying to fit something different than a TaskList into the Small Template bin");
            }
         }
            break;
            
         case "TemplateL.bin":
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
               throw new IOException("You're trying to fit something different than a TaskList into the Large Template bin");
            }
         }
            break;

         default:
         {
            throw new IOException("The filename does not match with the bin files, please try again");
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

         case "TemplateS.bin":
         {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = null;
            in = new ObjectInputStream(fis);
            TaskList template = (TaskList) in.readObject();
            in.close();
            return template;
         }
         
         case "TemplateL.bin":
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
            throw new IOException("The filename does not match with the bin files, please try again");
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
