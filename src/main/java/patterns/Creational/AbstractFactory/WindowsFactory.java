package patterns.Creational.AbstractFactory;

public class WindowsFactory implements UIFactory{

    @Override
    public Button createButton() {
         return new WindowsButton();
    }

    @Override
    public CheckBox createcheckbox() {
        return new WindowsCheckBox();
    }
}
