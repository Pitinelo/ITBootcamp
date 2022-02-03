package Domaci;


//Klasa koja sluzi za kreiranje posebne klase Sportista
public class Sportista {

    private String imeIPrezime;
    private String sport;
    private String klub;
    private int brojDresa;

    Sportista (String imeIPrezime, String sport, String klub, int brojDresa){
        this.imeIPrezime = imeIPrezime;
        this.sport = sport;
        this.klub = klub;
        this.brojDresa = brojDresa;
    }

    public String getImeIPrezime () {
        return imeIPrezime;
    }

    public String getSport () {
        return sport;
    }

    public String getKlub () {
        return klub;
    }

    public int getBrojDresa () {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Ime i prezime sportiste je ");
        sb.append(imeIPrezime);
        sb.append("\n");
        sb.append("Sport kojim je bavi sportista je ");
        sb.append(sport);
        sb.append("\n");
        sb.append("Klub u kom nastupa sportista je ");
        sb.append(klub);
        sb.append("\n");
        sb.append("Broj dresa sportiste je ");
        sb.append(brojDresa);
        sb.append("\n");

        return sb.toString();


    }
}
