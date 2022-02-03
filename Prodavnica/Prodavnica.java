package Prodavnica;

import java.util.ArrayList;
import Osoba.Osoba;

public class Prodavnica {

    private String nazivProdavnice;
    private String ulica;
    private ArrayList<Osoba> nizZaposlenih;
    private ArrayList<ProizvodNaStajanju> nizProizvodaNaStanju;
    private ArrayList<Racun> nizObavljenihKupovina;


    public Prodavnica(String nazivProdavnice, String ulica) {
        this.nazivProdavnice = nazivProdavnice;
        this.ulica = ulica;
        this.nizZaposlenih = new ArrayList<Osoba>();
        this.nizProizvodaNaStanju = new ArrayList<ProizvodNaStajanju>();
        this.nizObavljenihKupovina = new ArrayList<Racun>();
    }

    public String getNazivProdavnice() {
        return nazivProdavnice;
    }

    public String getUlica() {
        return ulica;
    }

    public ArrayList<Osoba> getNizZaposlenih() {
        return nizZaposlenih;
    }

    public ArrayList<ProizvodNaStajanju> getNizProizvodaNaStanju() {
        return nizProizvodaNaStanju;
    }

    public ArrayList<Racun> getNizObavljenihKupovina() {
        return nizObavljenihKupovina;
    }

    public void setNazivProdavnice(String nazivProdavnice) {
        this.nazivProdavnice = nazivProdavnice;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNizZaposlenih(ArrayList<Osoba> nizZaposlenih) {
        this.nizZaposlenih = nizZaposlenih;
    }

    public void setNizProizvodaNaStanju(ArrayList<ProizvodNaStajanju> nizProizvodaNaStanju) {
        this.nizProizvodaNaStanju = nizProizvodaNaStanju;
    }

    public void setNizObavljenihKupovina(ArrayList<Racun> nizObavljenihKupovina) {
        this.nizObavljenihKupovina = nizObavljenihKupovina;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv prodavnice: ");
        sb.append(nazivProdavnice);
        sb.append("\n");

        sb.append("Ulica: ");
        sb.append(ulica);
        sb.append("\n");

        if (nizZaposlenih.isEmpty()){
            sb.append("Trenutno nema zaposlenih radnika.");
            sb.append("\n");
        }else {
            sb.append("Zaposleni radnici: ");
            sb.append("\n");
            for (Osoba zaposleniRadnici: nizZaposlenih){
                sb.append(zaposleniRadnici.getIme());
                sb.append(", ");
                sb.append(zaposleniRadnici.getPrezime());
                sb.append("\n");
            }
        }

        if(nizProizvodaNaStanju.isEmpty()){
            sb.append("Trenutno nema prozivoda na stanju.");
            sb.append("\n");
        }else{
            sb.append("Proizvoda na stajanju: ");
            sb.append("\n");
            for (ProizvodNaStajanju onoStoJeNaStajanju: nizProizvodaNaStanju) {
                sb.append(onoStoJeNaStajanju.getProizvod().getNazivProzivoda());
                sb.append(", ");
                sb.append(onoStoJeNaStajanju.getKolicinaNaStanju());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public void zaposlenje (Osoba z) {
        nizZaposlenih.add (z);
    }

    public void otkaz (Osoba z) {
        nizZaposlenih.remove(z);
    }

    public void inicijalnoStanje (ProizvodNaStajanju p){
        nizProizvodaNaStanju.add(p);

        }


    public void dodavanjeProizvodaNaStajanje (ProizvodNaStajanju p, int kolicina) {


        if (nizProizvodaNaStanju.contains(p)){
            p.setKolicinaNaStanju(p.getKolicinaNaStanju() + kolicina);
        }else {
            nizProizvodaNaStanju.add(p);
            p.setKolicinaNaStanju(kolicina);
        }

    }

    public Racun kreiraniRacun (Osoba o, ArrayList<Proizvod> nizKupljenihProzivoda  ) {
        double iznos = 0;
        Racun r = new Racun("27.11.2021", o, nizZaposlenih.get(0));

        for (Proizvod kupljeniProizvod: nizKupljenihProzivoda){
            for (ProizvodNaStajanju p: nizProizvodaNaStanju){
                if(kupljeniProizvod.equals(p.getKolicinaNaStanju())){
                    int novaKolicina = p.getKolicinaNaStanju() -1;
                    p.setKolicinaNaStanju(novaKolicina) ;
                }
            }
            r.dodajProizvod(kupljeniProizvod);
            iznos = kupljeniProizvod.getCenaProzivoda() + iznos;


        }
        nizObavljenihKupovina.add(r);
        return r;


    }


}
