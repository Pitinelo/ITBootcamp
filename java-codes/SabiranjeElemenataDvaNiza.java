public class SabiranjeElemenataDvaNiza {
// Napraviti jedan niz u main metodi, a drugi u novoj metodi, a zatim kreirati potpuno novi niz koji sdrzi sve elemente prethodna dva niza i sabrati sve elemente novog niza
    public static void main(String[] args) {
    // kreiranje niza u main metodi
        int [] niz1 = {2,5,8,111,23};

    // prosledjivanje niza iz posebne metode main metodi i inicaranje novog niza
        int [] niz2 = nizNovi();


    //kreiranje duzine niza3 koji obuhvata prethodna dva niza
        int [] niz3 = new int[niz1.length + niz2.length];
    // iniciranje novog indexa, koji raste kroz obe petlje da bi upisivao vrednosti na naredna mesta u nizu,a da ne zamenjuje vec upisane vrednosti
        int k = 0;

    // u dve petlje se prolazi kroz prethodn dva niza i upisuje se u novokreirani niz
        for (int i = 0; i < niz1.length; i++){
        // ovde se prvo upisuje na prethodnu vrednost k, a zatim se k povecava za 1
            niz3 [k++] = niz1[i];

        }

        for ( int j = 0; j < niz2.length; j++){

            niz3[k++] = niz2[j];
        }





        int suma = 0;

        for (int i = 0; i < niz3.length; i++){

           suma = suma + niz3[i];
        }

        System.out.println(suma);





    }

    public static int [] nizNovi (){

        int [] niz2 = {3,66,71,222,9};


        return niz2;

    }
}
