package sk.stuba.fei.uim.oop;

import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        final int MONTHS_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int P = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float monthly_interest_rate = (scanner.nextFloat() / PERCENT) / MONTHS_YEAR;

        System.out.print("Periods (Years): ");
        int num_pays = (scanner.nextInt() * MONTHS_YEAR);

        double mortgage = App.mortgage(P, monthly_interest_rate, num_pays);
        String FormatedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + FormatedMortgage);
    }

    public static double mortgage(int principal, float monthly_interest_rate, int num_pays){
        return principal * (monthly_interest_rate * (Math.pow(1+ monthly_interest_rate, num_pays)))
                         / (Math.pow(1+ monthly_interest_rate, num_pays) - 1);
    }

}
