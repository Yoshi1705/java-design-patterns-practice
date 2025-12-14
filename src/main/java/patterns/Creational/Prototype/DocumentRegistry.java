package patterns.Creational.Prototype;

import java.util.HashMap;

public class DocumentRegistry {

    HashMap<String , Document> pile = new HashMap<>();

    public DocumentRegistry(){
        pile.put("Report",new ReportDocument());
        pile.put("Invoice", new InvoiceDocument());
    }

    public Document createTemplates(String type){

        return pile.get(type).clone();
    }
}
