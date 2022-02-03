public class Datum {

    private int dan;
    private int mesec;
    private int godina;

    public Datum(int dan, int mesec, int godina) {
        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
        if (!proveriDatum(dan,mesec,godina)){
            System.out.println("Uneli ste nepravilan datum.");
        }
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
        if (!proveriDatum(godina,mesec,dan)){
            System.out.println("Uneli ste nepravilan datum.");
        }
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
        if (!proveriDatum(godina,mesec,dan)){
            System.out.println("Uneli ste nepravilan datum.");
        }
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
        if (!proveriDatum(godina,mesec,dan)){
            System.out.println("Uneli ste nepravilan datum.");
        }
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();

        sb.append(dan).append("-").append(mesec).append("-").append(godina);

        return sb.toString();
    }

    private static boolean proveriDatum (int dan, int mesec, int godina){
        boolean tacanDatum = true;

        if (godina < 2000){
            tacanDatum = false;
        }else if (mesec > 12 || mesec < 1){
            tacanDatum = false;
        }else if (mesec == 1 || mesec == 3 || mesec == 5 || mesec ==7 || mesec ==8 || mesec == 10 || mesec == 12){
            if (dan <1 || dan > 31){
                tacanDatum = false;
            }
        }else if (godina % 4 != 0 && godina % 400!= 0 && mesec ==2){
            if (dan <1 || dan > 28){
                tacanDatum = false;
            }
        }else if (godina % 4 == 0 || godina % 400 == 0 && mesec == 2){
            if (dan < 1 || dan > 29){
                tacanDatum = false;
            }
        }

        return tacanDatum;
    }
}
