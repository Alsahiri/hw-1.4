public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 34;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }

    }
    public static void task4 () {
    System.out.println("Задача 4");
        int years = 2;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад");
        } else if (years > 6 && years <= 18) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу");
        } else if (years > 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 1;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен "+age+" , то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься " +
                    "на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься " +
                    "на аттракционе без сопровождения взрослого");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatSeats = 60;

        int people = 70;
        if (people == capacity) {
            System.out.println("Мест в вагоне нет");
        } else if (people > seatSeats) {
            System.out.println("Сидячие места заняты, но есть стоячие");
        } else {
            System.out.println("Сидячие места есть");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 101;
        int two = 101;
        int three = 101;
        if (three >= one && three >= two) {
            System.out.println(three);
        } else if (three >= one && three <= two) {
            System.out.println(two);
        } else if (three <= one && three >= two) {
            System.out.println(one);
        } else if (three <= one && three <= two) {
            if (one >= two) {
                System.out.println(one);
            } else {
                    System.out.println(two);
                }
            }
        }

    }
