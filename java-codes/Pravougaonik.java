package KlaseOsnovne;

public class Pravougaonik {

    private double duzina;
    private double sirina;

    Pravougaonik (double duzina,double sirina){
        this.duzina = duzina;
        this.sirina = sirina;
    }

    public double getDuzina(){
        return duzina;
    }

    public double getSirina () {
        return sirina;
    }

    public void setDuzina (double duzina) {
        this.duzina = duzina;
    }

    public void setSirina (double sirina) {
        this.sirina = sirina;
    }

    public double povrsina () {
        double p = sirina * duzina;
        return p;
    }

    public double obim () {
        double o = 2 * sirina + 2 * duzina;
        return o;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Duzina pravougaonika iznosi ");
        sb.append(duzina);
        sb.append(" cm.");
        sb.append("\n");
        sb.append("Sirina pravougaonika iznosi ");
        sb.append(sirina);
        sb.append(" cm.");
        sb.append("\n");

        return sb.toString();



    }
}
