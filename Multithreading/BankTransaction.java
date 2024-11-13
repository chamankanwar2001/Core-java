class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class BankTransaction {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account.deposit(100);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account.withdraw(50);
            }
        });

        depositThread.start();
        withdrawThread.start();
        
        depositThread.join();
        withdrawThread.join();
        
        System.out.println("Final Balance: " + account.getBalance());
    }
}
