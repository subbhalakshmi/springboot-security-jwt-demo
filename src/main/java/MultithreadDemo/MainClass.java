package MultithreadDemo;

public class MainClass {

    public  static void main(String[] args){
        System.out.println("First Running Main thread");

        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        System.out.println("Running Main thread : " + Thread.currentThread().getName());


    }
}
