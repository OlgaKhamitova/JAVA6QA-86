package org.example.java6qa86;

public class StatsService {
    public long calculateTotalSales(long[] monthSales) {
        long totalSales = 0;
        for (int month = 0; month < monthSales.length; month++) {
            totalSales = totalSales + monthSales[month];
        }
        return totalSales;
    }

   public long calculateAverageMonthSales(long[] monthSales) {
        long totalSales = this.calculateTotalSales(monthSales);
        return totalSales / monthSales.length;
    }

    public int getMaxMonthSales(long[] monthSales) {
        int maxMonth = 0;
        for (int month = 0; month < monthSales.length; month++) {
            if (monthSales[month] > monthSales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonthSales(long[] monthSales) {
        int minMonth = 0;
        for (int month = 0; month < monthSales.length; month++) {
            if (monthSales[month] < monthSales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth + 1;
    }

    public int calculateMonthQuantityLowerAverageMonthSales(long[] monthSales) {
        long averageMonthSales = this.calculateAverageMonthSales(monthSales);
        int monthQuantity = 0;
        for (int month = 0; month < monthSales.length; month++) {
            if (monthSales[month] < averageMonthSales) {
                monthQuantity = monthQuantity + 1;
            }
        }
        return monthQuantity;
    }

    public int calculateMonthQuantityHigherAverageMonthSales(long[] monthSales) {
        long averageMonthSales = this.calculateAverageMonthSales(monthSales);
        int monthQuantity = 0;
        for (int month = 0; month < monthSales.length; month++) {
            if (monthSales[month] > averageMonthSales) {
                monthQuantity = monthQuantity + 1;
            }
        }
        return monthQuantity;
    }
}


