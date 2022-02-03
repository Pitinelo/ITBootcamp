package BankovniRacun;

import Osoba.Osoba;

public class BankovniRacun {

    private Osoba vlasnikRacuna;
    private double stanjeNaRacunu;

    public BankovniRacun(Osoba vlasnikRacuna, double stanjeNaRacunu) {
        this.vlasnikRacuna = vlasnikRacuna;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public BankovniRacun(Osoba vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
    }

    public Osoba getVlasnikRacuna() {
        return vlasnikRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setVlasnikRacuna(Osoba vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Vlasnik racuna je: ");
        sb.append(vlasnikRacuna.getIme());
        sb.append(" ");
        sb.append(vlasnikRacuna.getPrezime());
        sb.append("\n");
        sb.append("Stanje na racunu je: ");
        sb.append(stanjeNaRacunu);
        sb.append("\n");

        return sb.toString();
    }

    public double uplataNaRacun (double iznos) {
        stanjeNaRacunu = stanjeNaRacunu + iznos;
        return stanjeNaRacunu;
    }

    public double isplataSaRacuna (double iznos) {
        if ( iznos > stanjeNaRacunu) {
            System.out.println(vlasnikRacuna.getIme() + " " + vlasnikRacuna.getPrezime() + ", nemate dovoljno sredstava." + "\n");
        }else {
            stanjeNaRacunu = stanjeNaRacunu - iznos;
        }

        return stanjeNaRacunu;
    }


}
