package KlaseOsnovne;

import java.util.Scanner;

public class PokretanjeKrugaNiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Koliko krugova zelite da kreirate: ");
        int brojKrugova = sc.nextInt();

        Krug [] nizKrugova = new Krug[brojKrugova];

        for (int i = 0; i < brojKrugova; i++){

            System.out.print("Unesite poluprecnik kruga " + (i+1) + ". kruga: ");
            double poluprecnik = sc.nextDouble();
            Krug k = new Krug(poluprecnik);
            nizKrugova[i] = k;
        }

        for (int i = 0; i < brojKrugova; i++){
            Krug k = nizKrugova[i];
            System.out.println("Informacije o " + (i+1) + ". krugu:");
            System.out.print(k);
            System.out.println("Obim kruga je " + k.obimKruga());
            System.out.println("Povrsina kruga je " + k.povrsinaKruga());
            System.out.println();

        }


    }
}
