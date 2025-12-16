package patterns.Creational.AbstractFactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("Displaying the MacCheckBOx");
    }

    @Override
    public void check() {
        System.out.println("Checking the maccheckbox");
    }
}
