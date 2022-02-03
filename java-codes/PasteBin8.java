import java.util.Scanner;

//Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
//	"Dobrodosao u {x}. razred, {ime} {prezime}",
//	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
//    poruku od:
//	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

public class PasteBin8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi svoje ime: ");
        String ime = sc.next();

        System.out.print("Unesi svoje prezime: ");
        String prezime = sc.next();

        System.out.print("Unesi svoju godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();
    //dodat feature da bi ispis bio pravilnog pola
        System.out.print("Unesi svoj pol: ");
        char pol = sc.next().charAt(0);
    //izracunavanje razreda tako sto od tekuce godine oduzmemo godinu rodjenja i jos 6 godina kada je ulazak u godinu kada se krece u skolu
        int razred = 2021 - godinaRodjenja - 6;
    //Zavisno od toga da li je u skoli po zadatim postavkama zadatka program ispisuje odrdjenu poruku, a dodati feature ubacuje poruku u pravi pol
        if (razred >= 1 && razred <= 12) {
            if (pol == 'm') {
                System.out.println("Dobrodosao u " + razred + ". razred, " + ime + " " + prezime);
            } else if (pol == 'z') {
                System.out.println("Dobrodosla u " + razred + ". razred, " + ime + " " + prezime);
            }

        } else if (razred < 1) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        } else {
            if (pol == 'm') {
                System.out.println(ime + " " + prezime + " je zavrsio skolu.");
            } else if (pol == 'z') {
                System.out.println(ime + " " + prezime + " je zavrsila skolu.");

            }
        }
    }
}
