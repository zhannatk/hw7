public class Main {
    public static void main(String[] args) {
        task1();//задача1
        task2();//задача2
        task3();//задача3
        task4();//задача4
        task5();//задача5
    }

    public static void task1() {
        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Для iOS — «Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 401;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
        }
        if (deliveryDistance > 20 || deliveryDistance <= 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 || deliveryDistance <= 100) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays + " срок доставки.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Cезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Cезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Cезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Cезон осень");
            default:
                System.out.println("Такого сезона не существует, месяц " + monthNumber + " некоректный.");
        }

    }
}