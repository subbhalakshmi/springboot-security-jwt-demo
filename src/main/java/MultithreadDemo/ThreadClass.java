package MultithreadDemo;

public class ThreadClass extends Thread {

    @Override
    public void run() {
//        super.run();
        System.out.println("Running child thread");
    }
}
