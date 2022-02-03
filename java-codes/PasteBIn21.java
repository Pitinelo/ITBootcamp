import java.util.Scanner;

//Za unetu visinu h, iscrtati levu Mario kulu. Npr za h = 5:
//        |#
//        |##
//        |###
//        |####
//        |#####
//        (| obelezava pocetak reda i to ne crtate)

public class PasteBIn21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi visinu Mario kule: ");
        int n = sc.nextInt();

        String praznina = " ";
        String blok = "#";

        for (int i = 1; i <= n; i++){

            System.out.println(blok);
            blok = blok + "#";

        }

    }
}
