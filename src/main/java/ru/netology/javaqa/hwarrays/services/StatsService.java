package ru.netology.javaqa.hwarrays.services;

public class StatsService {
    public int minSales(int[] sales) { // номер месяца с минимальными продажами среди просмотренных ранее
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) { // номер месяца с максимальными продажами среди просмотренных ранее
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i;
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(int[] sales) { // Сумма всех продаж
        int sum = 0;
        for (int t : sales) { // цикл для обхода каждого элемента массива
            sum = sum + t; //суммирование каждого элемента массива
        }
        return sum;
    }

    public int averageSales(int[] sales) { // Средняя сумма продаж в месяц
        int sum = 0;
        int average = 0;
        for (int t : sales) { // цикл для обхода каждого элемента массива
            sum = sum + t;
            average = sum / 12;
        }
        return average;
    }

    public int averageSalesMin(int[] sales) { // Количество месяцев с продажами ниже среднего (меньше 15)
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < 15) {
                count++;
            }
        }
        return count;
    }

    public int averageSalesMax(int[] sales) { // Количество месяцев с продажами выше среднего (меньше 15)
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > 15) {
                count++;
            }
        }
        return count;
    }
}

