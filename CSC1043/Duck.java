public class Duck
{
   private int height = 5;
   private double weight;
   private double swimmingSpeed;
   
   public double getWeight()
   {
      return weight;
   }
   
   public void setWeight(double newWeight)
   {
      if(newWeight >= 0)
      {
         weight = newWeight;
      }
      else
      {
         weight = 0;
      }
   }
   
   public Duck(int height, double weight, double swimmingSpeed)
   {
      this.height = height;
      this.weight = weight;
      this.swimmingSpeed = swimmingSpeed;
   }
}