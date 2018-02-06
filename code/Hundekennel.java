public class Hundekennel{

public static void main(String[] hundeparametre){
   //lav et par hunde
   Hund hund1 = new Hund();
   Hund hund2 = new Hund(); 

   //udskriv hund1
   System.out.println("Navn:\t\t" + hund1.navn);
   System.out.println("Alder:\t" + hund1.alder + " mdr");
   System.out.println("Vaegt:\t" + hund1.vaegt + " kg");
   System.out.println("Farve:\t" + hund1.farve + "\n");

   //sæt attributer for hunde
   hund1.navn = "Pluto";
   hund1.alder = 10;
   hund1.vaegt = 25;
   
   hund2.navn = "Jerry";
   hund2.alder = 2;
   hund2.farve = "grå";
   
   //udskriv hunde
   System.out.println("Navn:\t\t" + hund1.navn);
   System.out.println("Alder:\t" + hund1.alder + " mdr");
   System.out.println("Vaegt:\t" + hund1.vaegt + " kg");
   System.out.println("Farve:\t" + hund1.farve + "\n");
   
   System.out.println("Navn:\t\t" + hund2.navn);
   System.out.println("Alder:\t" + hund2.alder + " mdr");
   System.out.println("Vaegt:\t" + hund2.vaegt + " kg");
   System.out.println("Farve:\t" + hund2.farve + "\n");
   
}
}