public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int age = 18;
        if (age >= 18) {
            System.out.println("Ура ! Тебе " + age + " Поздравляю! ");
        }
        if (age < 18) {
            System.out.println("Упс ! Тебе надо еще подождать ");
        }
        //Вариант 2
        System.out.println("Вариант 2");
        int age1 = 14;
        if (age1 >= 18) {
            System.out.println("Ура ! Тебе 18 Поздравляю! ");
        }
        if (age1 < 18) {
            System.out.println("Упс ! Тебе " + age1 + ", надо еще подождать ");
        }
        //Задача 2
        System.out.println("Задача 2");
        int age2 = 34;
        int schoolAge = 7;
        int universityAge = 18;
        int workAge = 24;

        if (age2 == schoolAge) {
            System.out.println("Пора идти в школу, получать образование");
        }
        if (age2 == universityAge) {
            System.out.println("Пора в универ! ");
        }
        if (age2 >= workAge) {
            System.out.println("Пора искать работу! ");
        }
        //Задача 3
        System.out.println("Задача 3");

        int peoplePlaces = 102;
        int railWay = 60;
        int peopleSits = 62;
        int peopleStand = 15;
        int stand = peoplePlaces - railWay;
        int freeSits = railWay - peopleSits;
        int freeStand = stand - peopleStand;
        int allPeople = peopleSits + peopleStand;
        int freeAll = peoplePlaces - allPeople;

        if (peopleSits <= railWay) {
            System.out.println("В вагоне поезда занято " + peopleSits + " мест, свободно " + freeSits + " седящих мест");
        }
        if (peopleStand <= stand) {

            System.out.println("В вагоне поезда занято " + peopleStand + " мест, свободно " + freeStand + " стоячих мест");
        }
        if (allPeople <= peoplePlaces) {
            System.out.println("В вагоне поезда занято " + allPeople + " место, свободно всего " + freeAll + " место");
        }
        //Задача 4
        System.out.println("Задача 4");

        int age3 = 14;
        if (age3 >= 18) {
            System.out.println("Ура ! Тебе " + age3 + " Поздравляю! ");
        } else {
            System.out.println("Упс ! Тебе " + age3 + " надо еще подождать ");
        }
        //Задача 5
        System.out.println("Задача 5");

        int age5 = 41;
        int schoolAge1 = 7;

        if (age5 >= schoolAge1 && age5 < 18) {
            System.out.println("Пора идти в школу, получать образование");
        } else {
            if (age5 >= 18 && age5 < 24) {
                System.out.println("Пора в универ! ");
            } else {
                System.out.println("Пора искать работу! ");
            }
        }
        //Задача 6
        System.out.println("Задача 6");

        if (peopleSits <= railWay) {
            System.out.println("В вагоне поезда занято " + peopleSits + " мест, свободно " + freeSits + " седящих мест");
        } else if (peopleStand <= stand) {
            System.out.println("В вагоне поезда занято " + peopleStand + " мест, свободно " + freeStand + " стоячих мест");
        }
        if (allPeople <= peoplePlaces) {
            System.out.println("В вагоне поезда занято " + allPeople + " место, свободно всего " + freeAll + " место");
        }
        //Задача 7
        System.out.println("Задача 7");

        int age6 = 34;
        if (age6 >= 2 && age6 <= 6) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в садик");
        } else if (age6>=7 && age6 <=18){
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в школу");
        } else if (age6>=18&&age6<=24){
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить на работу");
        }

    }
}


