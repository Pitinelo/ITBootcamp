public class BankovniRacun {

    private double stanje;
    private double dozvoljeniMinus;

    public BankovniRacun(double stanje, double dozvoljeniMinus) {
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

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Stanje na racunu je: ").append(stanje);

        return sb.toString();
    }
}
