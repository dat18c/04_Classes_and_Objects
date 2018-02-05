public class Broker{

   public static void main(String[] args){
      Car minBil = new Car();
      minBil.brand = "Kia";
      minBil.model = "C'eed";
      minBil.year = 2016;
      
      System.out.println("Mærke: " + minBil.brand);
      System.out.println("Model: " + minBil.model);
      System.out.println("Årgang: " + minBil.year);
      //System.out.println(minBil);
   }
}