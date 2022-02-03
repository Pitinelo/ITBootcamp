import java.util.Scanner;
// napraviti program koji racuna faktorijel od broja koji krajnji korisnik unosi preko konzole
public class Faktorijel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti pozitivan realan broj: ");
        int n = sc.nextInt();

        int suma = 1;

        for (int i = 1; i <=n; i++){

            suma = suma *i;
        }

        System.out.println("Faktorijel od unesenog broja je: " + suma);
    }
}
