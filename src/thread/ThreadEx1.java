package thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        System.out.println("Start");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i==0 || i==99) {
                        System.out.println("A " + i);
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i==0 || i==99) {
                    System.out.println("B " + i);
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i==0 || i==99) {
                    System.out.println("C " + i);
                }
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i==0 || i==99) {
                    System.out.println("C " + i);
                }
            }
        });
        Thread thread5 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i==0 || i==99) {
                    System.out.println("C " + i);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("End");
    }
}
