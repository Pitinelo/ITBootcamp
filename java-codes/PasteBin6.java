import java.util.Scanner;

//Ispisati proizvod prvih n celih brojeva [1, n].

public class PasteBin6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi pozitvan ceo broj: ");
        int n = sc.nextInt();

        int proizvod = 1;
        for (int i = 1; i <= n; i++){
            proizvod = proizvod * i;
        }
        System.out.println("Prozivod svih N celih brojeva je: " + proizvod);
    }
}
