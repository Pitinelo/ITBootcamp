package KlaseOsnovne;


//Klasa koja kreira osoba kojoj dajemo odredjena parametre
public class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private double visina;

    Osoba (String ime, String prezime, int godinaRodjenja, double visina){
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.visina = visina;
    }

    public String getIme(){
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodinaRodjenja (){
        return godinaRodjenja;
    }

    public double getVisina (){
        return visina;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void setVisina (double visina) {
        this.visina = visina;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime korisnika je: ");
        sb.append(ime);
        sb.append("\n");
        sb.append("Prezime korisnika je: ");
        sb.append(prezime);
        sb.append("\n");
        sb.append("Godina rodjenja korisnika je: ");
        sb.append(godinaRodjenja);
        sb.append("\n");
        sb.append("Visina korisnika je: ");
        sb.append(visina);
        sb.append("cm");
        sb.append("\n");
        return sb.toString();







    }
}
