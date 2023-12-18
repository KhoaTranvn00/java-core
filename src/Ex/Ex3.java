package Ex;

import java.util.Arrays;
import java.util.List;

class MyStorage {
    List<String> data = Arrays.asList("item", "item2");

    public synchronized void pullData() {
        data.forEach(item -> System.out.println(item));
    }

    public synchronized void pushData(String item) {
        data.add(item);
    }
}

class ReadThread extends Thread {
    MyStorage store;

    ReadThread(MyStorage store) {
        this.store = store;
    }

    public void run() {
        this.store.pullData();
    }
}

class WriteThread extends Thread {
    MyStorage store;
    String data;

    WriteThread(MyStorage store, String data) {
        this.store = store;
        this.data = data;
    }

    public void run() {
        this.store.pushData(this.data);
    }
}

class TestSynchronization1 {
    public static void main(String args[]) {
        MyStorage store = new MyStorage();
        ReadThread r1 = new ReadThread(store);
        ReadThread r2 = new ReadThread(store);
        WriteThread w1 = new WriteThread(store, "New item");
        r1.start();
        r2.start();
        w1.start();
    }
}
