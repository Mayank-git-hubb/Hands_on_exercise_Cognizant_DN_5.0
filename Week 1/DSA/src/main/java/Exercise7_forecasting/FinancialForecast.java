package Exercise7_forecasting;

public class FinancialForecast {

    public static double futureValue(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);

    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double future = futureValue(currentValue, growthRate, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, future);

        System.out.println();

        System.out.println("Time Complexity : O(n)");
        System.out.println("Space Complexity : O(n)");
        System.out.println("Optimization : Dynamic Programming or Iterative Approach");

    }

}