package section10.bankapplication;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, Double initialTransaction) {
        this(name.toUpperCase(), new ArrayList<>(500));
        transactions.add(initialTransaction);
    }

}
public class AutoboxingChallenge {

    public static void main(String[] args) {
        Customer bob = new Customer("Bob", 100.00);
        System.out.println(bob);

        Bank bank = new Bank("Bank of America");
        bank.addNewCustomer("Jane A", 100.00);
        bank.addTransaction("Jane A", 200.00);
        bank.addTransaction("Jane A", -50.00);
        bank.addTransaction("Jane A", 300.00);
        bank.addTransaction("Jane A", -100.00);
        bank.printStatement("Jane A");
        bank.printStatement("Bob");
    }

}

class Bank {
    private String name;
    private ArrayList<Customer> custumers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", custumers=" + custumers +
                '}';
    }

    private Customer getCustomer(String name) {
        for (Customer customer : custumers) {
            if (customer.name().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        System.out.printf("Customer %s not found %n", name);
        return null;
    }

    public void addNewCustomer(String name, double initialTransaction) {
        if (getCustomer(name) == null) {
            custumers.add(new Customer(name, initialTransaction));
            System.out.printf("Customer %s added %n", name);
        }
    }

    public void addTransaction(String name, double transaction) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactions().add(transaction);
        }
    }

    public void printStatement(String name) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            System.out.println("-".repeat(30));
            System.out.println("Customer name: " + customer.name());
            System.out.println("Transactions:");
            for (double d : customer.transactions()) {
                System.out.printf("$%10.2f (%s)%n", d, d > 0 ? "deposit" : "credit");
            }
        } else {
            System.out.printf("Customer %s not found %n", name);
        }
    }
}
