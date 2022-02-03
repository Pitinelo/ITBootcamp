package KlaseOsnovne;

import java.util.Scanner;


//Klasa koja kreira osoba, ali na nacin koji trazi od korisnika da ukuca odredjene podatke
public class PokretanjeOsobe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite vase ime: ");
        String ime1 = sc.next();

        System.out.print("Unesite vase prezime: ");
        String prezime1 = sc.next();

        System.out.print("Unesite vasu godinu rodjenja: ");
        int godinaRodjenja1 = sc.nextInt();

        System.out.print("Unesite vasu visinu: ");
        double visina1 = sc.nextDouble();

        Osoba prviKorisnik = new Osoba(ime1, prezime1, godinaRodjenja1, visina1);
        System.out.println(prviKorisnik);
    }
}
