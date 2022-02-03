public abstract class ZahtevZaTransfer {

    private static int nextID = 0;
    protected int id;
    protected Racun racunPrimaoca;
    protected Racun racunUplatioca;
    protected Datum datumPodnosenjaZahteva;
    protected double iznos;

    public ZahtevZaTransfer(Racun racunPrimaoca, Racun racunUplatioca, Datum datumPodnosenjaZahteva, double iznos) {
        id = nextID;
        this.racunPrimaoca = racunPrimaoca;
        this.racunUplatioca = racunUplatioca;
        this.datumPodnosenjaZahteva = datumPodnosenjaZahteva;
        this.iznos = iznos;
        nextID ++;

    }

    public int getId() {
        return id;
    }

    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public Racun getRacunUplatioca() {
        return racunUplatioca;
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
