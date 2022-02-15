package MultithreadDemo;

public class MainclassforRunnable {

    public  static void main(String[] args){
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();

        System.out.println("Running Main thread : " + Thread.currentThread().getName());

    }
}
