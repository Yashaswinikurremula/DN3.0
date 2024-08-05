package Exec7;

public class Main {
    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.05;
        int years = 10;

        double futureValueIterative = FinancialForecasting.calculateFutureValueIterative(currentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years (Iterative): " + futureValueIterative);

        double futureValueRecursive = FinancialForecasting.calculateFutureValueRecursive(currentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years (Recursive): " + futureValueRecursive);
    }
}
