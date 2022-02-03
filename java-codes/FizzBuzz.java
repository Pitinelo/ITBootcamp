import java.util.Scanner;
//Napravi program koji ispisuje Fizz ukoliko je broj deljiv samo sa 3, Buzz ukoliko je deljiv samo sa 5, a FizzBuzz ukoliko je deljiv i sa 3 i sa 5.
public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti pozitivan realan broj: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if ( i % 3 == 0 && i % 5 == 0){
                System.out.println(i + ": FizzBuzz");
            }else if (i % 3 ==0){
                System.out.println(i +": Fizz");
            }else if (i % 5 == 0){
                System.out.println(i +": Buzz");
            }else {
                System.out.println(i + ":");
            }
        }
    }
}
