import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String name;
    ArrayList<Customer> customers;

    public Branch(String name) {
        this.customers = new ArrayList<Customer>();
        this.name = name;
    }

    public static Branch createBranch(String name){
        return new Branch(name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(Customer newCustomer){
        if(findCustomer(newCustomer) >= 0){
            System.out.println("Customer already in branch");
            return false;
        }
        System.out.println("Adding customer to branch...");
        this.customers.add(newCustomer);
        System.out.println("Customer added successfully.");
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);
        if(customer == null){
            System.out.println("Customer not found in branch");
            return false;
        }

        customer.getTransactions().add(transaction);
        System.out.println("Transaction added successfully.");
        return true;
    }

    public int findCustomer(Customer customerDetails){
        return this.customers.indexOf(customerDetails);
    }

    public Customer findCustomer(String customerName){
        for (Customer customer : this.customers) {
            if (Objects.equals(customer.getName(), customerName)) {
                return customer;
            }
        }
        return null;
    }

    public void printCustomers(String bankName){
        if(this.customers.size() == 0){
            System.out.println("There are 0 customers in this branch");
            return;
        }
        System.out.println("List of customers in " + bankName);
        for(Customer customer : this.customers){
            System.out.println(customer.getName());
        }
    }

    public void printCustomersAndTheirTransactions(){
        if(this.customers.size() == 0){
            System.out.println("There are no customers in this branch");
            return;
        }
        System.out.println("List of customers in " + this.name);
        for(Customer customer : this.customers){
            System.out.println(customer.getName());
            System.out.println("\tTransactions of " + customer.getName() + ": ");
            customer.printTransactions();
        }
    }
    
}
