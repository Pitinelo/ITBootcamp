public class Uplatnica extends ZahtevZaTransfer{

    private String svrhaUplate;

    public Uplatnica(BankovniRacun bankovniRacunPrimaoca, BankovniRacun bankovniRacunUplatioca, Datum datumPodnosenjaZahteva, double iznos, String svrhaUplate) {
        super(bankovniRacunPrimaoca, bankovniRacunUplatioca, datumPodnosenjaZahteva, iznos);
        this.svrhaUplate = svrhaUplate;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();

        sb.append("Uplatnica");
        sb.append("(");
        sb.append(id);
        sb.append(")");
        sb.append(datumPodnosenjaZahteva.toString());
        sb.append(" [");
        sb.append(iznos);
        sb.append(":");
        sb.append(iznos/100);
        sb.append("]");
        sb.append("Svrha: ");
        sb.append(svrhaUplate);
        sb.append("\n");

        return sb.toString();

    }

    @Override
    public boolean izvrsiZahtev() {

        double iznosZaSkidanje = iznos + iznos/100;
        boolean mozeLiSeIzvrsitiPrenos = bankovniRacunUplatioca.skini(iznosZaSkidanje);

        if (mozeLiSeIzvrsitiPrenos){
            bankovniRacunPrimaoca.uplati(iznos);
            return true;
        }else {
            return false;
        }
    }
}

