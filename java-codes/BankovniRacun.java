package KlaseOsnovne;




public class BankovniRacun {
    private Osoba vlasnik;
    private double stanjeNaRacunu;

    public BankovniRacun(Osoba vlasnik) {
        this.vlasnik = vlasnik;
        this.stanjeNaRacunu = 0;
    }

    public BankovniRacun(Osoba vlasnik, double stanjeNaRacunu) {
        this.vlasnik = vlasnik;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public void uplata(double iznos){
        stanjeNaRacunu = stanjeNaRacunu + iznos;
    }

    public void isplata(double iznos){
        if(iznos > stanjeNaRacunu){
            System.out.println("Nemate dovolno sredstava" );
        }
        else{
            stanjeNaRacunu = stanjeNaRacunu - iznos;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(vlasnik != null) {
            sb.append("Vlasnik racuna je: ");
            sb.append(vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
            sb.append("\n");
        }
        else{
            sb.append("Racun nema vlasnika");
        }
        sb.append("Stanje na racunu je: ");
        sb.append(stanjeNaRacunu);
        sb.append("\n");
        return sb.toString();
    }
}
