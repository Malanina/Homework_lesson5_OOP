package task5;

import java.util.Scanner;

public class UserActions implements DoUser {
    static final Phonebook phonebook = null;
    final Scanner scanner;
    protected static String XMLFile = "/Homework_lesson5_OOP/task5/Phonebook.xml";

    public UserActions(Scanner scanner) { 
        this.scanner = scanner;
    }


    @Override
    public void showContacts() {
        if (phonebook.getSize() > 0)
            phonebook.showAll();
        else
            System.out.println("Нет контактов");
    }


    @Override
    public void exportContactToXML(){
        IteratorOfPhonebook iteratorOfPhonebook = new IteratorOfPhonebook(phonebook);
        while (iteratorOfPhonebook.hasNext()) {
            ExportModel<Contact> saved = new ExportModel<>(iteratorOfPhonebook.next());
            saved.setFormat(new ExportToXML());
            saved.setPath(ExportToXML.XMLFile);
            saved.save();
        }
        System.out.println("Сохранено в файле в формате xml.");
    }


    @Override
    public void addContact(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addContact'");
    }


    @Override
    public void findContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findContact'");
    }
    

}
