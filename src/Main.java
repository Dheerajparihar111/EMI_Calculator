import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("===========Wel-come to EMI Calculator===========");
        while (true) {
            System.out.println("______________________");
            System.out.println("| 1) EMI Calculating |");
            System.out.println("| 2) EXIT            |");
            System.out.println("----------------------");
            System.out.print("Enter Your Choice :");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the principal:");
                    double p = input.nextDouble();

                    System.out.println("Enter the Annual Interest Rate:");
                    float R = input.nextFloat();

                    System.out.println("Enter the Months:");
                    int Months = input.nextInt();

                    double rate = R / (12 * 100);

                    double EMI = (p * rate * Math.pow(1 + rate, Months)) /
                            (Math.pow(1 + rate, Months) - 1);

                    System.out.println("Monthly EMI = " + EMI);
                    break;

                case 2:
                    System.out.println("Thank You For Using EMI Calculator");
                    System.exit(0);
            }
        }
    }
}