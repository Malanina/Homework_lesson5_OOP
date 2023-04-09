package task5;

import java.util.*;

public class Phonebook implements Iterable<Contact>{
    private ArrayList<Phonebook>phonebook;
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contacts;
    protected static String XMLFile = "/Homework_lesson5_OOP/task5/Phonebook.xml";

    public Phonebook() {
        this.contacts = new ArrayList<>();
    }

    public void add(Contact contact) {
        this.contacts.add(contact);
    }

    public int getSize() {
        return contacts.size();
    }

    public void showAll() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void findContact(String keyword) {
        int number = 0;
        System.out.printf("Результат поиска по имени \"%s\" :\n", keyword);
        for (Contact contact : contacts) {
            String temp = contact.toString();
            if (temp.toLowerCase().contains(keyword.toLowerCase())) {
                number++;
                System.out.println(temp);
            }
        }
        if (number == 0)
            System.out.println("Не найдено " + keyword);
    }


    @Override
    public Iterator<Contact> iterator() {
        return new IteratorOfPhonebook(this);
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    
    

    public void addContact(/*String name, String number*/){
        System.out.println("Добавьте имя контакта");
        String name = scanner.nextLine();
    
        System.out.println("Добавьте номер контакта");
        String number = scanner.nextLine();

        HashSet<String> numbers = new HashSet<>();
        numbers.add(number);
        phonebook.put(name, numbers);

        //phonebook.add(new Contact(name, number));
    }
    
    }
    

