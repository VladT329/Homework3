public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        System.out.println("Задание 2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();

        System.out.println("Задание 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется  заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();

        System.out.println("Задание 4");
        int age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст челоека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17)  {
            System.out.println("Если возраст челоека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст челоека равен " + age2 + ", то ему нужно ходить в университет");
        }
        if (age2 > 24) {
            System.out.println("Если возраст челоека равен " + age2 + ", то ему пора ходить работу");
        }
        System.out.println();

        System.out.println("Задание 5");
        int age3 = 14;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        }
        if (age3 >= 5 && age3 <14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то он может кататься только в сопровождениии взрослого");
        }
        if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то он может кататься без сопровождения взрослого");
        }
        System.out.println();

        System.out.println("Задание 6");
        int place = 50;
        if (place <= 102) {
            if (place <=60) {
                System.out.println("Если место №" + place + ", то это сидячее место");
            }
            if (place > 60 && place <= 102) {
                System.out.println("Если место №" + place + ", то это стоячее место");
            }
        } else {
            System.out.println("Места № " + place + " не существует. Вагон рассчитан только на 102 мест");
        }
        System.out.println();

        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println("Большее значение " + one); ;
            } else {
                System.out.println("Большее значение " + three);
            }
        } else {
            if (two > three) {
                System.out.println("Большее значение " + two);
            } else {
                System.out.println("Большее значение " + three);
            }
        }
    }
}