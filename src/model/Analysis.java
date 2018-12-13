package model;

import java.io.Serializable;

public class Analysis implements Serializable
{
   private String name;

   public Analysis(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public boolean equals(Object obj) throws NullPointerException
   {
      if (!(obj instanceof Analysis))
      {
         return false;
      }
      Analysis other = (Analysis) obj;
      return this.name.equals(other.name);
   }
}
