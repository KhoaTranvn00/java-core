package thread.sync;

public class HandleSync {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Thread thread1 = new Thread(bank);
        Thread thread2 = new Thread(bank);

        thread1.start();
        thread2.start();

    }
}

class Bank implements Runnable {

    int total = 1000;

    private synchronized void withdrawn() throws InterruptedException {     // Without sync it will work incorrectly
        if (total > 0) {
            Thread.sleep(1000);
            total -= 1000;
            System.out.println("Withdraw successfully, total: " + total);
        } else {
            System.out.println("Not enough money");
        }
    }

    @Override
    public void run() {
        try {
            withdrawn();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
