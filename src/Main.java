import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    private static void task1(){
        //Задача 1
        System.out.println("Задание 1:");
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task2(){
        //Задача 2
        System.out.println("Задание 2:");
        int clientDeviceYear = 2015;
        int clientOS = 1; // 0 = IOS / 1 = Android
        if (clientDeviceYear >= 2015 && clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
    }

    private static void task3(){
        //Задача 3
        System.out.println("Задание 3:");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является вискокосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    private static void task4(){
        //Задача 4
        System.out.println("Задание 4:");
        int deliveryDistance = 95;
        if (deliveryDistance > 20){
           int days = ((deliveryDistance + 20) / 40 + 1);
            System.out.println("Потребуеться дней для доставки: " + days + ".");
        } else {
            System.out.println("Потребуеться 1 день для доставки.");
        }

    }

    private static void task5(){
        //Задача 5
        System.out.println("Задание 5:");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц зимнего сезона.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц весеннего сезона.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц летнего сезона.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц осеннего сезона.");
                break;
            default:
                 System.out.println("Такого месяца не существует.");
        }

    }
}
