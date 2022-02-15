package InterfaceandclassDemo;

public class ChildA implements InterfaceChild1 {
    @Override
    public void disc() {
        System.out.println("Am disc in ChildA implements Child1");
    }

    @Override
    public void show() {
        InterfaceChild1.super.show();
    }
}
