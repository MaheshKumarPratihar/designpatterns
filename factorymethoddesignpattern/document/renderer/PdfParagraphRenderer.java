package factorymethoddesignpattern.document.renderer;

import factorymethoddesignpattern.document.elements.DocumentElement;

// Concrete Product for rendering a Paragraph to PDF
public class PdfParagraphRenderer implements ElementRenderer {
    @Override
    public void render(DocumentElement element) {
        System.out.println("[PDF] Paragraph: " + element.getContent());
    }
}



