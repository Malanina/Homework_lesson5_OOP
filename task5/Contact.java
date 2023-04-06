package task5;


public class Contact {
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

}