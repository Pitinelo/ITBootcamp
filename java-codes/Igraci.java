package Domaci;


//Klasa koja kreira objekte klase Sportista
public class Igraci {

    public static void main(String[] args) {

        Sportista sp1 = new Sportista("Nikola Jokic", "kosarka", "Denver Nuggets",15 );

        Sportista sp2 = new Sportista("Mohamed Salah", "fudbal", "Liverpool" , 11);

        Sportista sp3 = new Sportista("Dusan Vlahovic", "fudbal", "Fiorentina", 9);

        System.out.println(sp1);

        System.out.println(sp2);

        System.out.println("Ime sportiste je " + sp3.getImeIPrezime());
        System.out.println("Sport kojim se sportista bavi je " + sp3.getSport());
        System.out.println("Klub u kome sportista igra je " + sp3.getKlub());
        System.out.println("Broj dresa koji sportista nosi je " + sp3.getBrojDresa() + "\n");

        sp3.setKlub("Arsenal");

        System.out.println("Ime sportiste je " + sp3.getImeIPrezime());
        System.out.println("Sport kojim se sportista bavi je " + sp3.getSport());
        System.out.println("Klub u kome sportista igra je " + sp3.getKlub());
        System.out.println("Broj dresa koji sportista nosi je " + sp3.getBrojDresa() + "\n");
    }
}
