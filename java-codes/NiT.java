import java.util.Scanner;
// napraviti program koji racuna zbir svoh brojeva manjih od unetog broja, ali i svih brojeva koji su manji od njega
public class NiT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti pozitivan ceo broj: ");
        int n = sc.nextInt();

        int suma = 0;

        for (int t = 1; t < n; t++){

            suma = suma + (t-1);

            System.out.println("Zbir svih brojeva manjih od unetog broja je: (" + t + ") " +  suma);

        }

    }
}
