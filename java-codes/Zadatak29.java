import java.util.Scanner;
//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz
//Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
public class Zadatak29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi duzinu niza: ");
        int a = sc.nextInt();

        int [] niz = new int[a];

        for(int i = 0; i < niz.length; i++){
            System.out.print("Unesi broj: ");
            int b = sc.nextInt();
            niz[i] = b;
        }

        preskok(niz);
    }
    //Kreiranje posebne f-je koja ispisuje svaki treci element niza pocevsi od poslednjeg
    public static void preskok(int [] niz){

        for (int i = (niz.length - 1); i >=0; i = i -3){

            System.out.print(niz[i] + " ");
        }
    }
}
