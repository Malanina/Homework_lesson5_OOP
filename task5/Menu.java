package task5;

import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
       try (Scanner in= new Scanner(System.in)) {
        String name;

        do{
            System.out.println("Меню");
            System.out.println("1. Контакты");
            System.out.println("2. Добавить контакт");
            System.out.println("3. Найти контакт");
            System.out.println("4. Экспорт в XML файл");


            int choice = in.nextInt();
            in.nextLine();

            switch(choice) {
                case 1:
                System.out.println("Контакты");
                name = in.nextLine();

                callContact(name);
                break;

            case 2:
                System.out.println("Добавить имя контакта");
                name = in.nextLine();

                System.out.println("Добавить телефон контакта");
                long number = in.nextLong();
                in.nextLine();

                saveContact(name, number);
                break;
            case 3:
                System.out.println("Найти контакт по имени");
                findNumber(in.nextLine());
                break;
            case 4:
                System.out.println("Экспорт в XML файл:");
                exportTasksToXML(in.nextLine());
                break;

                default:

                break; 
            }
        }while (true);
       }

 } 
    
    private static void exportTasksToXML(String nextLine) {
    }

    private static void findNumber(String nextLine) {
    }

    private static void saveContact(String name, long number) {
    }

    private static void callContact(String name) {
    }
}