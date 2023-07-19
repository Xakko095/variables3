public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int i = -1;
        System.out.println("Значение переменной a с типом int равно " + i);
        byte b = 1;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = -1000;
        System.out.println("Значение переменной c с типом short равно " + s);
        long l = 3L;
        System.out.println("Значение переменной d с типом long равно " + l);
        float f = -2.55f;
        System.out.println("Значение переменной e с типом float равно " + f);
        double d = 3.5;
        System.out.println("Значение переменной f с типом double рано " + d);

        System.out.println("Задача2");

        float f1 = 27.12f;
        long l1 = 98767896554L;
        double d1 = 2.786;
        int i1 = 569;
        short s1 = -159;
        short s2 = 27897;
        byte b1 = 67;

        System.out.println("Задача3");

        int luda = 23;
        int anna = 27;
        int katya = 30;
        int sheets = 480;
        int totalPeople = luda + anna + katya;
        int total = sheets / totalPeople;
        System.out.println("На каждого ученика расссчитано " + total + " листов бумаги");

        System.out.println("Задача4");

        int performancePerMin = 16 / 2;
        int performancePer20Min = 20 * performancePerMin;
        int performancePerDay = 60 * 24 * performancePerMin;
        int performancePer3Day = 3 * performancePerDay;
        int performancePerMonth = 10 * performancePer3Day;
        System.out.println("За 20 минут машина произвела " + performancePer20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + performancePerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performancePer3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + performancePerMonth + " штук бутылок");

        System.out.println("Задача5");
        int cans = 120;
        int totalClass = cans / (2 + 4);
        int white = totalClass * 2;
        int brown = totalClass * 4;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + white + " банок белой краски и "
                + brown + " банок коричневой краски");

        System.out.println("Задача6");
        int bananaWeight = 5 * 80;
        double milkWeight = 200 * 1.05;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        double totalGrams = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalKg = totalGrams / 1000;
        System.out.println(totalGrams + " гр");
        System.out.println(totalKg + " кг");

        System.out.println("Задач7");
        int totalGrams1 = 7 * 1000;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int totalDays250 = totalGrams1 / minGramsPerDay;
        int totalDays500 = totalGrams1 / maxGramsPerDay;
        int averageDays = (totalDays250 + totalDays500) / 2;
        System.out.println(totalDays250);
        System.out.println(totalDays500);
        System.out.println(averageDays);

        System.out.println("Задача8");
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;

        float maxSalaryMasha = masha * 1.1f;
        float maxSalaryDenis = denis * 1.1f;
        float maxSalaryKris = kris * 1.1f;

        int mashaSalaryYear = masha * 12;
        int denisSalaryYear = denis * 12;
        int krisSalaryYear = kris * 12;

        float yearSalaryMasha = maxSalaryMasha * 12f;
        float yearSalaryDenis = maxSalaryDenis * 12f;
        float yearSalaryKris = maxSalaryKris * 12f;

        System.out.println("Маша теперь получает " + maxSalaryMasha + "рублей. Годовой доход вырос на " +
                (yearSalaryMasha - mashaSalaryYear) + "рублей ");
        System.out.println("Денис теперь получает " + maxSalaryDenis + "рублей. Годовой доход вырос на "
                + (yearSalaryDenis - denisSalaryYear) + "рублей ");
        System.out.println("Кристина теперь получает " + maxSalaryKris + "рублей. Годовой доход вырос на "
                + (yearSalaryKris - krisSalaryYear) + "рублей. ");
    }
}