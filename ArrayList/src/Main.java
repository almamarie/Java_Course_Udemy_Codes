import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        boolean quit = true;
        int choice = 0;

        printInstructions();

        while (quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = false;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To print the list of grocery items.");
        System.out.println("\n 2 - To add an item to the list.");
        System.out.println("\n 3 - To modify an item in the list.");
        System.out.println("\n 4 - To remove an item from the list.");
        System.out.println("\n 5 - To search for an item in the list.");
        System.out.println("\n 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        String newItem = scanner.nextLine();
        groceryList.addGroceryItem(newItem);
    }

    public static void modifyItem(){
        System.out.println("Enter item to replace: ");
        String oldItem = scanner.nextLine();
        System.out.println("Replacement " + oldItem + " with?");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem( oldItem, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item to remove: ");
        String itemToRemovePosition = scanner.nextLine();
        groceryList.removeGroceryItem(itemToRemovePosition);
    }

    public static void searchForItem(){
        System.out.println("Item to search for");
        String searchItem = scanner.nextLine();
        boolean foundItem = groceryList.onFile(searchItem);
        if(foundItem){
            System.out.println("Found " + searchItem + " in your grocery list.");
        } else {
            System.out.println(searchItem + " is not in the list.");
        }
    }


    public static ArrayList<String> processArrayList(){
        return new ArrayList<String>(groceryList.getGroceryList());
        //return newArray;
    }
}
