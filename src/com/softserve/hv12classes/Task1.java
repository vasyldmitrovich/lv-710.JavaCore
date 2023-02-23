package hv12classes;

    public class Task1 {

    public static void runTask1 () throws InterruptedException {

        Thread t1 = new Threads("Tread 1", "Started");
        Thread t2 = new Threads("Tread 2", "Started too");
        Thread t3 = new Threads("Tread 3");


        t3.start();
        t2.start();
        t1.start();

        t3.join();
    }

}
