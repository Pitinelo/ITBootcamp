package KlaseOsnovne;

public class PokretanjePravougaonik {

    public static void main(String[] args) {

        Pravougaonik pr1 = new Pravougaonik(6.2, 4.1);

        System.out.println(pr1);
        System.out.println("Obim pravougaonika iznosi " + pr1.obim());
        System.out.println("Povrsina pravougaonika iznosi " + pr1.povrsina());
    }
}
