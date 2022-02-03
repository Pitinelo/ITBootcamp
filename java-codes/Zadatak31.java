import java.util.Scanner;
// Napisati funkciju koja racuna proizvod 3 broja.
public class Zadatak31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //korisnik unosi vrednosti tri cela broja preko skenera
        System.out.print("Unesi vrednost x: ");
        int x = sc.nextInt();

        System.out.print("Unesi vrednost y: ");
        int y = sc.nextInt();


        System.out.print("Unesi vrednost z: ");
        int z = sc.nextInt();


    //u ovoj f-ji isipis mi prosledjujemo metodi mnozenje brojeve koje je korisnik prethodno uneo
        System.out.println("Proizvod navedenih brojeva je " + mnozenje(x,y,z));




    }
    //kreirana f-ja kojoj prosledjujemo tri broja i u njoj izracunavamo prozivod ta tri broja i vracamo rezultat
    public static int mnozenje (int a, int b, int c){

        int x = a * b * c;
        return x;
    }
}
