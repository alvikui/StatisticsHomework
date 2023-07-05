package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 180;
        long actualDay = service.sumSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void averageSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 15;
        long actualDay = service.averageSumSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

@Test
    public void maxSales() {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expectedDay = 8;
    long actualDay = service.maxSales(sales);

    Assertions.assertEquals(expectedDay, actualDay);
}

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 9;
        long actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthMinAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 5;
        long actualDay = service.monthMinAverageSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthMaxAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 5;
        long actualDay = service.monthMaxAverageSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
