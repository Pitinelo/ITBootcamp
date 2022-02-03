package Putovanje;

//Stvaranje klase puitovanje koja se proseze kroz dosta klasa koje se nalaze u istom projketu

import Automobil.Automobil;
import Osoba.Osoba;

import java.util.ArrayList;

public class Putovanje {

    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenost;
    private ArrayList<Osoba> prijavljeneOsobe;

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenost) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        if (udaljenost < 0) {
            System.out.println("Udaljenost ne moze biti negativna.");
        } else {
            this.udaljenost = udaljenost;
        }
        this.prijavljeneOsobe = new ArrayList<Osoba>();
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenost) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        if (udaljenost < 0) {
            System.out.println("Udaljenost ne moze biti negativna.");
        } else {
            this.udaljenost = udaljenost;
        }
        this.prijavljeneOsobe = new ArrayList<Osoba>();
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public double getUdaljenost() {
        return udaljenost;
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public void setUdaljenost(double udaljenost) {
        if (udaljenost < 0) {
            System.out.println("Udaljenost ne moze biti negativna.");
        } else {
            this.udaljenost = udaljenost;
        }
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    //metoda koja racuna koliko je vremena potrebno da se predje odredjena udaljenost za neku brzinu - udaljenost unosimo kada kreiramo objekat Putovanje klase
    public double vreme (double brzina) {
        double t = udaljenost / brzina;
        return t;
    }
    //metoda za dodavanje osoba u listu osoba koje su se prjavila za putovanje
    public void prijava (Osoba o) {
        prijavljeneOsobe.add(o);
    }
    //metoda za brisanje osobe sa puta, koja vraca poruku da ta osoba nije prijavljena ukoliko je nema u listi
    public void odjava (Osoba o) {
        if (!prijavljeneOsobe.contains(o)){
            System.out.println("Ova osoba nije prijavljena na put.");
        }else {
            prijavljeneOsobe.remove(o);
        }
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Destinacija: ");
        sb.append(destinacija.getImeGrada());
        sb.append(", ");
        sb.append(destinacija.getDrzava());
        sb.append("\n");

        if (vodjaPuta == null){
            sb.append("Putovanje nema vodju puta.");
            sb.append("\n");
        }else {
            sb.append("Vodja puta je: ");
            sb.append(vodjaPuta.getIme());
            sb.append(" ");
            sb.append(vodjaPuta.getPrezime());
            sb.append("\n");
        }

        sb.append("Putuje se automobilom: ");
        sb.append(vozilo.getMarka());
        sb.append(", ");
        sb.append(vozilo.getGodinaProizvodnje());
        sb.append(", ");
        sb.append(vozilo.getKilometraza());
        sb.append("\n");

        sb.append("Udaljenost destinacije u kilometrima je: ");
        sb.append(udaljenost);
        sb.append("\n");

        if (prijavljeneOsobe.isEmpty()){
            sb.append("Nema prijavljenih osoba za ovo putovanje.");
            sb.append("\n");
        }else {
            sb.append("Prijaveljene osobe su: ");
            sb.append("\n");
            for (Osoba prijavljene : prijavljeneOsobe){
                sb.append(prijavljene.getIme());
                sb.append(" ");
                sb.append(prijavljene.getPrezime());
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}


