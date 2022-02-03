package KlaseOsnovne;


//Klasa koja sluzi za kreiranje kruga, i kojoj je dovoljno proslediti poluprecnik, a ona sama u sebi sadrzi neke metode (za povrsinu i obim)
public class Krug {
    private double poluprecnik;

    Krug (double poluprecnik){
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik (){
        return poluprecnik;
    }

    public void setPoluprecnik (double poluprecnik){
        this.poluprecnik = poluprecnik;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Poluprecnik kruga iznosi ");
        sb.append(poluprecnik);
        sb.append("cm.");
        sb.append("\n");

        return sb.toString();

    }
    //metoda koja racuna obim kruga
    public double obimKruga () {
        double o = poluprecnik * 2 * Math.PI;
        return o;
    }
    // metoda koja racuna povrsinu kruga
    public double povrsinaKruga () {
        double p = Math.pow(poluprecnik,2) * Math.PI;
        return p;
    }
}
