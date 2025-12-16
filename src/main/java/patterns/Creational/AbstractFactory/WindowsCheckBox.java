package patterns.Creational.AbstractFactory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Displaying Windows CheckBox");
    }

    @Override
    public void check() {
        System.out.println("checking the CheckBox");
    }
}
