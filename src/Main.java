public class Main {
    public static void main(String[] args) {
       //Задача 1
        byte a = 120;
        short b = 30000;
        int c = 666666;
        long e = 98765332L;
        float l =  3.1f;
        double g = 1.321654987;
        System.out.println("Значение переменной a с типом byte равно " +a);
        System.out.println("Значение переменной b с типом short равно " +b);
        System.out.println("Значение переменной c с типом int равно " +c);
        System.out.println("Значение переменной e с типом long равно " +e);
        System.out.println("Значение переменной l с типом float равно " +l);
        System.out.println("Значение переменной g с типом double равно " +g);

        //Задача 2
        double doub = 27.12;
        long lon = 987678965549L;
        float w = 2.786f;
        boolean z = false;
        short asd = 569;
        short x1 = 159;
        int v = 27897;
        byte r = 67;
        System.out.println("Задача 2: " +doub+ "," +lon+ "," +w+ "," +z+ "," +asd+ "," +x1+ "," +v+ "," +r);

        //Задача 3
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short allPaper = 480;
        short allStudents = (short) (lpStudents + asStudents + eaStudents);
        int personalPapers = allPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + personalPapers +" листов бумаги");

        //Задача 4
        byte bottlePer1min = 8;
        int bottlePer20min = bottlePer1min * 20;
        int bottlePer24h = bottlePer20min * 3 * 24;
        int bottlePer3d = bottlePer24h * 3;
        int bottlePer1m = bottlePer3d * 10;
        System.out.println("За 20 минут машина произвела " +bottlePer20min+ " штук бутылок");
        System.out.println("За 24 часа машина произвела " +bottlePer24h+ " штук бутылок");
        System.out.println("За 3 дня машина произвела " +bottlePer3d+ " штук бутылок");
        System.out.println("За 1 месяц машина произвела " +bottlePer1m+ " штук бутылок");

        //Задача 5
        byte numOfClasses = 120/6;
        int whiteCol = numOfClasses * 2;
        int brownCol = numOfClasses * 4;
        System.out.println("В школе, где " + numOfClasses + " классов, нужно " + whiteCol + " банок белой краски и " + brownCol + " банок коричневой краски");

        //Задача 6
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int sumWeightG = banana+milk+iceCream+eggs;
        float sumWeightKg = sumWeightG/1000f;
        System.out.println("Общий вес завтрака " +sumWeightG+ " грамм");
        System.out.println("Общий вес завтрака " +sumWeightKg+ " килограмм");

        //Задача 7
        int targetWeight = 7000;
        int days250GrPerDay = targetWeight/250;
        int days500GrPerDay = targetWeight/500;
        int mediaDays = (days250GrPerDay + days500GrPerDay) / 2;
        System.out.println( days250GrPerDay +" дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println( days500GrPerDay +" дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println( mediaDays +" день уйдёт в среднем на похудение, для достижения результата");

        //Задача 8
        int zpMasha = 67760;
        int zpUpMasha = (zpMasha * 10 /100) + zpMasha;
        int yearZpUpMasha = (zpMasha * 10 /100) * 12;
        int zpDen = 83690;
        int zpUpDen = (zpDen * 10 /100) + zpDen;
        int yearZpUpDen = (zpDen * 10 /100) * 12;
        int zpKris = 76230;
        int zpUpKris = (zpKris * 10 /100) + zpKris;
        int yearZpUpKris = (zpKris * 10 /100) * 12;
        System.out.println("Маша теперь получает " +zpUpMasha+ " рублей. Годовой доход вырос на " +yearZpUpMasha+ " рублей");
        System.out.println("Денис теперь получает " +zpUpDen+ " рублей. Годовой доход вырос на " +yearZpUpDen+ " рублей");
        System.out.println("Кристина теперь получает " +zpUpKris+ " рублей. Годовой доход вырос на " +yearZpUpKris+ " рублей");







    }
}