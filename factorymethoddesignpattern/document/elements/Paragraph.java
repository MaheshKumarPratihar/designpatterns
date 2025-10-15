package factorymethoddesignpattern.document.elements;

// Concrete document element: Paragraph
public class Paragraph implements DocumentElement {
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String getType() {
        return "Paragraph";
    }

    @Override
    public String getContent() {
        return text;
    }
}
