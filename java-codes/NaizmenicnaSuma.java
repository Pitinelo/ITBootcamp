import java.util.Scanner;
// Napraviti program koji od korisnika primi ceo broj, a onda izracunava koja je vrednost zbir svih neparnih brojeva manjih ili jednakih njemu i razliku svih parnih brojeva manjih ili jednakih njemu
public class NaizmenicnaSuma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi vrednost celog pozitivnog broja n: ");
        int n = sc.nextInt();

        int suma = 0;
        //petlja koja na pocetnu sumu koja je jednaka nuli dodaje neparne brojeve
        for ( int i = 1; i <= n; i = i+2){

            suma = suma + i;
        }
        //petlja koja od prethodnog izracunatog zbira neparnih brojeva oduzima sve parne brojeve
        for ( int k = 2; k <=n; k = k+2){

            suma = suma - k;
        }

        System.out.println("Vrednost naizmenicne sume je: " + suma);


    }
}
