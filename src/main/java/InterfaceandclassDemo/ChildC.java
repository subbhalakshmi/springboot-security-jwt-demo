package InterfaceandclassDemo;

public class ChildC implements InterfaceChild3 {


    @Override
    public void show() {
        System.out.println("ChildC running Child 3 : show");
    }

    @Override
    public void dance() {
        System.out.println("ChildC running Child 3 : dance");

    }
}
