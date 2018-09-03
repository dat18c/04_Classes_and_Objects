public class CarBrooker
{

   public static void main(String[] args)
   {
      //lav en ny bil
      Car myCar = new Car();
      //System.out.println(myCar.motorSize);
      //System.out.println(myCar.doors);
      //System.out.println(myCar.model);
      //System.out.println(myCar.licensePlate);
      myCar.printCar();
      
      //initialiser myCar
      myCar.motorSize = 4400;
      myCar.doors = 4;
      myCar.model = "Audi R8";
      myCar.licensePlate = "Min Audi";
      myCar.printCar();
      /*System.out.println(myCar.motorSize);
      System.out.println(myCar.doors);
      System.out.println(myCar.model);
      System.out.println(myCar.licensePlate);
      */
      //lav ny instans af Car
      Car myOtherCar = new Car();
      //initialiser myOtherCar
      myOtherCar.motorSize = 1000;
      myOtherCar.doors = 4;
      myOtherCar.model = "Kia C\"eed";
      myOtherCar.licensePlate = "BB27.668";
      //udskriv myOtherCar
      myOtherCar.printCar();
      
      Car bil1 = new Car();
      Car bil2 = new Car();
      //...
      Car bil10 = new Car();
   }

}