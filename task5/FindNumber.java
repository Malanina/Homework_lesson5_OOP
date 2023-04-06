package task5;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FindNumber {
    public static String[] findNumber(String name) {
       
        try(Scanner in = new Scanner(new File("file.txt"))) {
            String[] s = new String[0];

            boolean foundPerson = false;

            while(in.hasNextLine()) {
                s = in.nextLine().split(":");
                if(s[0].equals(name)) {
                    System.out.println("Номер контакта" + name + s[1]);
                    foundPerson = true;
                    break; 
                }
            }

            if(!foundPerson) {
                System.out.println("Телефон " + name + "не найден");
                s = null;
            }
            return s;
        } catch (IOException e) {
    System.out.println(e.getMessage());
}
return null;
    }  
}

