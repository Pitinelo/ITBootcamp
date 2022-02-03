import java.util.ArrayList;

public class Banka {

    private String nazivBanke;
    private Racun racunBanke;
    private ArrayList<ZahtevZaTransfer> nizZahteva;

    public Banka(String nazivBanke, Racun racunBanke) {
        this.nazivBanke = nazivBanke;
        this.racunBanke = racunBanke;
        this.nizZahteva = new ArrayList<>();
    }

    public String getNazivBanke() {
        return nazivBanke;
    }

    public Racun getRacunBanke() {
        return racunBanke;
    }

    public ArrayList<ZahtevZaTransfer> getNizZahteva() {
        return nizZahteva;
    }

    public void setNazivBanke(String nazivBanke) {
        this.nazivBanke = nazivBanke;
    }

    public void setRacunBanke(Racun racunBanke) {
        this.racunBanke = racunBanke;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();

        sb.append(nazivBanke);
        sb.append("\n");
        sb.append("Lista zahteva na cekanju:");
        for (ZahtevZaTransfer zahtev: nizZahteva){
            sb.append(zahtev.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public void dodavanjeZahteva (ZahtevZaTransfer z){
        nizZahteva.add(z);
    }

    public void izvrsavanjeZahteva (){

        ZahtevZaTransfer z = nizZahteva.get(0);
        if (!z.izvrsiZahtev()){
            System.out.println(z);
            System.out.println("Ispisani zahtev nije moguce izvrsiti.");
        }else {
            nizZahteva.remove(0);
        }
    }
}
