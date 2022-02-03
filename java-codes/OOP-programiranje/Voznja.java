package Domaci;


//Klasa koja sluzi za kreiranje objketa kalse Automobil
public class Voznja {

    public static void main(String[] args) {

        Automobil auto1 = new Automobil("KIA", "Ceed SW", 11445587, "Marko Pejic");

        Automobil auto2 = new Automobil("Ford" , "Fiesta", 55443789);

        Automobil auto3 = new Automobil("BMW", "X5", 22669874, "Milos Petrovic");

        System.out.println(auto1);
        System.out.println(auto2);

        System.out.println("Marka automobila je " + auto3.getMarka());
        System.out.println("Model automobila je " + auto3.getModel());
        System.out.println("Serijski broj automobila je " + auto3.getSerijskiBroj());
        System.out.println("Vlasnik automobila je " + auto3.getVlasnik() + "\n");


        auto3.setVlasnik("Dejan Jankovic");

        System.out.println("Marka automobila je " + auto3.getMarka());
        System.out.println("Model automobila je " + auto3.getModel());
        System.out.println("Serijski broj automobila je " + auto3.getSerijskiBroj());
        System.out.println("Vlasnik automobila je " + auto3.getVlasnik());


    }
}
