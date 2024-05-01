package task4;

public class Account {

    public double balance;



    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

        } else {

            System.out.println("Insufficient funds");

        }

    }

}