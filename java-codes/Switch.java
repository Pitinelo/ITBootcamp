import java.util.Scanner;

//Putem f-je switch kreiraj program koji z brojeve 1, 2 i 3 ispisuje njihovu vrednost tekstualno, a za ostale brojeve ispisuje poruku "Nisam uneo vise brojeva"
public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj od 1 do 12: ");
        char broj = sc.next().charAt(0);


        switch (broj){

            case '1' :
                System.out.println("Jedan.");
                break;

            case 2:
                System.out.println("Dva");
                break;

            case 3:
                System.out.println("Tri");
                break;
            default:
                System.out.println("Nisam uneo vise brojeva. ");

        }
    }
}
