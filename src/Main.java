// Задача 1
public class Main {
    public static void main(String[] args) {
        int sumOfMonths = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            //total = total + total/700;
            total = total + sumOfMonths;
            i = total / sumOfMonths;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println("Для накопления суммы в 2 459 000 потребуется " + i + " месяца.");

        //Задача 2
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a = a + 1;
        }
        System.out.println();

        for (int q = 10; q >= 1; q--)
            System.out.print(q + " ");
        System.out.println();

        //Задача 3
        long populationSize = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int l = 2022;
        long totalPopulation = ((birthRate - mortality) + 1000);
        while (populationSize >= 12_000_000) {
            populationSize += totalPopulation;
            if (l <= 2031){
                l ++;
                System.out.println("Год " + l + ", численность населения равна " + populationSize + " человек.");

        }
        }



    }

}

