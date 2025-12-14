package patterns.Creational.Prototype;

public class InvoiceDocument extends Document{

    private String sellerName;

    public InvoiceDocument setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    @Override
    public Document clone() {
        InvoiceDocument copy = new InvoiceDocument();
        copy.setSellerName(this.sellerName)
                .setAuthor(this.getAuthor())
                .setTitle(this.getTitle())
                .setContent(this.getContent())
                .setCreatedDate(this.getCreatedDate());
        return copy;
    }

    public String toString() {
        return "author is "+this.getAuthor()+"title is"+this.getTitle()+"content is"+this.getContent()+"creation date is"+this.getCreatedDate()+"invoice"+this.sellerName;

    }
}
