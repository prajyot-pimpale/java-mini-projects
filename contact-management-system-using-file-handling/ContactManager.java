import java.io.BufferedReader;
import java.io.File;

public class ContactManager{
    private List<Contact> contacts = new ArrayList<>();
    private int nextId = 1;

    private static final String FILE_NAME = "contacts.txt";

    // Load Contact
    public void loadContact(){

        File file = new File(FILE_NAME);

        if(!file.exists())
            return;

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",");

                if(data.length != 4)
                    continue;

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String phone = data[2];
                String email = data[3]; 

                contacts.add(new Contact(id, name, phone, email));

                nextId = Math.max(nextId, id+1);
            }
        }catch (IOException e) {
            System.out.println("Error loading contacts.");
        }
    }

    // Save contacts to file
    public void saveContacts() {

        try (BufferedWriter bw = new BufferedWriter( new FileWriter(FILE_NAME))) {
            for (Contact c : contacts) {
                bw.write( c.getId() + "," + c.getName() + "," + c.getPhone() + "," + c.getEmail() );
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving contacts.");
        }
    }

    // Add Contact
    public void addContact( String name, String phone, String email){
        contacts.add( new Contact(nextId++, name, phone, email));
        saveContacts();
        System.out.println("Contact added successfully.");
    }

    // Display Contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\n=============================================================");
        System.out.printf("%-4s %-15s %-15s %-25s%n", "ID", "NAME", "PHONE", "EMAIL");
        System.out.println("-------------------------------------------------------------");

        contacts.forEach(System.out::println);

        System.out.println("=============================================================");
    }

    // Search Contact
    public void searchContact(String name) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) 
            System.out.println("Contact not found.");
    }

    // Update Contact
    public void updateContact(int id, String phone, String email){
        for (Contact c : contacts) {
            if (c.getId() == id) {
                c.setPhone(phone);
                c.setEmail(email);
                saveContacts();
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete Contact
    public void deleteContact(int id) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getId() == id) {
                iterator.remove();
                saveContacts();
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Sort Contacts
    public void sortContacts() {
        contacts.sort(Comparator.comparing(Contact::getName));
        System.out.println("Contacts sorted by name.");
    }

    // Total Contacts
    public void totalContacts() {
        System.out.println("Total Contacts: " + contacts.size());
    }
}