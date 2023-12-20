package app.task_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContactsManager {

    private static Map<String, String> contacts = new LinkedHashMap<>();

    public static void main(String[] args) {
        initializeContacts();
        System.out.println("Initial contacts:");
        printContacts();

        updateContact("Tom", "tomasdev@glob.net");
        System.out.println("\nUpdated contacts:");
        printContacts();
    }

    private static void initializeContacts() {
        contacts.put("Tom", "tom@mail.com");
        contacts.put("Lisa", "lisa@mail.com");
        contacts.put("Alice", "alisa@mail.com");
        contacts.put("Denis", "den@mail.com");
    }

    private static void updateContact(String name, String newEmail) {
        if (contacts.containsKey(name)) {
            contacts.put(name, newEmail);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    private static void printContacts() {
        int count = 1;
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(count + ") " + entry.getKey() + " - " + entry.getValue());
            count++;
        }
    }
}
