import java.util.Scanner;

//Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
public class PasteBin4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Upisati negativan ceo broj: ");
        int n = sc.nextInt();

    // Petlja koja prolazi kroz sve brojeve od 0 do negativnog broja i radi ispis
        for (int i = 0; i >= n; i--){
            //print funkcionise tako sto od unetog negativno broja se oduzme i koji pocinje sa 0 i ide ka negativnoj vrednosti
            System.out.println((n-i));
        }
    }
}
