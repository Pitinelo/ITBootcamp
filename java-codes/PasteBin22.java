import java.util.Scanner;

//Za unetu visinu h, iscrtati desnu Mario kulu. Npr za h = 5:
//|    #
//|   ##
//|  ###
//| ####
//|#####

public class PasteBin22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi visinu Mario kule: ");
        int n = sc.nextInt();


        String blok = "#";

        for (int i = 1; i <= n; i++){

            for (int j = n; j > i; j--){

                System.out.print(" ");
            }

            System.out.println(blok);
            blok = blok + "#";

        }
    }
}
