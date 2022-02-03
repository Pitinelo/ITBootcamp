package Domaci;


//Klasa Glumci koja sluzi za kreiranje odredjenih gluamca
public class Glumci {

    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean daLiJeIzSrbije;

    public Glumci(String ime, String prezime, char pol, int godine, double ocena, boolean daLiJeIzSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        if (pol == 'm' || pol == 'z'){
            this.pol = pol;
        }else {
            System.out.println("Uneli ste nepostojeci pol.");
        }
        if (godine < 0){
            System.out.println("Uneli ste negativan broj za godine.");
        }else {
            this.godine = godine;

        }if (ocena < 0 || ocena > 10){
            System.out.println("Uneli ste nepostojecu ocenu.");
        }else {
            this.ocena = ocena;
        }
        this.daLiJeIzSrbije = daLiJeIzSrbije;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public char getPol() {
        return pol;
    }

    public int getGodine() {
        return godine;
    }

    public double getOcena() {
        return ocena;
    }

    public boolean isDaLiJeIzSrbije() {
        return daLiJeIzSrbije;
    }

    public String toString () {

        StringBuilder sb = new StringBuilder();
        if (pol == 'm'){
            sb.append("Ime glumca je ");
        }else if ( pol == 'z'){
            sb.append("Ime glumice je ");
        }
        sb.append(ime);
        sb.append("\n");
        if (pol == 'm'){
            sb.append("Prezime glumca je ");
        }else if ( pol == 'z'){
            sb.append("Prezime glumice je ");
        }
        sb.append(prezime);
        sb.append("\n");
        if (pol == 'm'){
            sb.append("Pol glumca je ");
        }else if ( pol == 'z'){
            sb.append("Pol glumice je ");
        }
        sb.append(pol);
        sb.append("\n");
        if (pol == 'm'){
            sb.append("Glumac ima ");
        }else if ( pol == 'z'){
            sb.append("Glumica ima ");
        }
        sb.append(godine);
        if (godine % 10 == 1  ){
            sb.append(" godinu.");
        }else if ( godine % 10 == 2 || godine % 10 == 3 || godine % 10 == 4){
            sb.append(" godine.");
        }else {
            sb.append(" godina.");
        }

        sb.append("\n");
        if (pol == 'm'){
            sb.append("Ocena glumca je ");
        }else if ( pol == 'z'){
            sb.append("Ocena glumice je ");
        }
        sb.append(ocena);
        sb.append("\n");
        if (pol == 'm'){
            sb.append("Glumac je iz Srbije: ");
        }else if ( pol == 'z'){
            sb.append("Glumica je iz Srbije: ");
        }
        sb.append(daLiJeIzSrbije);
        sb.append("\n");

        return sb.toString();

    }
}
