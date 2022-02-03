package knjiga;

import Osoba.Osoba;

public class Knjiga {

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga (String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        if (brojStrana <= 0){
            System.out.println("Knjiga ne moze biti bez strana.");
        }else{
            this.brojStrana = brojStrana;
        }
        if (godinaIzdanja <= 0 ){
            System.out.println("Knjiga mora biti izdata u novoj eri.");
        }else{
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public Knjiga (String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja){
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        if (brojStrana <= 0){
            System.out.println("Knjiga ne moze biti bez strana.");
        }else{
            this.brojStrana = brojStrana;
        }
        if (godinaIzdanja <= 0 ){
            System.out.println("Knjiga mora biti izdata u novoj eri.");
        }else{
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana <= 0){
            System.out.println("Knjiga ne moze biti bez strana.");
        }else{
            this.brojStrana = brojStrana;
        }
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja <= 0 ){
            System.out.println("Knjiga mora biti izdata u novoj eri.");
        }else{
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv knjige je: ");
        sb.append(nazivKnjige);
        sb.append("\n");

        sb.append("Autor knjige je: ");
        sb.append(autor.getIme());
        sb.append(" ");
        sb.append(autor.getPrezime());
        sb.append("\n");

        if (vlasnik == null) {
            sb.append("Knjiga nema vlasnika.");
            sb.append("\n");
        } else {
            sb.append("Vlasnik knjige je: ");
            sb.append(vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
            sb.append("\n");

        }

        sb.append("Broja strana knjige je: ");
        sb.append(brojStrana);
        sb.append("\n");

        sb.append("Godina izdanja knjige je: ");
        sb.append(godinaIzdanja);
        sb.append("\n");

        return sb.toString();
    }

    public String velicinaKnjige () {
        String velicina;

        if (brojStrana <= 100){
            velicina = nazivKnjige + " je mala knjiga.";
        }else if (brojStrana <= 300){
            velicina = nazivKnjige + " je srednje velika knjiga.";
        }else if (brojStrana <= 600){
            velicina = nazivKnjige + " je velika knjiga.";
        }else{
            velicina = nazivKnjige +  " je bas velika knjiga.";
        }

        return velicina;
    }
}
