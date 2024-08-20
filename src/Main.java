public class Main {
    public static void main(String[] args) {
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

        byte oneTeacher = 23;
        byte twoTeacher = 27;
        byte threeTeacher = 30;
        int student = (oneTeacher + threeTeacher + threeTeacher);
        short paper = 480;
        int oneStudent = paper/student;
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");

        byte oneMinutes = 16/2;
        System.out.println("За 1 минуту машина произвела " + oneMinutes + " штук бутылок");
        int twentyMinutes = 20 * oneMinutes;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        byte oneHours = 60;
        int day = (24 * oneHours) * oneMinutes;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За трое суток машина произвела " + threeDay + " штук бутылок");
        int oneMonth =threeDay * 24;
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");


    }
}