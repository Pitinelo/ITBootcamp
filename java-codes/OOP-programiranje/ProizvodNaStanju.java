package Prodavnica;

public class ProizvodNaStanju {

    private Proizvod proizvodNaStanju;
    private int kolicinaNaStanju;

    public ProizvodNaStanju(Proizvod proizvodNaStanju, int kolicinaNaStanju) {
        this.proizvodNaStanju = proizvodNaStanju;
        this.kolicinaNaStanju = kolicinaNaStanju;
    }

    public Proizvod getProizvodNaStanju() {
        return proizvodNaStanju;
    }

    public int getKolicinaNaStanju() {
        return kolicinaNaStanju;
    }

    public void setProizvodNaStanju(Proizvod proizvodNaStanju) {
        this.proizvodNaStanju = proizvodNaStanju;
    }

    public void setKolicinaNaStanju(int kolicinaNaStanju) {
        this.kolicinaNaStanju = kolicinaNaStanju;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv proizvoda: ");
        sb.append(proizvodNaStanju.getNazivProizvoda());
        sb.append("\n");

        sb.append("Kolicina na stanju: ");
        sb.append(kolicinaNaStanju);
        sb.append("\n");

        return sb.toString();

    }
}
