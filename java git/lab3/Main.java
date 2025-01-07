// Show case classes


public class BankAccount {
   String accountHolder;
   double balance;


   void deposit(double amount) {
       balance += amount;
       System.out.println("Deposit Successful. New balance: " + balance);
   }


   void withdraw(double amount) {
       if (balance >= amount) {
           balance -= amount;
           System.out.println("Withdrawal Successful. New balance: " + balance);
       } else {
           System.out.println("Insufficient balance.");
       }
   }


   void checkBalance() {
       System.out.println("Current balance: " + balance);
   }
}


public class Main {
   public static void main(String[] args) {
       BankAccount myAccount = new BankAccount();
       myAccount.accountHolder = "John Doe";
       myAccount.balance = 1000.0;
       myAccount.checkBalance();
       myAccount.deposit(500.0);
       myAccount.withdraw(200.0);
       myAccount.checkBalance();
   }
}
