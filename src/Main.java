public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int xint = 50000;
        byte xbyte = 127;
        short xshort = 32767;
        long xlong = 100000L;
        float xfloat = 1.555555f;
        double xdouble = 1.55555555555;
        System.out.println("Значение переменной xint с типом int равно " + xint);
        System.out.println("Значение переменной xbyte с типом byte равно " + xbyte);
        System.out.println("Значение переменной xshort с типом short равно " + xshort);
        System.out.println("Значение переменной xlong с типом long равно " + xlong);
        System.out.println("Значение переменной xfloat с типом float равно " + xfloat);
        System.out.println("Значение переменной xdouble с типом double равно " + xdouble);

        System.out.println("Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        float f2 = 2.786f;
        short s = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b = 67;

        System.out.println("Задача 3");
        int lydPav = 23;
        int anSer = 27;
        int ekAnd = 30;
        int paper = 480;
        int sheetNorm = paper/(lydPav + anSer + ekAnd);
        System.out.println("На каждого ученика расчитано " + sheetNorm + " листов бумаги.");

        System.out.println("Задача 4");
        int performance = 16/2;
        int minutes = 20;
        int day = minutes * 3 * 24;
        int threeDay = day * 3;
        int month = threeDay * 10;
        System.out.println("За 20 минут машина произвела " + (minutes * performance) + " штук бутылок.");
        System.out.println("За сутки машина произвела " + (day * performance) + " штук бутылок.");
        System.out.println("За три дня машина произвела " + (threeDay * performance) + " штук бутылок.");
        System.out.println("За месяц машина произвела " + (month * performance) + " штук бутылок.");

        System.out.println("Задача 5");
        int banksPaint = 120;
        int consWhitePaint = 2;
        int consBrownPaint = 4;
        int totalClasses = 120/(consWhitePaint + consBrownPaint);
        System.out.println("В школе где " + totalClasses + " классов, нужно " + (totalClasses * consWhitePaint) +
                " банок белой краски и " + (totalClasses * consBrownPaint) + " банок коричневой краски.");

        System.out.println("Задача 6");
        int oneBanana = 80; // масса в граммах
        int totalBanana = 5; // количество
        int milk100 = 105; // 100 мл молока = 105 грамм
        int totalMilk100 = 2;
        int iceCream = 100; // масса одного брикета
        int totalIceCream = 2;
        int egg = 70; // масса одного яйца
        int eggs = 4;
        int massBreakfast = oneBanana * totalBanana + milk100 * totalMilk100 + iceCream * totalIceCream + egg * eggs;
        float massBreakfastKilo = (float) massBreakfast /1000;
        System.out.println("Вес спортзавтрака " + massBreakfast + " грамм или " + massBreakfastKilo + " килограмм.");

        System.out.println("Задача 7");
        int weightLoss250 = 250;
        int weightLoss500 = 500;
        int resultWL = 7000; // количество грамм, которые нужно скинуть
        int daysMax = resultWL/weightLoss250;
        int daysMin = resultWL/weightLoss500;
        int daysAverage = (daysMax + daysMin)/2;
        System.out.println("Чтобы похудеть на 7 кг потребуется минимум " +
                daysMin + " дней и максимум " + daysMax + " дней. Среднее количество " +
                "дней для нужного результата " + daysAverage + ".");

        System.out.println("Задача 8");
        int salaryMary2022 = 67760;
        int salaryDenis2022 = 83690;
        int salaryKristin2022 = 76230;
        float coef = 1.1f;
        int salaryMary2023 = (int) (salaryMary2022 * coef);
        int salaryDenis2023 = (int) (salaryDenis2022 * coef);
        int salaryKristin2023 = (int) (salaryKristin2022 * coef);
        int annualIncomeMary2022 = salaryMary2022 * 12;
        int annualIncomeDenis2022 = salaryDenis2022 * 12;
        int annualIncomeKristin2022 = salaryKristin2022 * 12;
        int annualIncomeMary2023 = salaryMary2023 * 12;
        int annualIncomeDenis2023 = salaryDenis2023 * 12;
        int annualIncomeKristin2023 = salaryKristin2023 * 12;
        System.out.println("Маша теперь получает " + salaryMary2023 + " рублей." +
                " Годовой доход вырос на " +(annualIncomeMary2023-annualIncomeMary2022) +
                " рублей.");
        System.out.println("Денис теперь получает " + salaryDenis2023 + " рублей." +
                " Годовой доход вырос на " +(annualIncomeDenis2023-annualIncomeDenis2022) +
                " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristin2023 + " рублей." +
                " Годовой доход вырос на " +(annualIncomeKristin2023-annualIncomeKristin2022) +
                " рублей.");








    }
}