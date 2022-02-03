package Domaci2712;

//U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje
//(Primer ispisa:
//Week: 1
//Day: 1
//Day: 2
//Day: 3 //sve do Day: 7
//Week: 2
//Day: 1
//Day: 2
//Day: 3.......
//Week: 3
//Day: 1
//Day: 2
//Day: 3......)

public class DuplaPetlja {

    public static void main(String[] args) {

        //kreiranje prve petlje koja ispisuje nedelje
        for (int i = 1; i < 4; i ++){
            System.out.println("Week: " + i);
        //kreiranje druge petlje u prvoj koja ispisuje dane
            for (int j = 1; j < 8; j++){
                System.out.println("Day: " + j);
            }
        }
    }


}
