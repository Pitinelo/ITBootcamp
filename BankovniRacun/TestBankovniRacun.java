package BankovniRacun;

import Osoba.Osoba;

public class TestBankovniRacun {

    public static void main(String[] args) {

        Osoba o1 = new Osoba("Marko", "Pejic", 1985, 184.1);

        Osoba o2 = new Osoba("Jovana", "Pejic", 1985, 171.2);

        BankovniRacun br1 = new BankovniRacun(o1, 6000);

        BankovniRacun br2 = new BankovniRacun(o2, 66000);

        System.out.println(br1);

        System.out.println(br2);

        br1.isplataSaRacuna(6100);

        System.out.println(br1);

    }




}
