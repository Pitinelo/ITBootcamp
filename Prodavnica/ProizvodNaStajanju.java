package Prodavnica;

public class ProizvodNaStajanju {
    private Proizvod proizvod;
    private int kolicinaNaStanju;

    public ProizvodNaStajanju(Proizvod proizvod, int kolicinaNaStanju) {
        this.proizvod = proizvod;
        if(kolicinaNaStanju <0){
            System.out.println("Ne mozete imati manje od 0 proizvoda na stanju");
        }else {
            this.kolicinaNaStanju = kolicinaNaStanju;
        }
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public int getKolicinaNaStanju() {
        return kolicinaNaStanju;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public void setKolicinaNaStanju(int kolicinaNaStanju) {
        this.kolicinaNaStanju = kolicinaNaStanju;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv prozivoda: ");
        sb.append(proizvod.getNazivProzivoda());
        sb.append("\n");

        sb.append("Kolicina prozivoda na stanju je: ");
        sb.append(kolicinaNaStanju);
        sb.append("\n");

        return sb.toString();

    }
}
