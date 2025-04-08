public class Main {
    public static void main(String[] args) {

        byte myByte = 25;
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        short myShort = 270;
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        int myInt = 100;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        long myLong = 3000L;
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        float myFloat = 2.75f;
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        double myDouble = 3.6;
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        float value1 = 27.12f;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        short value4 = 569;
        short value5 = -159;
        short value6 = 27897;
        byte value7 = 67;

        int pupilsLudmila = 23;
        int pupilsAnna = 27;
        int pupilsEkaterina = 30;
        int totalSheets = 480;
        int totalPupils = pupilsLudmila + pupilsAnna + pupilsEkaterina;
        int sheetsPerPupil = totalSheets / totalPupils;
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги.");

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
