package org.example.java6qa86;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long averageMonthSales = service.calculateAverageMonthSales(monthSales);
        int monthQuantity = service.calculateMonthQuantityHigherAverageMonthSales(monthSales);
        System.out.println(monthQuantity);
    }
}