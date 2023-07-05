package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;
        }

        return sumMonth;
    }

    // Средняя сумма продаж в месяц
    public int averageSumSales(long[] sales) {
        int sumMonth = 0;
        int averageSum = 0;

        sumMonth = sumSales(sales);
        averageSum = sumMonth / 12;

        return averageSum;
    }

    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }

        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }

        return maxMonth + 1;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int monthMinAverageSales(long[] sales) {
        int minAverageMonth = 0;
        int averageSum = averageSumSales(sales);

        for (long sale : sales) {
            if (sale < averageSum) {
                minAverageMonth++;
            }
        }

        return minAverageMonth;
    }

    // Количество месяцев, в которых продажи были выше среднего
    public int monthMaxAverageSales(long[] sales) {
        int maxAverageMonth = 0;
        int averageSum = averageSumSales(sales);

        for (long sale : sales) {
            if (sale > averageSum) {
                maxAverageMonth++;
            }
        }

        return maxAverageMonth;
    }

}

