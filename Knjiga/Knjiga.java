package Knjiga;

import Osoba.Osoba;

public class Knjiga {

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public void daLiJeNegativno(int brojStrana, int godinaIzdanja) {
        if (brojStrana <= 0) {
            System.out.println("Knjiga ne moze imati manje od jedne strane.");
        } else {
            this.brojStrana = brojStrana;
        }
        if (godinaIzdanja <= 0) {
            System.out.println("Knjiga mora izdati u novoj eri.");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        daLiJeNegativno(brojStrana, godinaIzdanja);
    }

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        daLiJeNegativno(brojStrana, godinaIzdanja);
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja <= 0) {
            System.out.println("Knjiga mora izdati u novoj eri.");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }

    }

    public void setBrojStrana (int brojStrana) {
        if (brojStrana <= 0) {
            System.out.println("Knjiga ne moze imati manje od jedne strane.");
        } else {
            this.brojStrana = brojStrana;
        }
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Naviz knjige je: ");
        sb.append(nazivKnjige);
        sb.append("\n");

        sb.append("Autor knjige je: ");
        if(autor == null) {
            sb.append("Nepoznat");
        }else {
            sb.append(autor.getIme());
            sb.append(" ");
            sb.append(autor.getPrezime());
        }
        sb.append("\n");

        sb.append("Vlasnik knjige je: ");
        if(vlasnik == null) {
            sb.append("Knjiga nema vlasnika.");
        }else {
            sb.append(vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
        }
        sb.append("\n");

        sb.append("Broj strana knjige je: ");
        sb.append(brojStrana);
        sb.append("\n");

        sb.append("Godina izdanja knjige je: ");
        sb.append(godinaIzdanja);
        sb.append("\n");

        return sb.toString();

    }

    public String velicinaKnjige () {

        String velicinaKnjige;
        if (brojStrana <= 100){
            velicinaKnjige = "Ovo je mala knjiga";
        }else if (brojStrana <= 300){
            velicinaKnjige = "Ovo je srednja knjiga";
        }else if (brojStrana <= 600) {
            velicinaKnjige = "Ovo je velika knjiga";
        }else {
            velicinaKnjige = "Ovo je bas velika knjiga.";
        }

        return velicinaKnjige;
    }

}
