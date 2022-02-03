import java.util.Scanner;


//Napraviti program ispisuje koliko dana, sati, minuta ili sekundi sadrzi odredjeni broj godina koje korisnik unese
public class BrojRazlicitihVremenskihOdrednicauGodinama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj godina: ");
        int godina = sc.nextInt();

        int rezultat;

        System.out.print("Unesite zeljenu kategoriju: ");
        String kategorija = sc.next();

        switch (kategorija){

            case "dan" :

                rezultat = godina * 365;
                System.out.println(godina + " godina je " + rezultat + " dana.");
                break;

            case "sat" :

                rezultat = godina * 365 * 24;
                System.out.println(godina + " godina je " + rezultat + " sati.");
                break;

            case "minut" :

                rezultat = godina * 365 * 24 * 60;
                System.out.println(godina + " godina je " + rezultat + " minuta.");
                break;

            case "sekund" :

                rezultat = godina * 365 *24 *60 *60;
                System.out.println(godina + " godina je " + rezultat + " sekundi.");
                break;

            default:
                System.out.println("Unesite ispravnu kategoriju.");
                break;

        }
    }
}
