package com.curso.v1;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 20000; i++) {
            counter.increment();
            System.out.println(this.getName()+ ": "+ counter.getCount() );
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new MyThread(counter);
        Thread t2 = new MyThread(counter);
        t1.setName("HILO1");
        t2.setName("HILO2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("********"+counter.getCount());
    }
}