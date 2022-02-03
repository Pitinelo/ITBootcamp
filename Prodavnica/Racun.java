package Prodavnica;

import Osoba.Osoba;

import java.util.ArrayList;

public class Racun {

    private ArrayList<Proizvod> nizKupljenihProizvoda;
    private String datum;
    private Osoba kupac;
    private Osoba prodavac;
    private double iznos;

    public void dodajProizvod(Proizvod p) {
        nizKupljenihProizvoda.add(p);
        this.iznos = p.getCenaProzivoda() + iznos;

    }

    public void obrisiProizvod (Proizvod p, double iznos) {
        if (!nizKupljenihProizvoda.contains(p)){
            System.out.println("Navedeni proizvod ne postoji u korpi.");
        }else {
            nizKupljenihProizvoda.remove(p);
            this.iznos = iznos - p.getCenaProzivoda();
        }
    }

    public Racun(String datum, Osoba kupac, Osoba prodavac) {
        this.nizKupljenihProizvoda = new ArrayList<Proizvod>();
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.iznos = 0;

    }

    public ArrayList<Proizvod> getNizKupljenihProizvoda() {
        return nizKupljenihProizvoda;
    }

    public String getDatum() {
        return datum;
    }

    public Osoba getKupac() {
        return kupac;
    }

    public Osoba getProdavac() {
        return prodavac;
    }

    public double getIznos() {
        return iznos;
    }

    public void setNizKupljenihProizvoda(ArrayList<Proizvod> nizKupljenihProizvoda) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }

    public void setProdavac(Osoba prodavac) {
        this.prodavac = prodavac;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Kupac: ");
        sb.append(kupac.getIme());
        sb.append(" ");
        sb.append(kupac.getPrezime());
        sb.append("\n");

        sb.append("Prodavac: ");
        sb.append(prodavac.getIme());
        sb.append(" ");
        sb.append(prodavac.getPrezime());
        sb.append("\n");

        sb.append("Datum: ");
        sb.append(datum);
        sb.append("\n");

       if ( nizKupljenihProizvoda.isEmpty()){
            sb.append("Nije kupljen nijedan prozivod.");
        }else {

           sb.append("Iznos ");
           sb.append(iznos);
           sb.append("\n");
           sb.append("Kupljeni su sledeci prozivod(i):");
           sb.append("\n");
            for (Proizvod prodatiProizvod: nizKupljenihProizvoda  ) {
                sb.append(prodatiProizvod.getNazivProzivoda());
                sb.append(", ");
                sb.append(prodatiProizvod.getCenaProzivoda());
                sb.append("\n");

        }


    }

        return sb.toString();
    }
}
