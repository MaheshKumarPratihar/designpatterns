package factorymethoddesignpattern.document.renderer;

import factorymethoddesignpattern.document.elements.DocumentElement;

// Concrete Product for rendering an Image to PDF
public class PdfImageRenderer implements ElementRenderer {
    @Override
    public void render(DocumentElement element) {
        System.out.println("[PDF] Image at path: " + element.getContent());
    }
}
