import java.util.Scanner;

//Za uneto m i n (intovi) iscrtati mxn sahovsku tablu, gde je beli polje oznaceno sa ' ' (space karakter),
//	a crno polje sa '.' (tacka). Uzeti da je gornje levo polje uvek crno. Npr za m = 3, n = 3:
//|. .|
//| . |
//|. .|

public class PasteBin23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite koliko je siroka sahovska tabla: ");
        int m = sc.nextInt();

        System.out.println("Unesite koliko je dugacka sahovska tabla: ");
        int n = sc.nextInt();
    //pravimo petlje u petlji da bismo mogli da iscrtamo zadatu tablu. Glavan petlja id od 1 do duzine, ukljucujuci i duzinu (potrebno je da krece sa 1 zbog deljenja)
        for (int i = 1; i <= n; i++) {
    //ovde moramo da postavimo grananje gde ukoliko je red duzine neparan, mora se poceti sa crnim poljem
            if (i % 2 == 1) {

                //a ovde pravimo petlju gde se ide ocrtavaju polja po duzini
                for (int j = 1; j <= m; j++) {

                    //i ovde je potreban uslov i grananje deljivosti, jer se tako odlucuje koju ce vrstu polja uneti, zavisno radi li se o neparnoj duzini ili parnoj
                    if (j % 2 == 1) {

                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }

                }
            }else {

                for (int k = 1; k <= m; k++ ){

                    if (k % 2 == 1){
                        System.out.print(" ");
                    }else {
                        System.out.print(".");
                    }
                }
            }

            System.out.println();
        }
    }
}


