package thread;

public class CreateThread {
    public static void main(String[] args) {
        ThreadImplRunnable threadRunnable = new ThreadImplRunnable();
        Thread thread1 = new Thread(threadRunnable);

        thread1.start();



        Thread thread2 = new ThreadExtendThread();

        thread2.start();
    }
}

class ThreadImplRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A " + i);
        }
    }
}

class ThreadExtendThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B " + i);
        }
    }
}