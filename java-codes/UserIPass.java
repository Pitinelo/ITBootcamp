import java.util.Scanner;

//Pravljenje login sa vec uanpred odredjenim user i pass , gde korisnik ima tri pokusaja  da se uloguje, ali ispisuje posebne poruke za pogresan user i za pogresan pass

public class UserIPass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String user = "Pitinelo";
        String pass = "Proba1";
        int brojac = 0;
    // petlja koja moze trajati maximum tri putai prekida se kada korisnik unese tacne podatke
        for (int i = 1; i <=3; i++){

            System.out.print("Uneti username: ");
            String unesenUser = sc.next();

            System.out.print("Uneti password: ");
            String unetiPass = sc.next();

            if(unesenUser.equals (user) && unetiPass.equals (pass) ){
                System.out.println("Uspesno ste se ulogovali");
                break;
            }else if (!unesenUser.equals(user)){
                System.out.println("Uneti username je pogresan.");
                brojac++;
            }else {
                System.out.println("Uneti password je pogresan.");
                brojac++;
            }


        }

        if (brojac == 3){
            System.out.println("Uneli ste pogresan username ili password 3 puta. Molimo Vas, pokusajte kasnije.");;
        };


    }
}
