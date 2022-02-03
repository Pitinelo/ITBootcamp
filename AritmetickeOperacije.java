import java.util.Scanner;
//napraviti program koji izvrsava odredjene aritmeticke operacije koje su unapred zadate sa dva broja koja unosi krajnjni korisnik preko konzole
public class AritmetickeOperacije {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Upisi vrednost promenljive x: ");
        int x = sc.nextInt();

        System.out.print("Upisi vrednost promenljive y: ");
        int y = sc.nextInt();

        int zbir = x + y;
        System.out.println("Zbir brojeva x i y je: " + zbir);

        int razlika = x - y;
        System.out.println("Razlika brojeva x i y je: " + razlika);

        int proizvod = x * y;
        System.out.println("Proizvod brojeva x i y je: " + proizvod);

        int kolicnik = x / y;
        System.out.println("Kolicnik brojeva x i y je: " + kolicnik);

        int ostatak = x % y;
        System.out.println("Ostatak deljenja brojeva x i y je: " + ostatak);



    }
}
