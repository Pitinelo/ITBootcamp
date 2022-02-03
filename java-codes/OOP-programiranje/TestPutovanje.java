package Putovanje;

//

import Automobil.Automobil;
import Osoba.Osoba;


import java.util.ArrayList;

public class TestPutovanje {

    public static void main(String[] args) {

        Grad g1 = new Grad("Pariz", 11000000, "Francuska");

        Grad g2 = new Grad("Budimpesta",3250000, "Madjarska" );

        Osoba o1 = new Osoba("Marko", "Pejic", 1985, 184);

        Osoba o2 = new Osoba("Jovana", "Pejic", 1985,173);

        Osoba o3 = new Osoba("Dejan", "Mikic", 1986, 198);

        Automobil a1 = new Automobil("KIA", "Juzna Koreja", 2015, 118000 );


        Putovanje p1 = new Putovanje(g1, o1, a1, 3000);

        System.out.println(p1);

        p1.prijava(o2);

        p1.odjava(o3);

        System.out.println(p1);

        Grad stampa = p1.getDestinacija();

        System.out.println("Vreme potrebno da se dodje do " + stampa.getImeGrada() + " " + " je " + p1.vreme(110) + "h.");

    }








}
