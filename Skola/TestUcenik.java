package Skola;


import java.util.ArrayList;

public class TestUcenik {

    public static void main(String[] args) {

        ArrayList o1 = new ArrayList();
        o1.add(5);
        o1.add(1);


        ArrayList o2 = new ArrayList();
        o2.add(5);
        o2.add(5);
        o2.add(5);
        o2.add(5);
        o2.add(5);
        o2.add(5);


        Ucenik u1 = new Ucenik("Marko", "Pejic", o1);

        Ucenik u2 = new Ucenik("Strahinja", "Pejic", o2);


        u1.setOcene(o1);

        Odeljenje od1 = new Odeljenje("IV3");
        od1.upisiUcenika(u1, 0);
        od1.upisiUcenika(u2, 1);

        od1.pogledajOcene(u1);

        od1.prosecnaOcena(0);

        od1.prosecnaOcena(1);

        od1.pogledajOcene(u2);

        System.out.println("Prosecna ocena celog odeljenja je: " + od1.prosecnaOcenaOdeljenja());

        od1.opisnaOcena(u1);

        System.out.println(od1.izlistajDnevnik());

        System.out.println(od1.velicinaOdeljenja());

        System.out.println(od1.toString());

        

        System.out.println(od1.toString());


         //  System.out.println(u1);
        //   System.out.println(u1.prosecnaOcena(o1));


    }


}
