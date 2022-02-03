import java.util.Scanner;
// napraviti metodu koja izvalci najveci broj iz prethodnno kreiranog niza
public class NajveciElementNiza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] niz = {2222,12,335,685,1145,5558};

        System.out.println(najveci(niz));


    }
//kreiranje metode koja izvlaci najveci broj iz odredjenog niza
    public static int najveci ( int [] x){
    // zadavanje da je najveci broj u nizu na nultoj poziciji, jer ce tako niz svakako vratiti neki broj
        // a ukoliko je upravo najveci broj na mestu 0, to ce biti odgovoarajuci, a potrebna nam je neka referenca za poredjenje
        int max = x[0];

        for(int i = 1; i < x.length; i++){
            if (x[i] > max){
                max = x[i];
            }
        }

        return max;
    }
}
