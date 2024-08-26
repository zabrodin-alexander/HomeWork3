public class Main {
    public static void main(String[] args) {
        System.out.println();
        byte a = 100;
        System.out.println(a);
        short b = 1000;
        System.out.println(b);
        int c = 10000;
        System.out.println(c);
        long d = 100000L;
        System.out.println(d);
        float e = 1.123456f;
        System.out.println(e);
        double f = 1.1234567;
        System.out.println(f);
        System.out.println();

        float one = 27.12f;
        System.out.println(one);
        long two = 987678965549L;
        System.out.println(two);
        float three = 2.786f;
        System.out.println(three);
        short four = 569;
        System.out.println(four);
        int five = 27897;
        System.out.println(five);
        byte six = 67;
        System.out.println(six);
        System.out.println();

        byte oneTeacher = 23;
        byte twoTeacher = 27;
        byte threeTeacher = 30;
        int student = oneTeacher + twoTeacher + threeTeacher;
        short paper = 480;
        int oneStudent = paper / student;
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");
        System.out.println();

        byte oneMinutes = 16 / 2;
        System.out.println("За 1 минуту машина произвела " + oneMinutes + " штук бутылок");
        int twentyMinutes = 20 * oneMinutes;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        byte oneHours = 60;
        int day = (24 * oneHours) * oneMinutes;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За трое суток машина произвела " + threeDay + " штук бутылок");
        int oneMonth = day * 30;
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");
        System.out.println();

        int whitePaint = 2;
        int brownPaint = 4;
        byte oneClass = 4 + 2;
        int classes = 120 / oneClass;
        whitePaint = classes * whitePaint;
        brownPaint = classes * brownPaint;
        System.out.println("В школе где, " + classes + " классов, нужно " + whitePaint +
                " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println();

        int bananas = 5;
        bananas = bananas * 80;
        int milk = 2;
        milk = milk * 105;
        int iceCream = 2;
        iceCream = iceCream * 100;
        int eggs = 4;
        eggs = eggs * 70;
        float breakfast = bananas + milk + iceCream + eggs;
        System.out.println("Общий вес завтрака " + breakfast + " грамм");
        int oneKg = 1000;
        breakfast = breakfast / oneKg;
        System.out.println("Общий вес завтрака " + breakfast + " кг");
        System.out.println();

        int oneDiet = 250;
        int twoDiet = 500;
        int average = (oneDiet + twoDiet) / 2;
        int weight = 7 * oneKg;
        oneDiet = weight / oneDiet;
        System.out.println("При потере в день 250 грамм, спортсмен скинет 7 кг через " + oneDiet + " дней");
        twoDiet = weight / twoDiet;
        System.out.println("При потере в день 500 грамм, спортсмен скинет 7 кг через " + twoDiet + " дней");
        average = weight / average;
        System.out.println("При средней потере в день 375 грамм, спортсмен скинет 7 кг через " + average + " дней");
        System.out.println();

        float masha = 67760;
        float newMasha = masha * 1.1f;
        float oneDifference = newMasha - masha;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Месячный доход вырос на " + oneDifference + " рублей");
        float denis = 83690;
        float newDenis = denis * 1.1f;
        float twoDifference = newDenis - denis;
        System.out.println("Денис теперь получает " + newDenis + " рублей. Месячный доход вырос на " + twoDifference + " рублей");
        float kristina = 76230;
        float newKristina = kristina * 1.1f;
        float threeDifference = newKristina - kristina;
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Месячный доход вырос на " + threeDifference + " рублей");
        System.out.println();

    }
}