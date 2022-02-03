package knjiga;

import Osoba.Osoba;

public class TestKnjiga {

    public static void main(String[] args) {

        Osoba o1 = new Osoba("Marko", "Pejic", 1985, 184);

        Osoba o2 = new Osoba("Nil", "Gejmen", 1958, 175.1);

        Osoba o3 = new Osoba("Bill", "Simmons", 1965, 181.1);

        Knjiga k1 = new Knjiga("Americki bogovi", o2, 408, 2017);

        Knjiga k2 = new Knjiga("Book of basketball", o3, o1, 754, 2013);

        System.out.println(k2);
        System.out.println(k2.velicinaKnjige());

        System.out.println(k1);
        System.out.println(k1.velicinaKnjige());
    }
}
