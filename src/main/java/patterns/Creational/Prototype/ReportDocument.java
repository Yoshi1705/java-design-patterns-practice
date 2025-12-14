package patterns.Creational.Prototype;

import java.time.LocalDate;

public class ReportDocument extends Document{

    private String approvedBy;

    public ReportDocument setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    @Override
    public Document clone() {
        ReportDocument d = new ReportDocument();
        d.setApprovedBy("Yoshitha").setAuthor("Mini").setTitle("IDK");
        return d;
    }

    public String toString() {
        return "author is "+this.getAuthor()+"title is"+this.getTitle()+"content is"+this.getContent()+"creation date is"+this.getCreatedDate()+"invoice"+this.approvedBy;

    }
}
