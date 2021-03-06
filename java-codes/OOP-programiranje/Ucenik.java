package Odeljenje;

import java.util.ArrayList;

public class Ucenik {

    private String ime;
    private String prezime;
    private ArrayList <Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<Integer>();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    public double prosek (ArrayList <Integer> ocene) {
        double suma = 0;
        for (int sveOcene: ocene){
            suma = suma + sveOcene;
        }

        double prosek = suma / ocene.size();

        return prosek;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append(ime);
        sb.append(" i ");
        sb.append(prezime);
        sb.append(" ima ocene: ");
        int i = 0;
        for (int ocena: ocene){

            if (ocene.isEmpty()){
            sb.append("Ovaj ucenik nema nijednu ocenu.");
            sb.append("\n");
            }else if (i != ocene.size() - 1){

                sb.append(ocena);
                sb.append(", ");
            }else {
            sb.append(ocena);
            sb.append(".");
            sb.append("\n");
            }

        i++;
        }

        return sb.toString();




    }
}
