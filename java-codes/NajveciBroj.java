import java.util.Scanner;


//Osnovno vezbanje za if i else if koje treba da uporedi vrednost brojeva i ispise najveci
public class NajveciBroj {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi vrednost broja x: ");
        int x = sc.nextInt();

        System.out.print("Unesi vrednost broja y: ");
        int y = sc.nextInt();

        System.out.print("Unesi vrednost broja z: ");
        int z = sc.nextInt();

    // grananje koje poredi vrednosti tri uneta broja i u prvom grananju stavlja da je x najveci broj ako je veci on druga dva, u drugoj za y, a u trecoj za z. U else if se koriste svi slucajevi upravo iz razloga ukoliko imam dva broja koja imaju najvecu vrednost
        if (x > y && x > z){
            System.out.println("Najvecu vrednost ima promenljiva x = " + x);
        }else if ( y > x && y > z){
            System.out.println("Najvecu vrednost ima promenljiva y = " + y);
        }else if( z > y && z > x){
            System.out.println("Najvecu vrednost ima promenljiva z = " + z);
        }else {
            System.out.println("Minimum dva broja imaju jednaku vrednost.");
        }
    }
}
