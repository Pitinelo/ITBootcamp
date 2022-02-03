import java.util.Scanner;

//Korisnik unosi novac na racunu koji raspolaze kao i cenu nekog artikla. Na standardni izlaz ispisati koliko kopija tog
//	artika korisnik moze da kupi.
//

public class PasteBin25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite koliko novca imate na racunu: ");
        int racun = sc.nextInt();

        System.out.print("Unesite koliko novca kostaju patike: ");
        int cenaPatika = sc.nextInt();

        int suma =0;

        for (int i = racun; i >= cenaPatika; i = i - cenaPatika){

            suma = suma + 1;
        }

        System.out.println("Sa kolicinom novca na Vasem racunu mozete kupiti " + suma + " pari patika.");
    }
}
