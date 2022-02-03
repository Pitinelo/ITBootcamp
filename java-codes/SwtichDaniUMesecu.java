import java.util.Scanner;

public class SwtichDaniUMesecu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*/ Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana.
         (Vodite racuna o prestupnoj godini!). Uradjeno na nacin da je moguce upisati godine i PNE.
         */
        int godina;
        String mesec;

        System.out.print("Unesi godinu: ");
        godina = scanner.nextInt();

        System.out.print("Unesi mesec: januar, februar, mart, april, maj, jun, jul, avgust, septembar, " +
                "oktobar, novembar, decembar ");

        mesec = scanner.next();

        if (mesec.equals("januar")  || mesec.equals ("mart") || mesec.equals ("maj") ||
                mesec.equals  ("jul") || mesec.equals ("avgust") ||
                mesec.equals ("oktobar") || mesec.equals ("decembar") ) {

            System.out.println("Mesec ima 31 dan.");
        }
        else if (mesec.equals("april")  || mesec.equals ("jun") || mesec.equals ("septembar") ||
                mesec.equals  ("novembar")) {

            System.out.println("Mesec ima 30 dana.");
        }
        else if (godina % 4 != 0 && mesec.equals("februar") ) {
            System.out.println("Mesec ima 28 dana.");
        }
        else if (godina % 4 == 0 && mesec.equals("februar")) {
            System.out.println("Mesec ima 29 dana.");
        }
        else{
            System.out.println("Uneli ste pogresne podatke.");
        }

        System.out.println("Kraj programa");




    }
}
