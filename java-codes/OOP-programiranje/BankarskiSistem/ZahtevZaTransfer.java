public abstract class ZahtevZaTransfer {

    private static int nextID = 0;
    protected int id;
    protected BankovniRacun bankovniRacunPrimaoca;
    protected BankovniRacun bankovniRacunUplatioca;
    protected Datum datumPodnosenjaZahteva;
    protected double iznos;

    public ZahtevZaTransfer(BankovniRacun bankovniRacunPrimaoca, BankovniRacun bankovniRacunUplatioca, Datum datumPodnosenjaZahteva, double iznos) {
        id = nextID;
        this.bankovniRacunPrimaoca = bankovniRacunPrimaoca;
        this.bankovniRacunUplatioca = bankovniRacunUplatioca;
        this.datumPodnosenjaZahteva = datumPodnosenjaZahteva;
        this.iznos = iznos;
        nextID ++;

    }

    public int getId() {
        return id;
    }

    public BankovniRacun getRacunPrimaoca() {
        return bankovniRacunPrimaoca;
    }

    public BankovniRacun getRacunUplatioca() {
        return bankovniRacunUplatioca;
    }

    public Datum getDatumPodnosenjaZahteva() {
        return datumPodnosenjaZahteva;
    }

    public double getIznos() {
        return iznos;
    }

    public void setDatumPodnosenjaZahteva(Datum datumPodnosenjaZahteva) {
        this.datumPodnosenjaZahteva = datumPodnosenjaZahteva;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public abstract boolean izvrsiZahtev ();


}

