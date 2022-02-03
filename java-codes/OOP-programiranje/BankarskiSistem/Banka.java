import java.util.ArrayList;

public class Banka {

    private String nazivBanke;
    private BankovniRacun bankovniRacunBanke;
    private ArrayList<ZahtevZaTransfer> nizZahteva;

    public Banka(String nazivBanke, BankovniRacun bankovniRacunBanke) {
        this.nazivBanke = nazivBanke;
        this.bankovniRacunBanke = bankovniRacunBanke;
        this.nizZahteva = new ArrayList<>();
    }

    public String getNazivBanke() {
        return nazivBanke;
    }

    public BankovniRacun getRacunBanke() {
        return bankovniRacunBanke;
    }

    public ArrayList<ZahtevZaTransfer> getNizZahteva() {
        return nizZahteva;
    }

    public void setNazivBanke(String nazivBanke) {
        this.nazivBanke = nazivBanke;
    }

    public void setRacunBanke(BankovniRacun bankovniRacunBanke) {
        this.bankovniRacunBanke = bankovniRacunBanke;
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
        nizZahteva.remove(0);
        if (!z.izvrsiZahtev()){
            System.out.println(z);
            System.out.println("Ispisani zahtev nije moguce izvrsiti.");
        }
    }
}

