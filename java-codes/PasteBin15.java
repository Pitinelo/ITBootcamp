import java.util.Scanner;

//Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).

public class PasteBin15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //korisnik unosi koliko brojeva zeli da sabere
        System.out.print("Unesi pozitivan, ceo broj n: ");
        int n = sc.nextInt();

        double suma = 0;

        // petlja koja trazi od korisnika da unose brojeve onoliko puta koliko je on prethodno odlucio i sabira ih
        for (int i = 1; i <= n; i++){

            System.out.print("Unesi vrednost broja " + i + ": ");
            double x = sc.nextDouble();

            suma = suma + x;

        }

        System.out.println("Zbir brojeva je " + suma + ".");
    }
}
