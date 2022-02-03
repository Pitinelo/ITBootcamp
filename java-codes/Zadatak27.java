import java.util.Scanner;
//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
public class Zadatak27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //Korisnik unosi duzinu niza
        System.out.print("Uneti koliko brojeva sadrzi niz: ");
        int x = sc.nextInt();

        int [] niz = new int [x];
    //petlja u kojoj korisnik unosi sve elemente nekog niza
        for (int i = 0; i < niz.length; i++){
            System.out.print("Unesi broj: ");
            int a = sc.nextInt();
            niz[i] = a;
        }
    //petlja koja ispisuje svaki drugi element prethodno kreiranog niza
        for (int i = 0; i < niz.length; i +=2){
            System.out.print(niz[i] + " ");
        }


    }
}
