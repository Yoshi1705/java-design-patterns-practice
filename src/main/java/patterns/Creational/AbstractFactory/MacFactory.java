package patterns.Creational.AbstractFactory;

public class MacFactory implements UIFactory{


    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createcheckbox() {
        return new MacCheckBox();
    }
}
