import java.util.Scanner;

//Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.
public class PasteBin1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Upisi ceo broj: ");
        int i = sc.nextInt();

        if (i % 2 ==0){
            System.out.println("Uneti broj je paran");
        }else {
            System.out.println("Uneti broj je neparan");
        }
    }
}
