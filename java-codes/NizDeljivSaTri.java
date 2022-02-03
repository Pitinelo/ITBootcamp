public class NizDeljivSaTri {
//Od zadatog niza krairati novi niz koji sadrza brojeve prvobitnog niza deljive sa 3
    public static void main(String[] args) {

        int [] niz1 = {2, 9,12,52,7,3};

        deljivoSa3(niz1);

    }

    public static void deljivoSa3( int [] niz1){

    // kreiranje niza koji odredjue duzinu novokreiranog niza koji obuhvata sve brojeve prethodno inicaranog niza koji su deljivi sa tri
        int k = 0;
        for (int i = 0; i < niz1.length; i++){
            if(niz1[i] % 3 == 0){
                k = k + 1;
            }
        }

        int [] niz2 = new int [k];
    //stvaranje novog indexa koji sluzi da bi se vrednost upisivala na prava mesta u nizu, da ne bismo dobili null pointer exception
        int x = 0;

        for (int i = 0; i < niz1.length; i++){
            if(niz1[i] % 3 == 0){
            niz2 [x++] = niz1[i];
            }

            }


            for (int j = 0; j < niz2.length; j++){

            System.out.println(niz2[j]);
        }

    }
}
