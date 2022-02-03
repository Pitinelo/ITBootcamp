import java.util.Scanner;

public class Grananje1 {

    static Scanner scanner = new Scanner (System.in);


    public static void main(String[] args) {

        /*/  Napisati program koji proverava da li je uneti broj paran.
        Ukoliko jeste, program treba da ispise poruku: Broj je paran!
        Ukoliko nije, program treba da ispise poruku: Broj je neparan!
         */

        int a;

        System.out.print("Unesi vrednost za a:");
        a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println("Broj je paran!");
        }
        else {
            System.out.println("Broj je neparan!");
        }

        System.out.println("Kraj programa");
    }
}
