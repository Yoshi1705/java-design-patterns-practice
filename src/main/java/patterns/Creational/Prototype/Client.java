package patterns.Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        DocumentRegistry r = new DocumentRegistry();

        Document d = r.createTemplates("Invoice");

        System.out.println("object before clone"+d.toString());

        Document clone1 = d.clone();
        System.out.println(clone1.toString());

        System.out.println("after changing values");

        clone1.setTitle("Jeya").setAuthor("Chandra");

        System.out.println("after setting attributes"+clone1.toString());
    }
}
