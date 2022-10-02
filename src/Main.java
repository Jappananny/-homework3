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
    }
}