package Skola;

import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

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

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }

    public void ispisiUcenika(Ucenik u) {
        if (!dnevnik.contains(u)) {
            System.out.println("U odeljenju nema ovog ucenika.");
        } else {
            dnevnik.remove(u);
        }
    }

    public void ispisiUcenika(int i) {

            dnevnik.remove(i);
        }


    public void pogledajOcene(Ucenik u) {
        if (!dnevnik.contains(u)) {
            System.out.println("U odeljenju nema ovog ucenika.");
        } else {
            System.out.print(u.getIme() + " " + u.getPrezime() + " ima sledece ocene: " + u.getOcene() + "\n");


        }
    }

    public void pogledajOcene(int i) {
        Ucenik u = dnevnik.get(i);
        if (!dnevnik.contains(u)) {
            System.out.println("U odeljenju nema ucenika pod ovim rednim brojem.");
        } else {

            System.out.println(u.getIme() + " " + u.getPrezime() + " ima sledece ocene: " + u.getOcene() + "\n");

        }
    }

    public void prosecnaOcena(Ucenik u) {
        if (!dnevnik.contains(u)) {
            System.out.println("U odeljenju nema ovog ucenika.");
        } else {
            System.out.print(u.getIme() + " " + u.getPrezime() + " ima prosecnu ocenu: " + u.prosecnaOcena(u.getOcene()) + "\n");


        }
    }

    public void prosecnaOcena(int i) {
        Ucenik u = dnevnik.get(i);
        if (!dnevnik.contains(u)) {
            System.out.println("U odeljenju nema ucenika pod ovim rednim brojem.");
        } else {

            System.out.println(u.getIme() + " " + u.getPrezime() + " ima prosecnu ocenu: " + u.prosecnaOcena(u.getOcene()));
            ;

        }


    }

    public double prosecnaOcenaOdeljenja () {
        double prosekCelogOdeljenja = 0;
        if (dnevnik.isEmpty()){
            return prosekCelogOdeljenja;
        }else {
          double suma = 0;
          int i = 0;
            for (Ucenik celoOdeljenje: dnevnik){

                celoOdeljenje = dnevnik.get(i);
                // uzima odredjenog ucenika, racuna njegovu prosecnu ocenu tako sto uzme sve njegove ocene putem getOcene i koristimo ranije napravljenu metodu
                suma = suma + celoOdeljenje.prosecnaOcena(celoOdeljenje.getOcene());

                i++;
            }

            prosekCelogOdeljenja = suma / dnevnik.size();
        }

        return  prosekCelogOdeljenja;
    }

    public void opisnaOcena (Ucenik u) {
        if (u.getOcene().contains(1)){
            System.out.println(u.getIme() + " " + u.getPrezime() + " je " + "Nedovoljan");
        }else if (u.prosecnaOcena(u.getOcene()) >= 4.5){
            System.out.println(u.getIme() + " " + u.getPrezime() + " je " + "Odlican");
        }else if (u.prosecnaOcena(u.getOcene()) >= 3.5 ){
            System.out.println(u.getIme() + " " + u.getPrezime() + " je " + "Vrlo dobar");
        }else if (u.prosecnaOcena(u.getOcene()) >= 2.5){
            System.out.println(u.getIme() + " " + u.getPrezime() + " je " + "Dobar");
        }else if (u.prosecnaOcena(u.getOcene()) >= 2.0){
            System.out.println(u.getIme() + " " + u.getPrezime() + " je " + "Dovoljan");
        }
    }

    public String izlistajDnevnik () {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Ucenik u: dnevnik) {
            u = dnevnik.get(i);
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append(": ");
            sb.append("\n");

            sb.append(u.getOcene());
            sb.append("\n");

            i++;

        }

        return sb.toString();
    }

    public String velicinaOdeljenja () {
        String velicinaOdeljenja;
        if (dnevnik.size() > 25){
            velicinaOdeljenja = "Veliko odeljenje.  \n";
        }else if (dnevnik.size()>= 15){
            velicinaOdeljenja = "Srednje odeljenje \n";
        }else {
            velicinaOdeljenja = "Malo odeljenje. \n";
        }

        return velicinaOdeljenja;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append(oznaka);
        sb.append(" odeljenja ima djake");
        sb.append("\n");
        int i = 0;
        for (Ucenik u: dnevnik){
            u = dnevnik.get(i);
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append("\n");

            i++;
        }

        return sb.toString();
    }
}
