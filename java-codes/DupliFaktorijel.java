import java.util.Scanner;

public class DupliFaktorijel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi vrednost promenljive n: ");
        int n = sc.nextInt();

        int dupliFaktorijel = 1;

        for (int i = n; i >=1; i = i -2){

            dupliFaktorijel = dupliFaktorijel * i;


        }

        System.out.println("Vrednost duplog faktorijela unetog broja n je: " + dupliFaktorijel);
    }
}
