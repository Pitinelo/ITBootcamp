package Prodavnica;

public class Proizvod {

    private String nazivProizvoda;
    private double cenaProizvoda;
    private String opisProizvoda;
    private int tezinaProizvoda;

    public Proizvod(String nazivProizvoda, double cenaProizvoda, String opisProizvoda, int tezinaProizvoda) {
        this.nazivProizvoda = nazivProizvoda;

        if (cenaProizvoda <= 0) {
            System.out.println("Prozivod ne moze imati cenu od 0 dinara ili manje.");
        } else {
            this.cenaProizvoda = cenaProizvoda;
        }

        this.opisProizvoda = opisProizvoda;

        if (tezinaProizvoda <= 0) {
            System.out.println("Prozivod ne moze imati tezinu od 0 grama ili manje.");
        } else {
            this.tezinaProizvoda = tezinaProizvoda;
        }
    }

    public Proizvod(String nazivProizvoda, double cenaProizvoda, int tezinaProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
        if (cenaProizvoda <= 0) {
            System.out.println("Prozivod ne moze imati cenu od 0 dinara ili manje.");
        } else {
            this.cenaProizvoda = cenaProizvoda;
        }
        if (tezinaProizvoda <= 0) {
            System.out.println("Prozivod ne moze imati tezinu od 0 grama ili manje.");
        } else {
            this.tezinaProizvoda = tezinaProizvoda;
        }

    }

    public String getNazivProzivoda() {
        return nazivProizvoda;
    }

    public double getCenaProzivoda() {
        return cenaProizvoda;
    }

    public String getOpisProizvoda() {
        return opisProizvoda;
    }

    public int getTezinaProizvoda() {
        return tezinaProizvoda;
    }

    public void setNazivProzivoda(String nazivProzivoda) {
        this.nazivProizvoda = nazivProzivoda;
    }

    public void setCenaProzivoda(double cenaProzivoda) {
        if (cenaProzivoda <= 0) {
            System.out.println("Prozivod ne moze imati cenu od 0 dinara ili manje.");
        } else {
            this.cenaProizvoda = cenaProzivoda;
        }
    }

    public void setOpisProizvoda (String opisProizvoda) {
        this.opisProizvoda = opisProizvoda;
    }

    public void setTezinaProizvoda (int tezinaProizvoda) {
            if (tezinaProizvoda <= 0) {
                System.out.println("Prozivod ne moze imati tezinu od 0 grama ili manje.");
            } else {
                this.tezinaProizvoda = tezinaProizvoda;
            }
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv prozivoda je: ");
        sb.append(nazivProizvoda);
        sb.append("\n");

        sb.append("Cena prozivoda je: ");
        sb.append(cenaProizvoda);
        sb.append("\n");

        if (opisProizvoda == null){
            sb.append("Ovaj prozivod nema opis.");
        }else {
            sb.append("Opis prozivoda: ");
            sb.append(opisProizvoda);
        }
        sb.append("\n");

        sb.append("Tezina proizvoda je: ");
        sb.append(tezinaProizvoda);
        sb.append("\n");

        return sb.toString();
    }
}
