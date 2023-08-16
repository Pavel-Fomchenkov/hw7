public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int payment = 15000;
        double total = 0.0;
        int month = 0;
        while (total < 2_459_000) {
            total = Math.round((total * 1.01 + payment) * 100) / 100.0;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (; i > 0; ) { // можно увеличение итератора внести в условие цикла, но так красивее
            System.out.print(i-- + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int i = 0;
        int population = 12_000_000;
        int birthPerThousand = 17;
        int deathPerThousand = 8;

        System.out.println("Начальная популяция составляет " + population + " чел.");
        do {
            i++;
            population = population + population / 1000 * (birthPerThousand - deathPerThousand);
            System.out.println("Год " + i + ", численность населения составляет " + population + " чел.");
        } while (i < 10);
    }

    public static void task4() {
        double total = 15000.0;
        byte monthPercent = 7;
        int i = 0;
        do {
            total = total + total * monthPercent / 100.0;
            total = Math.round(total * 100) / 100.0;
            System.out.println(++i + " месяц, сумма накоплений: " + total + " руб.");
        } while (total < 12_000_000.0);
    }

    public static void task5() {
        double total = 15000.0;
        byte monthPercent = 7;
        int i = 0;
        do {
            total = total + total * monthPercent / 100.0;
            total = Math.round(total * 100) / 100.0;
            if (++i % 6 == 0) {
                System.out.println(i + " месяц, сумма накоплений: " + total + " руб.");
            }
        } while (total < 12_000_000.0);
    }

    public static void task6() {
        double total = 15000.0;
        byte monthPercent = 7;
        int i = 0;
        do {
            total = total + total * monthPercent / 100.0;
            total = Math.round(total * 100) / 100.0;
            if (++i % 6 == 0) {
                System.out.println(i + " месяц, сумма накоплений: " + total + " руб.");
            }
        } while (i < (9 * 12));
    }

    public static void task7() {
        for (int friday = 3; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        int startingYear = 1923;
        int endingYear = startingYear + 200;
        int year = startingYear - startingYear % 79;
        for (; year <= endingYear; year += 79) {
            System.out.println(year);
        }
    }
}