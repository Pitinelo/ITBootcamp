import java.util.Scanner;


//pravljenje mario piramide koristeci petlju u petlji
public class MarioPiramidaMojaVerzija {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //korisnik unosi visinu piramide
        System.out.print("Unesi visinu piramide: ");
        int visina = sc.nextInt();
    //petlja koja odredjuje visinu piramide i toliko se puta pokrece (i je postavljen na 1 zbog petlji u petlji - moglo je i da se resi drugacijim uslovima u drugim petljama)
        for (int i = 1; i <= visina; i++){
    // petlja koja prolazi od visine do vrednosti i (koja se povecava svaki put) i crta razmake kojih u prvom redu ima najvise
            for (int k = visina; k > i; k-- ){
                System.out.print(" ");
            }
    //petlja koja crta blokove i krece od vrednosti koja je 0 pokrece se dok ne bude jednaka i, koje se svakako pvoecava kada se opet udje u glavnu petlju, pa svaki put stampa vise blokova)
            for (int j = 0; j < i; j++){

                System.out.print("#");
            }

    //ovo je blok koji je samo u glavnoj petlji i koji stampa samo razmak  koji je potreban za mario piramidu
            System.out.print(" ");

    // jos jedna petlja u glavnoj petlji koja stampa blokove na identican nacin na koji je stampala i ona sa promenljivom j
            for (int x = 1; x <= i; x++ ){
                System.out.print("#");
            }
    //jos jedan print koji je samo u glavnoj petlji i sluzi za prelazak u novi red
            System.out.println();
        }


        }
    }

