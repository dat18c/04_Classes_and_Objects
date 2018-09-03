public class CarBrooker
{

   public static void main(String[] args)
   {
      //lav en ny bil
      Car myCar = new Car();
      System.out.println(myCar.motorSize);
      System.out.println(myCar.doors);
      System.out.println(myCar.model);
      System.out.println(myCar.licensePlate);
      
      myCar.motorSize = 4400;
      myCar.doors = 4;
      myCar.model = "Audi R8";
      myCar.licensePlate = "Min Audi";
      
      System.out.println(myCar.motorSize);
      System.out.println(myCar.doors);
      System.out.println(myCar.model);
      System.out.println(myCar.licensePlate);
      
   }

}