package multithreading;

class BankAccount {

    int balance = 0;

    public void deposit(int amount) {

        synchronized(this) {

            balance = balance + amount;

            System.out.println(Thread.currentThread().getName()
                    + " deposited " + amount);

            System.out.println("Current Balance: " + balance);
        }
    }
}

class DepositThread extends Thread {

    BankAccount account;

    public DepositThread(BankAccount account, String threadName) {

        this.account = account;

        setName(threadName);
    }

    @Override
    public void run() {

        for(int i = 1; i <= 5; i++) {

            account.deposit(100);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                System.out.println(e);
            }
        }
    }
}

public class ThreadSafetyDemo {

    public static void main(String[] args)
            throws InterruptedException {

        BankAccount account = new BankAccount();

        DepositThread t1 =
                new DepositThread(account, "User-1");

        DepositThread t2 =
                new DepositThread(account, "User-2");

        t1.start();

        t2.start();

        t1.join();

        t2.join();

        System.out.println(
                "Final Balance: " + account.balance);
    }
}