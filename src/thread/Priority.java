package thread;

public class Priority {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("1");
        mt2.setName("2");
        mt3.setName("3");

        mt1.setPriority(5);
        mt2.setPriority(10);
        mt3.setPriority(1);

        mt1.start();
        mt2.start();
        mt3.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + "  " + i);
        }
    }
}
