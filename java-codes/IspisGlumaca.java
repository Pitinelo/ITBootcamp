package Domaci;


//Test klasa koja sluzi za kreiranje objekata Klase glumci
public class IspisGlumaca {

    public static void main(String[] args) {

        Glumci glumac = new Glumci("Edward", "Norton", 'm', 52, 8.4, false);

        Glumci glumica = new Glumci("Scarlett", "Johansson", 'z', 37, 7.4, false);

        System.out.println(glumac);
        System.out.println(glumica);
    }
}
