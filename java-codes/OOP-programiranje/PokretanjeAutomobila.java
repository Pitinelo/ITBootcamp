package KlaseOsnovne;


//Klasa u kojoj se kreiraju objekti klase Automobil
public class PokretanjeAutomobila {

    public static void main(String[] args) {
    //kreiranje dva objekta autobila
        Automobilcic auto1 = new Automobilcic("KIA", "Ceed SW", 2015, 117300);

        Automobilcic auto2 = new Automobilcic("Ford", "Fiesta", 2012, 131500);

        System.out.println(auto1);

        System.out.println(auto2);
    }
}
