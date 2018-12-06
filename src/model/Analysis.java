package model;


public class Analysis
{
   private String name;
   private boolean isTraining;
   private String trainer;
   

   public Analysis(String name, boolean isTraining, String trainer)
   {
      this.name = name;
      this.isTraining = false;
      this.trainer = trainer;
   }
   
   public String getTrainer()
   {
      return trainer;
   }
   
   public void setTrainer(String trainer)
   {
      this.trainer = trainer;
   }
   
   public String getName()
   {
      return name;
   }

   public boolean isTraining()
   {
      return isTraining;
   }
   
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Analysis))
      {
         return false;
      }
      Analysis other =(Analysis) obj;
     return this.name==other.name;
   }
}
