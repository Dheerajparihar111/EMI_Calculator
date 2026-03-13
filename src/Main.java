import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("===========Wel-come to EMI Calculator===========");
        while (true) {
            System.out.println("________________________");
            System.out.println("| 1) EMI Calculating   |");
            System.out.println("| 2) Simple Interest   |");
            System.out.println("| 3) Compound Interest |");
            System.out.println("| 3) EXIT              |");
            System.out.println("------------------------");
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

                    double totalPayment = EMI * Months;

                    double totalInterest = totalPayment - p;
                    System.out.println("Monthly EMI = " + Math.round(EMI));
                    System.out.println("Total Payment = " +Math.round( totalPayment));
                    System.out.println("Total Interest = " + Math.round(totalPayment));

                    break;
                case 2:

                    System.out.println("Enter Principal:");
                    double simplePrincipal = input.nextDouble();

                    System.out.println("Enter Rate:");
                    double simpleInterestRate = input.nextDouble();

                    System.out.println("Enter Time (years):");
                    double timePeriod = input.nextDouble();

                    double SI = (simplePrincipal * simpleInterestRate * timePeriod) / 100;

                    System.out.println("Simple Interest = " + SI);
                    break;

                case 3:

                    System.out.println("Enter Principal:");
                    double compoundPrincipal = input.nextDouble();

                    System.out.println("Enter Rate:");
                    double compoundRate = input.nextDouble();

                    System.out.println("Enter Time (years):");
                    double compundTimePeriod = input.nextDouble();

                    double compoundInterest = compoundPrincipal * Math.pow((1 + compoundRate / 100), compundTimePeriod) - compoundPrincipal;

                    System.out.println("Compound Interest = " + compoundInterest);
                    break;

                case 4:
                    System.out.println("Thank You For Using EMI Calculator");
                    System.exit(0);
            }
        }
    }
}