import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double transactions) {
        this.name = name;
        addTransaction(transactions);
    }

    public static Customer createCustomer(String name, double transaction){
        return new Customer(name, transaction);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public Customer createNewCustomer(String name, double transaction){
        return new Customer(name, transaction);
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }

    public void printTransactions(){
        for (int i = 0; i < this.transactions.size(); i++){
            System.out.println("\t\t" + i + ". " + this.transactions.get(i));
        }
    }
}
