package Knjiga;

import Osoba.Osoba;

public class TestKnjiga {

    public static void main(String[] args) {

        Osoba o1 = new Osoba("Mesa", "Selimovic", 1888, 171);

        Osoba o2 = new Osoba("Dzejms", "S.A.Kori", 1973, 201);

        Osoba o3 = new Osoba("Marko", "Pejic", 1985, 184);

        Knjiga k1 = new Knjiga("Dervis i smrt", o1, 212, 2011);

        Knjiga k2 = new Knjiga("Sibola u plamenu",o2 , o3,  612, 2014 );

        Knjiga k3 = new Knjiga("Antigona", null,  135, 2002);

        System.out.print(k1);
        System.out.println(k1.velicinaKnjige() + "\n");

        System.out.print(k2);
        System.out.println(k2.velicinaKnjige() + "\n");

        System.out.print(k3);
        System.out.println(k3.velicinaKnjige() + "\n");
    }
}
