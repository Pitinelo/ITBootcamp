import java.util.Scanner;

//Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0.
public class PasteBin2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Upisi ceo broj: ");
        int i = sc.nextInt();

        if (i > 0){
            System.out.println("Uneti broj je pozitivan.");
        }else if (i == 0){
            System.out.println("Uneti broj je neutralan");
        }else{
            System.out.println("Uneti broj je negativan.");
        }
    }
}
