package Prodavnica;

public class Proizvod {

    private String nazivProizvoda;
    private double cenaProizvoda;
    private String opisProizvoda;
    private int tezinaProizvoda;

    public Proizvod (String nazivProizvoda, double cenaProizvoda, String opisProizvoda, int tezinaProizvoda){
        this.nazivProizvoda = nazivProizvoda;
        if (cenaProizvoda < 0){
            System.out.println("Prozivod ne moze biti jeftiniji od 0 dinara.");
        }else {
            this.cenaProizvoda = cenaProizvoda;
        }
        this.opisProizvoda = opisProizvoda;
        if (tezinaProizvoda < 0){
            System.out.println("Prozivod ne moze biti laksi od 0 grama.");
        }else {
            this.tezinaProizvoda = tezinaProizvoda;
        }
    }

    public Proizvod (String nazivProizvoda, double cenaProizvoda, int tezinaProizvoda){
        this.nazivProizvoda = nazivProizvoda;
        if (cenaProizvoda < 0){
            System.out.println("Prozivod ne moze biti jeftiniji od 0 dinara.");
        }else {
            this.cenaProizvoda = cenaProizvoda;
        }
        if (tezinaProizvoda < 0){
            System.out.println("Prozivod ne moze biti laksi od 0 grama.");
        }else {
            this.tezinaProizvoda = tezinaProizvoda;
        }
    }

    public String getNazivProizvoda () {
        return nazivProizvoda;
    }

    public double getCenaProizvoda() {
        return cenaProizvoda;
    }

    public String getOpisProizvoda () {
        return opisProizvoda;
    }

    public int getTezinaProizvoda () {
        return tezinaProizvoda;
    }

    public void setNazivProizvoda (String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public void setCenaProizvoda(double cenaProizvoda) {
        this.cenaProizvoda = cenaProizvoda;
    }

    public void setOpisProizvoda(String opisProizvoda) {
        this.opisProizvoda = opisProizvoda;
    }

    public void setTezinaProizvoda(int tezinaProizvoda) {
        this.tezinaProizvoda = tezinaProizvoda;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv proizvoda: ");
        sb.append(nazivProizvoda);
        sb.append("\n");

        sb.append("Cena proizvoda: ");
        sb.append(cenaProizvoda);
        sb.append("\n");

        if (opisProizvoda == null){
            sb.append("Ovaj prozivod nema opis.");
            sb.append("\n");
        }
        sb.append("Opis proizvoda: ");
        sb.append(opisProizvoda);
        sb.append("\n");

        sb.append("Tezina proizvoda: ");
        sb.append(tezinaProizvoda);
        sb.append("g");
        sb.append("\n");

        return sb.toString();
    }
}
