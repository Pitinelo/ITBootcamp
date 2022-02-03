import java.util.Scanner;

//Napravi program koji racuna prosecnu visinu svih kosarkasa u nekom timu u metrima, ispiosuje visinu najviseg i najnizeg igraca
public class KosarkaskiTim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] tim = new double[5];
        // ovde je potrebno da inicijalizujemo integere jer ukoliko to ne uradimo pre for petlje java nam nece dati da pokrenemo program, jer varijabla mozda nece biti inicirana
        double max = 0;
        double min = 0;

        double ukupnaVisina = 0;

        for (int i = 0; i < tim.length; i++){


            System.out.print("Upisi visinu igraca broj " + i + ": ");
            tim [i] = sc.nextDouble();
            ukupnaVisina = ukupnaVisina + tim[i];
        // podesavamo i min i max na visinu igraca na poziciji 0 u nizu, pa sve kasnije poredimo sa njim
            if( i==0) {
                max = min = tim[0];
            }
        // Pravimo proedjenje sa igram na mestu na kom se petlja nalazi u tom trenutku i ako je vece od dosadasnjeg max dodeljujemo tu vrednost max
            if (tim[i] > max){
                max = tim[i];
            }
            // Pravimo proedjenje sa igram na mestu na kom se petlja nalazi u tom trenutku i ako je vece od dosadasnjeg min dodeljujemo tu vrednost min
            if (tim[i] < min){
                min = tim[i];
            }
        }

        double prosecnaVisina = ukupnaVisina / 5;
        System.out.println("Prosecna visina igraac u ekipu je: "+ prosecnaVisina + ". " + "Najvisi igrac je visok " + max + "m, " + "a najnizi igrac je visok " + min + "m.");







    }
}
