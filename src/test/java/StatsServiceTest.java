import org.example.java6qa86.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {
    @Test
    public void testTotalSales() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedTotalSales = 180;
        long actualTotalSales = service.calculateTotalSales(monthSales);
        Assertions.assertEquals(expectedTotalSales, actualTotalSales);

    }

    @Test
    public void testAverageMonthSales() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageMonthSales = 15;
        long actualAverageMonthSales = service.calculateAverageMonthSales(monthSales);
        Assertions.assertEquals(expectedAverageMonthSales, actualAverageMonthSales);
    }

    @Test
    public void testMaxMonthSales() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonthSales = 6;
        long actualMaxMonthSales = service.getMaxMonthSales(monthSales);
        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }

    @Test
    public void testMinMonthSales() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMonthSales = 9;
        long actualMinMonthSales = service.getMinMonthSales(monthSales);
        Assertions.assertEquals(expectedMinMonthSales, actualMinMonthSales);
    }

    @Test
    public void testMonthQuantityLowerAverageMonthSales() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthQuantityLowerAverageMonthSales = 5;
        long actualMonthQuantityLowerAverageMonthSales = service.calculateMonthQuantityLowerAverageMonthSales(monthSales);
        Assertions.assertEquals(expectedMonthQuantityLowerAverageMonthSales, actualMonthQuantityLowerAverageMonthSales);
    }

    @Test
    public void testMonthQuantityHigherAverageMonthSales() {
        StatsService service = new StatsService();
        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthQuantityHigherAverageMonthSales = 5;
        long actualMonthQuantityHigherAverageMonthSales = service.calculateMonthQuantityHigherAverageMonthSales(monthSales);
        Assertions.assertEquals(expectedMonthQuantityHigherAverageMonthSales, actualMonthQuantityHigherAverageMonthSales);
    }
}
