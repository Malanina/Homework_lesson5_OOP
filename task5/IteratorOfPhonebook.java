package task5;

import java.util.Iterator;

public class IteratorOfPhonebook implements Iterator<Contact> {

    private int index = -1;
    private final Phonebook contacts;

    public IteratorOfPhonebook(Phonebook contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean hasNext() {
        return index < contacts.getSize()-1;
    }

    @Override
    public Contact next() {
        return contacts.getContact(++index);
    }
}