package patterns.Creational.Prototype;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Document {
    private String title;
    private String author;
    private LocalDate createdDate;
    private String content;
    private List<Section> sections;

    public String getTitle() {
        return title;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public Document setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Document setAuthor(String author) {
        this.author = author;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Document setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Document setContent(String content) {
        this.content = content;
        return this;
    }

    public Document clone(){

        // this is how we need to do for mutable types
          Document d = new Document();
          d.setAuthor(this.getAuthor()).setTitle(this.getTitle()).setContent(this.getContent()).setCreatedDate(this.getCreatedDate());
          List<Section> sectionCopies = new ArrayList<>();
             for (Section s : this.sections) {
                sectionCopies.add(s.clone());
            }
         d.setSections(sectionCopies);
          return d;
    }

    @Override
    public String toString() {
        return "author is "+this.getAuthor()+"title is"+this.getTitle()+"content is"+this.getContent()+"creation date is"+this.getCreatedDate();
    }
}
