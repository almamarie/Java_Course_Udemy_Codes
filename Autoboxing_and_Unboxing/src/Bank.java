import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

//    public Bank createBank(String name, Branch newBranch){
//        return new Bank(name, newBranch);
//    }

    public String getName() {
        return name;
    }

    public boolean addBranch(Branch newBranch){
        // check if branch exists
        if(findBranch(newBranch.getName()) != null){
            System.out.println("Branch " + newBranch.getName() + "already in system" + "\nFailed to add branch");
            return false;
        }

        // add branch if branch does not exist.
        this.branches.add(newBranch);
        System.out.println("Branch " + newBranch.getName() + " successfully added to " + this.name + " bank.");
        return true;
    }

    public boolean addCustomer(String branchName, Customer newCustomerDetails){
        // check if customer exists in branch
        // if (branch exists) -> check if(branch.contains(customer))
        Branch branch = findBranch(branchName);
        if(branch != null){
            // there is no need checking if customer is in branch because the addCustomer method already does that.
                boolean isSuccessful = branch.addCustomer(newCustomerDetails);
                if(isSuccessful){
                    System.out.println("Customer " + newCustomerDetails.getName() + " added to " + branchName + " successfully.");
                    return true;
                } else {
                    System.out.println("Failed to add customer to " + branchName + " branch.");
                    return false;
                }
        }
        System.out.println("Branch not found.");
        System.out.println("Failed to add customer to " + branchName + " branch.");
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount){
        // check if branch exists by retrieving the branch.
        Branch customerBranch = findBranch(branchName);
        if(customerBranch == null){
            System.out.println("Failed to add transaction. Branch not found");
            return false;
        }

        // check if customer exists in branch by retrieving the customer.
        Customer customerDetails = customerBranch.findCustomer(customerName);
        if(customerDetails == null){
            System.out.println("Failed to add transaction. Customer" + customerName + " not found in " + branchName + " branch.");
            return false;
        }

        // add transaction to branch
        customerDetails.addTransaction(transactionAmount);
        System.out.println("Transaction added successfully.");
        return true;
    }


    public void listCustomers(String branchName){
        Branch branch = findBranch(branchName);
        if(branch == null){
            System.out.println("Branch not found");
            return;
        }

        branch.printCustomers(this.getName());
    }


    public void listCustomersAndTheirDetails(String branchName){
        Branch branch = findBranch(branchName);
        if(branch == null){
            System.out.println("Branch not found");
            return;
        }
        branch.printCustomersAndTheirTransactions();
    }


    public Branch findBranch(String branchName){
        for(Branch branch : this.branches){
            if(Objects.equals(branch.getName(), branchName)){
                return branch;
            }
        }
        return null;
    }

    private int findBranch(Branch branch){
        for(int i = 0; i < branches.size(); i++){
            if(Objects.equals(this.branches.get(i), branch)){
                return i;
            }
        }
        return -1;
    }

    public void listAllBranches(String bankName){
        if(this.branches.size() == 0){
            System.out.println("You have 0 branches");
            return;
        }
        System.out.println("List of branches in " + bankName);
        for (int i = 0; i < this.branches.size(); i++){
            System.out.println(i++ + ". " + this.branches.get(i).getName());
        }
    }
}
