package MultithreadDemo;

public class RunnableDemo implements  Runnable{
    @Override
    public void run() {
        System.out.println("Running Runnable child thread");
    }
}
