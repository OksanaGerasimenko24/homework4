public class Main {
    public static void main(String[] args) {
        // задача 1
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // задача 2
        int temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        // задача 3
        int speed = 65;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        // задача 4
        int years = 27;
        if (years > 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад.");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу.");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в университет.");
        }
        if (years > 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему надо ходить на работу.");
        }

        // задача 5
        int yearsOld = 15;
        if (yearsOld < 5) {
            System.out.println("Если возраст ребенка равен " + yearsOld + ", то ему нельзя кататься на аттракционе.");
        }
        if (yearsOld >= 5 && yearsOld < 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (yearsOld >= 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + ", то он может кататься без сопровождения взрослого. ");
        }

        // задача 6
        int seatOccupied = 68;
        if (seatOccupied >= 0 && seatOccupied <= 60) {
            System.out.println("Если в вагоне занято " + seatOccupied + " мест, то есть сидячие места");
        }
        if (seatOccupied >= 61 && seatOccupied <= 102) {
            System.out.println("Если в вагоне занято " + seatOccupied + " мест, то есть стоячие места");
        } else if (seatOccupied > 102) {
            System.out.println("В вагоне нет свободных мест");
        }

        // задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Максимальное число - one");
        } else if (two > three) {
            System.out.println("Максимальное число - two");
        } else {
            System.out.println("Максимальное число - three");
        }
    }
}