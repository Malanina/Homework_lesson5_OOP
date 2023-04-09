package task5;


public class Contact implements Comparable<Contact>{
    private String name;
    private String number;
  


    public Contact() {
        this.name = name;
        this.number = number;
    }


    public Contact(String name) {
        this.name = name;
        this.number = number;
    }


    public Contact(String name, String number) {
        this.name = name;
        this.number = number;  
}


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Contact" + getNumber() +
                ": " + getName();
    }

    @Override
    public int compareTo(Contact obj) {
        return this.name.compareTo(obj.name);
    
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Contact contact = (Contact) o;

        if (getNumber() != contact.getNumber()) {
            return false;

        }
        return getName() != null
                ? getName().equals(contact.getName())
                : contact.getName() == null;

    }
}