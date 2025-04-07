public class Main {
    public static void main(String[] args) {

        byte a = 25;
        System.out.println(a);
        short b = 270;
        System.out.println(b);
        int c = 1000000000;
        System.out.println(c);
        long d = 30000000000000000L;
        System.out.println(d);
        float e = 2.75f;
        System.out.println(e);
        double f = 3.6;
        System.out.println(f);

        double A = 27.12;
        System.out.println(A);
        long B = 987678965549L;
        System.out.println(B);
        float C = 2.786f;
        System.out.println(C);
        short D = 569;
        System.out.println(D);
        short E = -159;
        System.out.println(E);
        short F = 27897;
        System.out.println(F);
        char G = 67;
        System.out.println(G);

        char teacherOne = 23;
        char teacherTwo = 27;
        char teacherThree =30;
        int totalStudents = teacherOne + teacherTwo + teacherThree;
        System.out.println("Учеников" + totalStudents + "Количество" );
        short paper = 480;
        short sheetPaper = 480 / 80;
        System.out.println("Бумаги" + sheetPaper +"шт");

        int bottlesPerMinute = 8;
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела"+ bottlesIn20Minutes + "штук бутылок");
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        System.out.println("За сутки машина произвела"+ bottlesPerDay + "штук бутылок");
        int bottlesIn3Days = bottlesPerDay * 3;
        System.out.println("За три дня машина произвела" + bottlesIn3Days + "Штук бутылок");
        int bottlesInMonth = bottlesPerDay * 30;
        System.out.println("За месяц" + bottlesInMonth + "штук бутылок");

        int totalCans = 120;
        int cansPerClass = 6;
        int numberOfClasses = totalCans / cansPerClass;
        int whiteCans = numberOfClasses * 2;
        int brownCans = numberOfClasses * 4;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски.");

        int bananasWeight = 5 * 80;
        int milkWeight = (200 / 100) * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int totalWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalWeightKg = totalWeightGrams / 1000f;
        System.out.println("Общий вес завтрака: " + totalWeightGrams + " грамм");
        System.out.println("Общий вес завтрака: " + totalWeightKg + " килограмм");

        int weightLossGoalGrams = 7000;
        int dailyLossMin = 250;
        int dailyLossMax = 500;
        int daysMin = weightLossGoalGrams / dailyLossMin;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, потребуется " + daysMin + " дней.");
        int daysMax = weightLossGoalGrams / dailyLossMax;
        System.out.println("Если спортсмен будет терять по 500 грамм в день, потребуется " + daysMax + " дней.");
        int averageDays = (daysMin + daysMax) / 2;
        System.out.println("В среднем потребуется " + averageDays + " дней для достижения цели.");

        double currentSalaryMasha = 67760;
        double currentSalaryDenis = 83690;
        double currentSalaryKristina = 76230;
        double newSalaryMasha = currentSalaryMasha * 1.1;
        double newSalaryDenis = currentSalaryDenis * 1.1;
        double newSalaryKristina = currentSalaryKristina * 1.1;
        double annualIncomeBeforeMasha = currentSalaryMasha * 12;
        double annualIncomeBeforeDenis = currentSalaryDenis * 12;
        double annualIncomeBeforeKristina = currentSalaryKristina * 12;
        double annualIncomeAfterMasha = newSalaryMasha * 12;
        double annualIncomeAfterDenis = newSalaryDenis * 12;
        double annualIncomeAfterKristina = newSalaryKristina * 12;
        double differenceMasha = annualIncomeAfterMasha - annualIncomeBeforeMasha;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        double differenceDenis = annualIncomeAfterDenis - annualIncomeBeforeDenis;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        double differenceKristina = annualIncomeAfterKristina - annualIncomeBeforeKristina;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");


















    }
    }
