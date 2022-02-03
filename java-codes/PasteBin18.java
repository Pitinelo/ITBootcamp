import java.util.Scanner;

//  Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).

public class PasteBin18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti pozitivan ceo broj: ");
        int n = sc.nextInt();
        double max = 0;
        double min = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Unesi vrednost broja " + i + ": ");
            double x = sc.nextDouble();
            if (i == 1) {
                max = min = x;
            }

            if (x > max) {
                max = x;
            }

            if (min > x) {
                min = x;
            }
        }

        System.out.println("Najmanji od svih unetih brojeva je " + min);
        System.out.println("Najveci od svih unetih brojeva je " + max);
    }
}
