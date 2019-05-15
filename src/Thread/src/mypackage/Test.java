package mypackage;

public class Test {
     public static void main(String[] args) {
        Tasks task1 = new Tasks();
        Tasks task2 = new Tasks();
        Tasks task3 = new Tasks();

        task1.start();
        task2.start();
        task3.start();
    }
}
