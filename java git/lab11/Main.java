2)  
 class BankAccount {
    private double balance;
    private final Object lock = new Object();


    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        synchronized (lock) {
            double currentBalance = balance;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread();
            }
            balance = currentBalance + amount;
            System.out.println(Thread.currentThread().getName() + " deposited: $" + amount + ", New balance: $" + balance);
        }
    }
}


class Customer extends Thread {
    private final BankAccount account;
    private final double depositAmount;


    public Customer(BankAccount account, double depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }


    public void run() {
        System.out.println(Thread.currentThread().getName() + " is trying to deposit $" + depositAmount);
        account.deposit(depositAmount);
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);


        Customer customer1 = new Customer(account, 200);
        Customer customer2 = new Customer(account, 300);
        Customer customer3 = new Customer(account, 500);
        Customer customer4 = new Customer(account, 150);


        customer1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        customer2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        customer3.setPriority(Thread.MAX_PRIORITY); // Highest priority
        customer4.setPriority(Thread.NORM_PRIORITY); // Normal priority


        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
    }
}

