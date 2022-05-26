import java.io.PrintStream;
import java.util.ArrayList;

public class MobilePhone {

    // I do not know how
    private final ArrayList<Contacts> contactList = new ArrayList<Contacts>();
    ArrayList<String> contactNames = new ArrayList<String>();



    public void storeContact(String name, String phoneNumber){
        if(isContactInPhonebook(name)){
            System.out.println(name + " is already in your contact list.");
            return;
        }
        addContact(name, phoneNumber);
        updateContactNames(name);
        System.out.println("Phone number saved successfully.");
    }


    private void addContact(String name, String contact){
        Contacts newContact = new Contacts(name, contact);
        contactList.add(newContact);
    }

    public boolean modifyContactName(String oldName, String newName){
        int contactLocation = locateContact(oldName);
        if(contactLocation < 0){
            return false;
        }
        Contacts modifiedContact = modifyContactName(contactLocation, newName);
        contactList.set(contactLocation, modifiedContact);
        resetContactsNamesList();
        return true;
    }

    private Contacts modifyContactName(int contactIndex, String name){
        // This method retrieves the contact and changes the name to the new name
        // and then returns it.
        Contacts contact = contactList.get(contactIndex);
        contact.modifyName(name);
        return contact;
    }

    // Modify contact phone number
    public boolean modifyContactPhoneNumber(String name, String phoneNumber){
        int contactLocation = locateContact(name);
        if(contactLocation < 0){
            return false;
        }
        Contacts modifiedContact = modifyContactPhoneNumber(contactLocation, phoneNumber);
        contactList.set(contactLocation, modifiedContact);
        return true;
    }

    private Contacts modifyContactPhoneNumber(int contactIndex, String newPhoneNumber){
        // This method retrieves the contact and changes the name to the new name
        // and then returns it.
        Contacts contact = contactList.get(contactIndex);
        contact.modifyPhoneNumber(newPhoneNumber);
        return contact;
    }


    // Modify name and phone number
    public boolean modifyContactNameAndPhoneNumber(String oldName, String newName, String newNumber){
        boolean isSuccess = modifyContactName(oldName, newName);
        if(isSuccess){
            System.out.println("Successfully changed contact name to " + newName);
        } else{
            return false;
        }
        isSuccess = modifyContactPhoneNumber(newName, newNumber);

        if(isSuccess){
            System.out.println("Successfully changed contact phone number to " + newNumber);
        } else{
            return false;
        }
        return true;
    }


    // Remove a contact
    public boolean removeContact(String name){
        if( !isContactInPhonebook(name) ){
            System.out.println("Contact not in phonebook");
            return false;
        }

        int contactLocation = locateContact(name);
        contactList.remove(contactLocation);
        contactNames.remove(contactLocation);

        return true;
    }

    public void printContacts(){
        if(contactList.size() == 0){
            System.out.println("You do not have a contact in  your contact list.");
            return;
        }
        for(Contacts contact: contactList){
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
    }

    public void updateContactNames(String name){
            contactNames.add(name);
    }

    private void resetContactsNamesList(){
        contactNames = new ArrayList<String>();
        for(Contacts contact: contactList){
            contactNames.add(contact.getName());
        }
    }

    public void printNames(){
        if(contactNames.size() == 0){
            System.out.println("You do not have a contact in  your contact list.");
            return;
        }
        System.out.println("Names in your contact list: ");
        for(String name: contactNames){
            System.out.println(name);
        }
    }

    private boolean isContactInPhonebook(String name){
        return contactNames.contains(name);
    }

    public String findContact(String name){
        int position = locateContact(name);
        if(position >= 0){
            return contactList.get(position).getPhoneNumber();
        }
        return null;
    }

    private int locateContact(String name){
        return contactNames.indexOf(name);
    }
}
