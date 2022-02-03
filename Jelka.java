import java.util.Scanner;

//nacrtati jelku uz pomoc petlje u petlji (

public class Jelka {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi visinu jelke: ");
        int h = sc.nextInt();


        String z = "*";

        for (int i = 0; i < h; i++) {

            for (int x = h; x >= i; x--){
                System.out.print(" ");
            }
            System.out.println(z);
            z = z + "**";
        }
        System.out.println();
    }
}
