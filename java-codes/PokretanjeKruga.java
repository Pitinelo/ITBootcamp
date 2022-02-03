package KlaseOsnovne;

//klasa koja sluzi za pokratenje klase krug
public class PokretanjeKruga {

    public static void main(String[] args) {
        // kreirianje kruga
        Krug kr1 = new Krug(8.4);

        //pozivanje svih metoda iz kruga (toString, obigMruga, Povrsina)
        System.out.println(kr1);
        System.out.println("Obim kruga iznosi " + kr1.obimKruga() + " cm.");
        System.out.println("Povrsina kruga iznosi " + kr1.povrsinaKruga() + " cm2.");
    }
}
