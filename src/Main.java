//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int total = 0;
        int salary = 15_000;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
        int numForWhile = 0;
        while (numForWhile < 10) {
            numForWhile++;
            System.out.print(numForWhile + " ");
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int people = birth - death;
        int populationYear = population / 1000 * people;
        int year = 0;
        while (year < 10) {
            population += populationYear;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        int salary1 = 15000;
        int total1 = 0;
        int i = 0;
        while (total1 <= 12_000_000) {
            total1 = total1 + total1 * 7 / 100;
            i++;
            total1 = total1 + salary1;
            System.out.println(i + " месяц " + total1 + " сумм накоплений");
        }
        System.out.println("Задача 5");
        int salary2 = 15000;
        int total2 = 0;
        int b = 0;
        while (total2 <= 12_000_000) {
            total2 = total2 + total2 * 7 / 100;
            b++;
            total2 = total2 + salary2;
            if (b % 6 == 0) {
                System.out.println(b + " месяц " + total + " сумм накоплений");
            }
        }
        System.out.println("Задача 6");
        int initialDeposit1 = 15_000;
        int persents = initialDeposit1 / 100 * 7;
        int accumSum = initialDeposit1;
        int totalMonths = 9 * 12;
        int months = 0;
        while (months < totalMonths) {
            accumSum += persents;
            months++;
            if (months % 6 == 0) {
            System.out.println("Месяц " + months + ", Сумма накоплений равна " + accumSum);
            }
        }
        System.out.println("Задача 7");
        int friday = 5;
        int dayInMonth = 31;
        while (friday <= dayInMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
        System.out.println("Задача 8");
        int previousYear = 2023 - 200;
        int nextYear = 2023 + 100;
        for (int c = 0; c < nextYear; c += 79) {
            if (c > previousYear) {
            System.out.println(c);
            }
        }
    }
}