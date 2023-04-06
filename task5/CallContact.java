package task5;

public class CallContact {
    public static void callContact(String name) {
    String s[] = findNumber(name); 

   if(s !=null)
   System.out.println("Контакт" + name + s[1]);
    else
    System.out.println("Контакт не найден."); 
}

    private static String[] findNumber(String name) {
        return null;
    }
 
}