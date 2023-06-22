package ru.netology.javaqa.hwarrays.services;

public class StatsService {
    public int minSales(long[] sales) { // номер месяца с минимальными продажами среди просмотренных ранее
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) { // номер месяца с максимальными продажами среди просмотренных ранее
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i;
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sumSales(long[] sales) { // Сумма всех продаж
        long sum = 0;
        for (long t : sales) { // цикл для обхода каждого элемента массива
            sum+=t; //sum = sum + t; суммирование каждого элемента массива
        }
        return sum;
    }

    public long averageSales(long[] sales) { // Средняя сумма продаж в месяц
        return sumSales(sales) / sales.length;
        // long average = sumSales(sales) / sales.length;
        // return average;
    }

    public int averageSalesMin(long[] sales) { // Количество месяцев с продажами ниже среднего (меньше 15)
        int count = 0;
        long averageSale = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int averageSalesMax(long[] sales) { // Количество месяцев с продажами выше среднего (меньше 15)
        int count = 0;
        long averageSale = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                count++;
            }
        }
        return count;
    }
}

