public class Racun {

    private double stanje;
    private double dozvoljeniMinus;

    public Racun(double stanje, double dozvoljeniMinus) {
        this.stanje = stanje;
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public double getStanje() {
        return stanje;
    }

    public double getDozvoljeniMinus() {
        return dozvoljeniMinus;
    }

    public void setDozvoljeniMinus(double dozvoljeniMinus) {
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public void uplati (double iznos){
        stanje = stanje + iznos;
    }

    public boolean skini (double iznos){
        boolean imaLiNovca = true;

        if (iznos > stanje + dozvoljeniMinus){
            imaLiNovca = false;
        }else {

            stanje = stanje - iznos;
        }

        return imaLiNovca;
    }
}
