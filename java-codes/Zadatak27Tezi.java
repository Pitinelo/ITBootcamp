import java.util.Scanner;
//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
//Primer: [1, 2, 3, 4, 5] -> 1 3 5
//27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
public class Zadatak27Tezi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti koliko brojeva sadrzi niz: ");
        int x = sc.nextInt();

        int [] niz = new int [x];

        for (int i = 0; i < niz.length; i++){
            System.out.print("Unesi broj: ");
            int a = sc.nextInt();
            niz[i] = a;
        }

        preskok(niz);


    }

    public static void preskok(int [] niz ){


        for (int i = 0; i < niz.length; i+=2){
            System.out.println(niz[i] + " ");
        }



    }
}

