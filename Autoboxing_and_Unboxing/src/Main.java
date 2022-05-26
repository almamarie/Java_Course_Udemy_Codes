import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank("Fidelity");
    public static void main(String[] args){
        System.out.println("Initializing system...");
        printInstructions();
        boolean quit = false;
        int choice;
        while (!quit){
            System.out.println("\nEnter choice: (7 to show available actions)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    System.out.println("Shutting down...");
                    break;
                case 1:
                    listAllBranches();
                    break;
                case 2:
                    addNewBranch();
                    break;
                case 3:
                    addCustomerToBranch();
                    break;
                case 4:
                    addCustomerTransaction();
                    break;
                case 5:
                    listCustomers();
                    break;
                case 6:
                    listCustomersAndTheirTransactions();
                    break;
                case 7:
                    printInstructions();
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("""
                0 - to quit
                1 - to list all branches
                2 - to add a new branch
                3 - to add a customer to a branch
                4 - to record a customers' transaction
                5 - to list all customers in a branch
                6 - to list all customers in a branch and their transactions""");
        System.out.println("Choose your action: ");
    }

    public static void listAllBranches(){
        bank.listAllBranches(bank.getName());
    }

    public static void addNewBranch(){
        System.out.println("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        Branch newBranch = Branch.createBranch(branchName);
        boolean isSuccessful = bank.addBranch(newBranch);
        if(isSuccessful){
            System.out.println("Branch created successfully.");
        } else{
            System.out.println("Failed to create branch");
        }
    }

    public static void addCustomerToBranch(){
        System.out.println("Which branch do you wish to add the new customer to?");
        String newCustomerBranch = scanner.nextLine();
        // check if branch exists
        Branch branch = bank.findBranch(newCustomerBranch);
        if(branch == null){
            System.out.println("Branch cannot be found in this bank");
            return;
        }

        // check if customer exists in branch
        System.out.println("Enter name of customer to add: ");
        String newCustomerName = scanner.nextLine();

        if(branch.findCustomer(newCustomerName) != null){
            System.out.println("Customer already exist");
            return;
        }

        // take the customer's initial transaction amount
        System.out.println("Enter the new customer's initial transaction amount: ");
        double initialTransactionAmount = scanner.nextDouble();
        scanner.nextLine();

        // create a new customer reference
        Customer newCustomer = Customer.createCustomer(newCustomerName, initialTransactionAmount);

        // add it to the branch
        branch.addCustomer(newCustomer);
    }

    public static void addCustomerTransaction(){
        System.out.println("Which branch does the customer belong to?");
        String newCustomerBranch = scanner.nextLine();
        // check if branch exists
        Branch branch = bank.findBranch(newCustomerBranch);
        if(branch == null){
            System.out.println("Branch cannot be found in this bank");
            return;
        }

        // check if customer exists in branch
        System.out.println("Enter name of customer: ");
        String customerName = scanner.nextLine();

        Customer customer = branch.findCustomer(customerName);
        if(customer == null){
            System.out.println("Customer does not exist in this branch");
            return;
        }

        // take the customer's transaction amount
        System.out.println("Enter the customer's transaction amount: ");
        double newTransactionAmount = scanner.nextDouble();
        scanner.nextLine();

        // add the new transaction
        customer.addTransaction(newTransactionAmount);
        System.out.println("Transaction added successfully.");
    }

    public static void listCustomers(){
        System.out.println("Enter the name of the branch?");
        String branchName = scanner.nextLine();
        // check if branch exists
        Branch branch = bank.findBranch(branchName);
        if(branch == null){
            System.out.println("Branch cannot be found in this bank");
            return;
        }

        // list the all the customers in the branch
        branch.printCustomers(branch.getName());
    }

    public static void listCustomersAndTheirTransactions(){
        System.out.println("Enter the name of the branch?");
        String branchName = scanner.nextLine();
        // check if branch exists
        Branch branch = bank.findBranch(branchName);
        if(branch == null){
            System.out.println("Branch cannot be found in this bank");
            return;
        }

        // list the all the customers in the branch
        branch.printCustomersAndTheirTransactions();
    }
}
