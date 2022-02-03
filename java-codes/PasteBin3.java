import java.util.Scanner;

//Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
public class PasteBin3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi pozitivan ceo broj: ");
        int n = sc.nextInt();
//petlja koja ispisuje sve brojeve koji su manji od unetog broja, ukljucujuci i taj broj
        for (int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }
}
