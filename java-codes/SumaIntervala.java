import java.util.Scanner;

public class SumaIntervala {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi ceo broj m: ");
        int m = sc.nextInt();

        System.out.print("Unesi ceo broj n koji je veci ili jednak broju m: ");
        int n = sc.nextInt();

        int suma = 0;

        if( m > n){

            System.out.println("Broj m mora biti manji ili jednak broju n!");
        }
        else if ( m == n) {

            suma = suma + m + n;
            System.out.println("Suma intervala brojeva m = " + m + " i n = " + n + " jednaka je: " + suma);
        }

        else{


        for ( int i = m; i <= n; i++){

            suma = suma + i;
        }

            System.out.println("Suma intervala brojeva m = " + m + " i n = " + n + " jednaka je: " + suma);
        }

    }

}
