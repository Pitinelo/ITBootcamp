package Domaci;


//Klasa koja kreira automobil
public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;
    private String vlasnik;

//Dva konstruktora, jer je moguce da automobil nema vlasnika
    Automobil (String marka, String model, int serijskiBroj, String vlasnik){
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;

    }

    Automobil (String marka, String model, int serijskiBroj){
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = null;

    }



    public String getMarka () {
        return marka;
    }

    public String getModel () {
        return model;
    }

    public String getVlasnik () {
        return vlasnik;
    }

    public int getSerijskiBroj () {
        return serijskiBroj;
    }

    public void setVlasnik (String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Marka automobila je ");
        sb.append(marka);
        sb.append("\n");
        sb.append("Model automobila je ");
        sb.append(model);
        sb.append("\n");
        sb.append("Serijski broj automobila je ");
        sb.append(serijskiBroj);
        sb.append("\n");
        if (vlasnik == null){
            sb.append("Automobil nema vlasnika.");
        }else {
            sb.append("Vlasnik automobila je ");
            sb.append(vlasnik);
            sb.append("\n");
        }

        return sb.toString();

    }
}
