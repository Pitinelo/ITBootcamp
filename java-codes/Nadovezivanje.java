public class Nadovezivanje {
// kreiraj niz koji se sastoji iz svih elemenata dva prethodno kreirana niza

    public static void main(String[] args) {

        int[] niz = {1, 2, 3, 4};
        int[] niz2 = {5, 6, 7, 8, 9, 10};
        int [] niz3 = produzeniNiz(niz,niz2);
    // kreiranje petlje koja na lepsi nacin ispisuje elemente nekog niza
        System.out.print("{");
        for (int i =0; i < niz3.length; i++){
            if( i != niz3.length - 1){
                System.out.print(niz3[i] + ", ");
            }else {
                System.out.print(niz3[i]);
            }

        }
        System.out.println("}");
    }

    //kreiranje metoda koja kreira novi niz koji je u stvari skup dva prethodno napravljena niz prosledjena ovoj metodi

    public static int[] produzeniNiz(int[] x, int[] y) {
        // kreiranje brojaca koji je potrebanda bi se svi clanovi prethodnih nizova upisali na prava mesta
        int brojac = 0;
        // kreiranje novog niza koji ima duzina koja je zbir duzine prethodna dva
        int[] produzeni = new int [x.length + y.length];

        // kreiranje petlja koja upisuje elemente prosledjenog niza na prva mesta u novonastalom nizu
        for (int i = 0; i < x.length; i++) {

            produzeni[brojac] = x[i];
            brojac++;
        }

        // kreiranje petlja koja upisuje elemente prosledjenog niza na naredna mesta u nizu (to postizemo brojacem)
        for (int i = 0; i < y.length; i++) {

            produzeni[brojac] = y[i];
            brojac++;
        }

        return produzeni;
    }

}
