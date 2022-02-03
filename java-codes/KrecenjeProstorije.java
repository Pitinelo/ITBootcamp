import java.util.Scanner;

public class KrecenjeProstorije {


    static Scanner scanner = new Scanner(System.in);


        public static void main(String[] args) {


            // izracunati povrsinu okrecene prostorije, ali sa uslovom da god. nije nepravilno napisana (neg. broj i 0)



            double a;
            double b;
            double c;
            double d;

            System.out.print("Upisati duzinu prostorije u m: ");
            a = scanner.nextDouble();

            System.out.print("Upisati sirinu prostorije u m: ");
            b = scanner.nextDouble();

            System.out.print("Upisati visinu prostorije u m: ");
            c = scanner.nextDouble();

            if (a > 0 && b > 0 && c > 0){
                // izracunavanje okrecene povrsine sa krecenjem plafona
                d = 2 * a * c + 2 * b * c + a * b;

                System.out.println("Okrecena povrsina iznosi: " + d + "m");
        }

                else {
                    System.out.println("Uneli ste negativnu vrednost ili vrednost 0 i program se ne moze izvrsiti!");
                }
            }

        }


