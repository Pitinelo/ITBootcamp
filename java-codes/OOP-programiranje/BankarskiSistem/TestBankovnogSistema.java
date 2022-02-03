public class TestBankovnogSistema {

    public static void main(String[] args) {


        Datum d1 = new Datum(2,1,2022);

        Datum d2 = new Datum(23,11,2021);

        Datum d3 = new Datum(4,8,2018);


        BankovniRacun rBanka = new BankovniRacun(10000,20000);
        BankovniRacun r1 = new BankovniRacun(700,1000);
        BankovniRacun r2 = new BankovniRacun(500,900);
        BankovniRacun r3 = new BankovniRacun(1200,1900);

        Banka b1 = new Banka("Mobi banka", rBanka);

        KreditniZahtev z1 = new KreditniZahtev(r1, rBanka, d1, 1200, d2, d3);
        Uplatnica u1 = new Uplatnica(r3,r2,d2,1450,"Prodaja igrica");

        System.out.println(u1);


        b1.dodavanjeZahteva(u1);
        b1.dodavanjeZahteva(z1);

        b1.izvrsavanjeZahteva();
        b1.izvrsavanjeZahteva();

        System.out.println(rBanka);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }




}
