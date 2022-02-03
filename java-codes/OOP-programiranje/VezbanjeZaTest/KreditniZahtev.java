public class KreditniZahtev extends ZahtevZaTransfer{

    private Datum datumPocetkaOtplate;
    private Datum datumKrajaOtplate;

    public KreditniZahtev(Racun racunPrimaoca, Racun racunUplatioca, Datum datumPodnosenjaZahteva, double iznos, Datum datumPocetkaOtplate, Datum datumKrajaOtplate) {
        super(racunPrimaoca, racunUplatioca, datumPodnosenjaZahteva, iznos);
        this.datumPocetkaOtplate = datumPocetkaOtplate;
        this.datumKrajaOtplate = datumKrajaOtplate;
    }



    public Datum getDatumPocetkaOtplate() {
        return datumPocetkaOtplate;
    }

    public void setDatumPocetkaOtplate(Datum datumPocetkaOtplate) {
        this.datumPocetkaOtplate = datumPocetkaOtplate;
    }

    public Datum getDatumKrajaOtplate() {
        return datumKrajaOtplate;
    }

    public void setDatumKrajaOtplate(Datum datumKrajaOtplate) {
        this.datumKrajaOtplate = datumKrajaOtplate;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Kredit");
        sb.append("(");
        sb.append(id);
        sb.append(")");
        sb.append(datumPodnosenjaZahteva.toString());
        sb.append(" [");
        sb.append(iznos);
        sb.append("]");
        sb.append("Pocetak otplate: ");
        sb.append(datumPocetkaOtplate.toString());
        sb.append("Kraj otplate: ");
        sb.append(datumKrajaOtplate.toString());
        sb.append("\n");

        return sb.toString();
    }

    @Override
    public boolean izvrsiZahtev() {
        boolean mozeLiSeIzvrsitiPrenos = true;

        double iznosKredita = 0.95 * iznos;

        if (!racunUplatioca.skini(iznosKredita)){
            mozeLiSeIzvrsitiPrenos = false;
        }else {
            racunUplatioca.skini(iznosKredita);
            racunPrimaoca.uplati(iznosKredita);
        }

        return mozeLiSeIzvrsitiPrenos;
    }
}
