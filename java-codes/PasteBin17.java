import java.util.Scanner;

public class PasteBin17 {

//Uneti double konstante a, b, c, a zatim i pozitivan ceo broj n. Zatim se unose n double brojeva jedan po jedan. Cim se unese jedan od tih brojeva, na standardni izlaz (tj. konzola) ispisuje se resenje polinoma: a*x^2 + b*x + c. [Ovaj zadatak je dosta komplikovan!]


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 3.1;
        double b = 4.4;
        double c = 2.2;

        System.out.print("Unesi pozitivan ceo broj: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){

            System.out.print("Unesi vrednost broja " + i + ": ");
            double x = sc.nextDouble();
            double y = Math.pow((a * x), 2) + b * x + c;
            System.out.println("x je jednako: " + y);
        }

    }
}
