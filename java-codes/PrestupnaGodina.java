import java.util.Scanner;


//Napraviti program koji ispisuje da li je neka godina prestupna

public class PrestupnaGodina {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite godinu: ");
        int godina = sc.nextInt();

        if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0){

            System.out.println("Godina je prestupna.");
        }else {

            System.out.println("Godina nije prestupna.");
        }
    }
}
