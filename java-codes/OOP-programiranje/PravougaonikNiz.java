package KlaseOsnovne;



import java.util.Scanner;

public class PravougaonikNiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite koliko pravougaonika zelite da kreirate: ");
        int brojPravougaonika = sc.nextInt();

        Pravougaonik [] nizPravougaonika = new Pravougaonik[brojPravougaonika];

        for (int i = 0; i < brojPravougaonika; i++){

            System.out.print("Unesite duzinu " + (i+1) + ". pravoguaonika: ");
            double duzina = sc.nextDouble();

            System.out.print("Unesite sirinu " + (i+1) + ". pravougaonika: ");
            double sirina = sc.nextDouble();

            Pravougaonik p = new Pravougaonik(duzina, sirina);
            nizPravougaonika [i] = p;
        }

        for (int i = 0; i < brojPravougaonika; i++){
            Pravougaonik p = nizPravougaonika[i];
            System.out.println("Informacije o " + (i+1) + ". pravougaoniku: ");
            System.out.print(p);
            System.out.println("Obim pravougaonika je: " + p.obim());
            System.out.println("Povrsina pravougaonika je "  + p.povrsina());
            System.out.println();
        }
    }




}
