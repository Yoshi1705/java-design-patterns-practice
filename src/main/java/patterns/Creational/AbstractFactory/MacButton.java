package patterns.Creational.AbstractFactory;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering MacButton");
    }

    @Override
    public void click() {
        System.out.println("Clicked MacButton");
    }
}
