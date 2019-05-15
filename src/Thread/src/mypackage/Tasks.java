package mypackage;

public class Tasks extends Thread {
    public void run() {
        System.out.println("...........A............" + Thread.currentThread().getName());
        System.out.println("...........B............" + Thread.currentThread().getName());
        System.out.println("...........C............" + Thread.currentThread().getName());

    }

}
