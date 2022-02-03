import java.util.Scanner;

//Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

public class PasteBin7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //korisnik unosi dan i mesec rodjenja
        System.out.print("Unesi dan rodjenja: ");
        int dan = sc.nextInt();

        System.out.print("Unesi mesec rodjenja: ");
        int mesec = sc.nextInt();
    //switch grananje koje na osnovu zadatog meseca prolazi kroz sve datume i ispisuje poruku sa horoskopskim znakom
        switch (mesec) {
            case 1:
                if (dan <= 20 && dan >= 1) {
                    System.out.println("Vas horoskopski znak je Jarac.");
                } else if (dan >= 21 && dan <= 31) {
                    System.out.println("Vas horoskopski znak je Vodolija.");
                } else {
                    System.out.println("Izabarani mesec ima 31 dan.");
                }
                break;

            case 2:
                if (dan <= 19 && dan >= 1) {
                    System.out.println("Vas horoskopski znak je Vodolija.");
                } else if (dan >= 20 && dan <= 29) {
                    System.out.println("Vas horoskopski znak je Ribe.");
                } else {
                    System.out.println("Izabarani mesec ima 29 dana.");}
                    break;

            case 3:
                if (dan <= 20 && dan >= 1) {
                    System.out.println("Vas horoskopski znak je Ribe.");
                } else if (dan >= 21 && dan <= 31) {
                    System.out.println("Vas horoskopski znak je Ovan.");
                } else {
                    System.out.println("Izabarani mesec ima 31 dan.");
                }
                break;

            case 4:
                if(dan <= 20 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Ovan.");
                }else if (dan >= 21 && dan <= 30){
                    System.out.println("Vas horoskopski znak je Bik.");
                }else{
                    System.out.println("Izabarani mesec ima 30 dana.");
                }break;

            case 5:
                if(dan <= 21 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Bik.");
                }else if (dan >= 22 && dan <= 31){
                    System.out.println("Vas horoskopski znak je Blizanci.");
                }else{
                    System.out.println("Izabarani mesec ima 31 dan.");
                }break;

            case 6:
                if(dan <= 21 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Blizanci.");
                }else if (dan >= 22 && dan <= 30){
                    System.out.println("Vas horoskopski znak je Rak.");
                }else{
                    System.out.println("Izabarani mesec ima 30 dana.");
                }break;

            case 7:
                if(dan <= 22 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Rak.");
                }else if (dan >= 22 && dan <= 31){
                    System.out.println("Vas horoskopski znak je Lav.");
                }else{
                    System.out.println("Izabarani mesec ima 31 dan.");
                }break;

            case 8:
                if(dan <= 23 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Lav.");
                }else if (dan >= 24 && dan <= 31){
                    System.out.println("Vas horoskopski znak je Devica.");
                }else{
                    System.out.println("Izabarani mesec ima 31 dan.");
                }break;

            case 9:
                if(dan <= 23 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Devica.");
                }else if (dan >= 24 && dan <= 30){
                    System.out.println("Vas horoskopski znak je Vaga.");
                }else{
                    System.out.println("Izabarani mesec ima 30 dana.");
                }break;

            case 10:
                if(dan <= 23 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Vaga.");
                }else if (dan >= 24 && dan <= 31){
                    System.out.println("Vas horoskopski znak je Skorpija.");
                }else{
                    System.out.println("Izabarani mesec ima 31 dan.");
                }break;

            case 11:
                if(dan <= 22 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Skorpija.");
                }else if (dan >= 23 && dan <= 31){
                    System.out.println("Vas horoskopski znak je Strelac.");
                }else{
                    System.out.println("Izabarani mesec ima 30 dana.");
                }break;

            case 12:
                if(dan <= 21 && dan >= 1){
                    System.out.println("Vas horoskopski znak je Strelac.");
                }else if (dan >= 22 && dan <= 31){
                    System.out.println("Vas horoskopski znak je Jarac.");
                }else{
                    System.out.println("Izabarani mesec ima 31 dan.");
                }break;
        }

    }
}
