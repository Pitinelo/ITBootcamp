public class MnozenjeSaOsam {
//kreiranje fje koja broji prosledjeni broj sa 8

    public static void main(String[] args) {

        int a = 6;
        int b = 3;
        int c = 5;
    // prosledjivanje brojeva fji koja mnozi sa osam i dobijanje njenih proizovda
        int d = mnozenjeSaOsam(a);
        System.out.println(d);

        int e = mnozenjeSaOsam(b);
        System.out.println(e);

        int f = mnozenjeSaOsam(c);
        System.out.println(f);
    }

    public static int mnozenjeSaOsam (int neki) {

        int x = neki * 8;
        return x;
    }
}
