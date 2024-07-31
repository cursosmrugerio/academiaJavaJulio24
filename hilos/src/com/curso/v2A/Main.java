package com.curso.v2A;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread {
	//HAS A
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
        	System.out.println(this + " " +counter.getCount());
            counter.increment();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        
        t1.run();
        t2.run();
        
        System.out.println(counter.getCount()); 
    }
}