package Odeljenje;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList <Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika (Ucenik u) {
        dnevnik.add(u);
    }

    public void upisiUcenika (Ucenik u, int redniBroj){
        dnevnik.add(redniBroj,u);
    }

    public void ispisiUcenika (Ucenik u){
        if (!dnevnik.contains(u)){
            System.out.println("Nema ovog ucenika u ovom odeljenju.");
        }else {
            dnevnik.remove(u);
        }
    }

    public void ispisiUcenika (int i){
        dnevnik.remove(i);
    }

    public void pogledajOcene (Ucenik u) {
        if (!dnevnik.contains(u)){
            System.out.println("Nema ovog ucenika u ovom odeljenju.");
        }else {
            System.out.println(u.getIme() + " " + u.getPrezime() + " ima sledece ocene: " +u.getOcene() + "\n");
        }
    }

    public void pogledajOcene (int i) {
        Ucenik u = dnevnik.get(i);
        System.out.println(u.getIme() + " " + u.getPrezime() + " ima sledece ocene: " +u.getOcene() + "\n");
    }

    public void prosecnaOcena (Ucenik u){
        if (!dnevnik.contains(u)){
            System.out.println("Nema ovog ucenika u ovom odeljenju.");
        }else {
            System.out.println(u.getIme() + " " + u.getPrezime() + " ima sledece ocene: " + u.prosek(u.getOcene())+ "\n");
        }
    }

    public void prosecnaOcena (int i) {
        Ucenik u = dnevnik.get(i);
        System.out.println(u.getIme() + " " + u.getPrezime() + " ima sledece ocene: " + u.prosek(u.getOcene())+ "\n");

    }

    public double prosecnaOcenaOdeljenja () {
        double suma = 0;

        if (dnevnik.isEmpty()){
            suma = 0;
        }else {

            for (Ucenik u: dnevnik){
                suma = suma + u.prosek(u.getOcene());
            }

        }

        double prosek = suma / dnevnik.size();
        return prosek;
    }

    public void opisnaOcena (Ucenik u) {
        if (u.getOcene().contains(1)){
            System.out.println("Nedovoljan");
        }else if (u.prosek(u.getOcene()) < 2.5){
            System.out.println("Dovoljan");
        }else if (u.prosek(u.getOcene()) < 3.5) {
            System.out.println("Dobar");
        }else if (u.prosek(u.getOcene()) < 4.5) {
            System.out.println("Vrlo dobar");
        }else {
            System.out.println("Odlican");
        }
    }

    public String izlistajDnevnik () {
        StringBuilder sb = new StringBuilder();
        for (Ucenik u: dnevnik ){
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append("\n");

            sb.append(u.getOcene());
            sb.append("\n");
        }

        return sb.toString();
    }
}
