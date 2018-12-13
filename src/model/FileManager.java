package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileManager
{
   private String filename;
   private File file;

   public FileManager(String filename)
   {
      this.filename = filename;
      this.file = new File(filename);
   }

   public void write(String filename, Object obj) throws IOException
   {
      switch (filename)
      {
         case "Workers.bin":
         {
            File file = new File(filename);
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
            File file = new File(filename);
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
            File file = new File(filename);
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
            File file = new File(filename);
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

   public ArrayList<Object> load(String filename)
   {
      switch (filename)
      {
         case "Workers.bin":
         {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = null;
            in = new ObjectInputStream(fis);
            
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
            File file = new File(filename);
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
            File file = new File(filename);
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
            File file = new File(filename);
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
   
}
