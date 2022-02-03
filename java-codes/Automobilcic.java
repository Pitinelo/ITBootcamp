package KlaseOsnovne;


//Klasa sluzi za kreiranje automobila, nazvana automoblicnci jer se nalazi u projketu gde voc postoji klasa automobil
public class Automobilcic {

    private String marka;
    private String model;
    private int godinaProizvodnje;
    private int kilometraza;

    Automobilcic(String marka, String model, int godinaProizvodnje, int kilometraza){
        this.marka = marka;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kilometraza = kilometraza;
    }

    public String getMarka () {
        return marka;
    }

    public String getModel () {
        return model;
    }

    public int getGodinaProizvodnje () {
        return godinaProizvodnje;
    }

    public int getKilometraza () {
        return kilometraza;
    }

    public void setMarka (String marka){
        this.marka = marka;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setKilometraza (int kilometraza) {
        this.kilometraza = kilometraza;
    }

    public void setGodinaProizvodnje (int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Marka navedenog autmobila je ");
        sb.append(marka);
        sb.append("\n");
        sb.append("Model navedenog autmobila je ");
        sb.append(model);
        sb.append("\n");
        sb.append("Godina prozivodnje navedenog autmobila je ");
        sb.append(godinaProizvodnje);
        sb.append("\n");
        sb.append("Predjena kilometraza navedenog autmobila je ");
        sb.append(kilometraza);
        sb.append("\n");

        return sb.toString();


    }
}
