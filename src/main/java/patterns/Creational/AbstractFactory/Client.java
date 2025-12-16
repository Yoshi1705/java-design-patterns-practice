package patterns.Creational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        UIFactory f = new WindowsFactory();
        Button b = f.createButton();
        b.click();
        b.render();
        CheckBox ch = f.createcheckbox();
        ch.check();
        ch.render();
    }
}
