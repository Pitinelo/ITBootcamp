import java.util.Scanner;
//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati proizvod elemenata tog niza.
public class Zadatak30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi duzinu niza: ");
        int a = sc.nextInt();

        int [] niz = new int [a];

        for (int i = 0; i < niz.length; i++){
            System.out.print("Unesi broj: ");
            int b = sc.nextInt();
            niz[i] = b;
        }

        System.out.println("Proizvod svih brojeva u nizu je jednak " + mnozenje(niz));



    }
    //kreiranje posebne f-je koja izracunava proizvod svih elemenata odredjenjog niza
    public static int mnozenje (int [] niz){
        // pocetnu vrednost proizvoda je potrebno postaviti na 1 , jer mnozenje sa nulom daje kao krajnji rezultat 0
        int prozivod = 1;
        for (int i = 0; i < niz.length; i++){
            prozivod = prozivod * niz[i];
        }

        return prozivod;
}


}
