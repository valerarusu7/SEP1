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

   public boolean isLegal(String inputString)
   {
      String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
      String[] strlCharactersArray = new String[inputString.length()];
      for (int i = 0; i < inputString.length(); i++)
      {
         strlCharactersArray[i] = Character.toString(inputString.charAt(i));
      }
      int count = 0;
      for (int i = 0; i < strlCharactersArray.length; i++)
      {
         if (specialCharacters.contains(strlCharactersArray[i]))
         {
            count++;
         }
      }
      if (inputString != null && count == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
