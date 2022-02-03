package Domaci2712;
//Array liste
//Kreirajte array listu nekog vaseg interesovanje (npr sport)
//-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
//-iz liste dohvatite 3. element liste i ispisite
//-promenite naziv prvog elementa
//-uklonite 5. element
//-ispisite velicinu vase liste
//-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste

import java.util.ArrayList;

public class Sport {

    public static void main(String[] args) {
    //kreiranje array liste i dodavanje elemenata u istu
        ArrayList <String> sport = new ArrayList<>();
        sport.add("Kosarka");
        sport.add("Fudbal");
        sport.add("Americku fudbal");
        sport.add("Atletika");
        sport.add("F1");
        sport.add("MMA");
    // iscitavanje 3 elementa niza
        System.out.println("Na indexu 3 u nizu se nalazi sledeci String: " + sport.get(2) + "\n");
    //promena naziva prvog elementa niza
        sport.set(0,"Basket");
    //brisanje petog elementa niza
        sport.remove(4);
        System.out.println("Duzina niza je: " + sport.size() + "\n");
    //ispis elemenata niza kroz obicnu i "naprednu" for petlju
        System.out.println("U nizu se nalaze sledeci sportovi: ");
        for (String s: sport){
            System.out.println(s);
        }
        System.out.println("\n");

        System.out.println("U nizu se nalaze sledeci sportovi: ");
        for (int i = 0; i < sport.size(); i++){

            String s = sport.get(i);
            System.out.println(s);
        }

    }





}
