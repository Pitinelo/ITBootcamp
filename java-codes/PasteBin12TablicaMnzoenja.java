public class PasteBin12TablicaMnzoenja {
//Ispisati tablicu mnozemnja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)

    public static void main(String[] args) {



//petlja u petlji koja pravi tablicu 10x10 tako sto u prvom redu mnozi sa 0 sve brojeve od 0 do 9, a kasnije svakom redu broji sa brojem vecim od 1 od prethodnog
        for (int i = 0; i <= 9; i++){

            for(int j = 0; j <=9; j++){

            int proizvod = i * j;
            System.out.print(proizvod + " ");
            }

            System.out.println();
        }
    }
}



