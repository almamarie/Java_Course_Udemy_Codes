import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static MobilePhone myPhoneBook = new MobilePhone();
    public static void main(String[] args){

        boolean quit = false;
        printChoices();
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printChoices();
                    break;
                case 1:
                    myPhoneBook.printContacts();
                    break;
                case 2:
                    storeContact();
                    break;
                case 3:
                    findContact();
                    break;
                case 4:
                    printNamesInContacts();
                    break;
                case 5:
                    modifyContactName();
                    break;
                case 6:
                    modifyContactPhoneNumber();
                    break;
                case 7:
                    modifyContactNameAndPhoneNumber();
                    break;
                case 8:
                    removeContact();
                    break;
                case 99:
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }


    public static void printChoices(){
        System.out.println("Press ");
        System.out.println("0 - To print choice options.");
        System.out.println("1 - To list your contacts.");
        System.out.println("2 - To add a contact.");
        System.out.println("3 - To search for a contact in your contact list.");
        System.out.println("4 - To list the names in your contacts.");
        System.out.println("5 - To modify a contact name in your contact list.");
        System.out.println("6 - To modify a contact phone number in your contact list.");
        System.out.println("7 - To modify a contact name and phone number in your contact list.");
        System.out.println("8 - To remove a contact from your contact list.");
        System.out.println("\n99 - To quit.");
    }

    public static void storeContact(){
        System.out.println("Enter the name of the contact: \r");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number of the contact: \r");
        String phoneNumber = scanner.nextLine();
        myPhoneBook.storeContact(name, phoneNumber);
    }

    public static void printNamesInContacts(){
        myPhoneBook.printNames();
    }

    public static void findContact(){
        System.out.println("Enter the name of the contact you would like to find");
        String name = scanner.nextLine();
        String phoneNumber = myPhoneBook.findContact(name);

        if(phoneNumber == null){
            System.out.println("Contact cannot be found in your phonebook");
            return;
        }

        System.out.println("Contact Found");
        System.out.println(name + ": " + phoneNumber);
    }

    public static void modifyContactName(){
        System.out.println("Enter the name of the contact whose name you wish to change: ");
        String nameOfContact = scanner.nextLine();
        System.out.println("Enter the new name: ");
        String newName = scanner.nextLine();
        boolean isSuccess = myPhoneBook.modifyContactName(nameOfContact, newName);
        if(isSuccess){
            System.out.println("Contact name " + nameOfContact + " successfully changed to " + newName);
        }
    }

    public static void modifyContactPhoneNumber(){
        System.out.println("Enter the name of the contact whose number you wish to change: ");
        String nameOfContact = scanner.nextLine();
        System.out.println("Enter the new phone number: ");
        String newNumber = scanner.nextLine();
        boolean isSuccess = myPhoneBook.modifyContactPhoneNumber(nameOfContact, newNumber);
        if(isSuccess){
            System.out.println("Contact name " + nameOfContact + " successfully changed phone number to " + newNumber);
        } else {
            System.out.println("Failed to change phone number");
        }
    }

    public static void modifyContactNameAndPhoneNumber(){
        System.out.println("Enter the name of the contact whose details you wish to change: ");
        String oldName = scanner.nextLine();
        System.out.println("Enter the new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        boolean isSuccess = myPhoneBook.modifyContactNameAndPhoneNumber(oldName, newName, newPhoneNumber);
        if(isSuccess){
            System.out.println("Contact details successfully changed.");
        }
    }

    public static void removeContact(){
        System.out.println("Enter the name of the contact you would like to remove");
        String name = scanner.nextLine();
        boolean isSuccess = myPhoneBook.removeContact(name);
        if(isSuccess){
            System.out.println("Contact removed successfully.");
        }
    }
}
