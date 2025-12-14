package patterns.Creational.Prototype;

public class Section {
    private String heading;
    private String content;

    public Section(String heading, String content) {
        this.heading = heading;
        this.content = content;
    }

    public Section clone() {
        return new Section(this.heading, this.content);
    }
}
