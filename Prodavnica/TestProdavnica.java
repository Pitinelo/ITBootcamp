package Prodavnica;

import Osoba.Osoba;

import java.util.ArrayList;


public class TestProdavnica {

    public static void main(String[] args) {

        Proizvod p1 = new Proizvod("Milka Cokolada", 130, "Mlecna cokolada" , 100);

        Proizvod p2 = new Proizvod("Jogurt Balans", 170, 1000);

        ProizvodNaStajanju pns1 = new ProizvodNaStajanju(p1, 4);

        ProizvodNaStajanju pns2 = new ProizvodNaStajanju(p2, 8);

        Osoba o1 = new Osoba("Marko", "Pejic", 1985,184);

        Osoba o2 = new Osoba("Beki", "Belini", 1962, 181);

        Racun r1 = new Racun("25.12.2021.", o1, o2 );

        Prodavnica pro1 = new Prodavnica("Beki", "Ugrinovacka 146" );

        pro1.zaposlenje(o2);



        pro1.inicijalnoStanje(pns1);
        pro1.inicijalnoStanje(pns2);

        pro1.dodavanjeProizvodaNaStajanje(pns1,22);

       r1.dodajProizvod(p2);

    //   pro1.dodavanjeProizvodaNaStajanje(pns1, 4);


      //  System.out.println(r1);

        r1.dodajProizvod(p1);

     //   System.out.println(r1);

        System.out.println(pro1);

        ArrayList<Proizvod> kp1 = new ArrayList<Proizvod>();
        kp1.add(p1);
        kp1.add(p1);
        kp1.add(p2);


        System.out.println(pro1.kreiraniRacun(o1, kp1));




    }




}
