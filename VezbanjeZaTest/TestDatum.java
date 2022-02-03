public class TestDatum {

    public static void main(String[] args) {


        Datum d1 = new Datum(2,1,2022);

        Datum d2 = new Datum(23,11,2021);

        Datum d3 = new Datum(4,8,2018);


        Racun rBanka = new Racun(10000,20000);
        Racun r1 = new Racun(700,1000);
        Racun r2 = new Racun(500,900);
        Racun r3 = new Racun(1200,1900);

        Banka b1 = new Banka("Mobi banka", rBanka);

        KreditniZahtev z1 = new KreditniZahtev(r1, rBanka, d1, 1200, d2, d3);
        Uplatnica u1 = new Uplatnica(r3,r2,d2,300,"Prodaja igrica");

        b1.dodavanjeZahteva(u1);
        b1.dodavanjeZahteva(z1);

        b1.izvrsavanjeZahteva();
        b1.izvrsavanjeZahteva();

    }




}
