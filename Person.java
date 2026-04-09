import java.util.*;

public class Person {
    String name;
    String college;
    String dob;
    String qualification;

    // Method to set details
    String details(String n, String c, String d) {
        name = n;
        college = c;
        dob = d;

        System.out.println("name = " + name);
        System.out.println("college = " + college);
        System.out.println("dob = " + dob);

        return "Details set successfully";
    }

    // Method to set qualification
    String qual(String q) {
        qualification = q;
        System.out.println("qualification = " + qualification);
        return qualification;
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("person details === " + p.details("bhagavan", "AUS", "30/12/2006"));
        System.out.println("qualification details === " + p.qual("Diploma pass"));
    }
}