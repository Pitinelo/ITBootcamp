package Prodavnica;

import Osoba.Osoba;

import java.util.ArrayList;

public class Racun {

    private ArrayList<Proizvod> nizKupljenihProizvoda;
    private String datum;
    private Osoba kupac;
    private Osoba prodavac;
    private double iznos;

    public Racun(ArrayList<Proizvod> nizKupljenihProizvoda, String datum, Osoba kupac, Osoba prodavac, double iznos) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.iznos = 0;
        for (Proizvod pr: nizKupljenihProizvoda){
            this.iznos = pr.getCenaProizvoda() + this.iznos;
        }

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

    public void dodavanjeNaRacun (Proizvod p) {
        nizKupljenihProizvoda.add(p);
    }

    public void skidanjeSaRacuna (Proizvod p) {
        if (!nizKupljenihProizvoda.contains(p)){
            System.out.println("Ovaj racun ne sadrzi navedeni proizvod.");
        }else {
            nizKupljenihProizvoda.remove(p);
        }
    }





}
