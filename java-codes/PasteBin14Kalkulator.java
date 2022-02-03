import java.util.Scanner;

//Napraviti digitron koji prima double, char, double, gde je char neki od simbola: {+, -, *, /, %, ^} i ispisuje resenje odgovarajuce operacije.
// Verovatno je bilo elegantije to resiti sa switch f-jom, ali je tada nismo ucili

public class PasteBin14Kalkulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //korisnik unosi brojeve putem skenera
        System.out.print("Unesi vrednost broja x: ");
        double x = sc.nextDouble();

        System.out.print("Unesi vrednost broja y: ");
        double y = sc.nextDouble();

    //korisnik unosi odredjenu matematicku operaciju, a mi mu pomazemo da izabere pravi karakter za to
        System.out.print("Unesi matematicku operaciju (+, - , * , / , % , ^ ): ");
        char operacija = sc.next().charAt(0);

    //grananje koje na osnovui izbora korisnika sprovodi matematicku ooepraciju
        if (operacija == '+'){

            double zbir = x + y;
            System.out.println("Zbir x i y je: " + zbir);

        }else if (operacija == '-'){

            double razlika = x - y;
            System.out.println("Razlika x i y je: " + razlika);

        }else if (operacija == '*'){

            double proizvod = x * y;
            System.out.println("Proizvod x i y je: " + proizvod);
        }else if (operacija == '/'){

            double kolicnik = x / y;
            System.out.println("Kolicnik x i y je:" + kolicnik);

        }else if (operacija == '%'){

            double ostatak = x % y;
            System.out.println("Ostatak deljenja brojeva x i y je: " + ostatak);
        }else if (operacija == '^'){

            double square = Math.pow(x, y);
            System.out.println("X na y je: " + square);

        }
    }
}
