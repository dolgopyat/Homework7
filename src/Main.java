public class Main {
    public static void main(String[] args) {
        // Задача 1.
        System.out.println("   Задача 1.");
        int capital = 29000;
        int total = 0;
        for (int i = 1; total <= 2_459_000; i++) {
            total += total/100;
            total += capital;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача 2.
        System.out.println("   Задача 2.");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }

        // Задача 3.
        System.out.println("   Задача 3.");
        int population = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double deathRate = (double) 8 / 1000;
        for (i = 1; i <= 10; i++) {
            population = population + (int) (population * birthRate) - (int) (population * deathRate);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        // Задача 4 + 5
        System.out.println("   Задача 4 + 5.");
        int capital1 = 15000;
        int total1 = 0;
        for (int b = 1; total1 <= 12_000_000; b++) {
            total1 += (total1 / 100) * 7;
            total1 += capital1;
            if (b % 6 == 0) {
                System.out.println("Месяц " + b + ", сумма накоплений равна " + total1 + " рублей");
            }
        }

        // Задача 6.
        System.out.println("   Задача 6.");
        int capital2 = 15000;
        int total2 = 0;
        for (int b = 1; b <= (9 * 12); b++) {
            total2 += (total2 / 100) * 7;
            total2 += capital2;
            if (b % 6 == 0) {
                System.out.println("Месяц " + b + ", сумма накоплений равна " + total2 + " рублей");
            }
        }

        // Задача 7.
        System.out.println("   Задача 7.");
        int friday = 5;
        for (int a = friday; a <= 31; a = a + 7) {
                System.out.println("Сегодня пятница, " + a + "-е число. Необходимо подготовить отчет.");
        }

        // Задача 8.
        System.out.println("   Задача 8.");
        for (int d = 0; d <= (2022 + 100); d = d + 79) {
            if (d >= (2022 - 200) && d <= (2022 + 100)) {
                System.out.println(d);
            }
        }

        // Задача 9.
        System.out.println("   Задача 9.");
        for (int с = 1; с <= 10; с++){
            System.out.println("2 x " + с + " = " + 2 * с);
        }
    }
}