//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int sum = 0;
        int accum = 15_000;
        int month = 0;
        while(sum<=2_459_000){
            sum+=accum;
            month++;
            System.out.println("Месяц "+month+", сумма накоплений равна "+sum+" рублей");
        }
        System.out.println("Задача 2");
        int numForWhile = 0;
        while (numForWhile<10){
            numForWhile++;
            System.out.print(numForWhile+" ");
        }
        System.out.println();
        for(int i =10; i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int people = birth-death;
        int populationYear = population/1000*people;
        int year = 0;
        while(year<10){
            population+=populationYear;
            year++;
            System.out.println("Год "+year+", численность населения составляет "+population);
        }
        System.out.println("Задача 4");
        int initialDeposit = 15_000;
        int sevenPercentFromDeposit = initialDeposit/100*7;
        int needSum = initialDeposit;
        int month2 = 0;
        while(needSum<12_000_000){
            month2++;
            needSum+=sevenPercentFromDeposit;
            if (month2 % 6 == 0) {//добавленое условие из 5ой задачи
                System.out.println("Месяц " + month2 + " Сумма накоплений равна " + needSum);
            }
        }
        System.out.println("Задача 6");
        int initialDeposit1 = 15_000;
        int persents = initialDeposit1/100*7;
        int accumSum = initialDeposit1;
        int totalMonths = 9*12;
        int months = 0;
        while (months<totalMonths){
            accumSum+=persents;
            months++;
            if(months%6==0){
                System.out.println("Месяц "+months+ ", Сумма накоплений равна "+accumSum);
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
        for (int i = 0; i < nextYear; i += 79) {
            if (i > previousYear) {
                System.out.println("Годы прилёта кометы " + i);
            }
        }
    }
}