package factorymethoddesignpattern.document.exporter;

import factorymethoddesignpattern.document.renderer.ElementRenderer;
import factorymethoddesignpattern.document.renderer.PdfImageRenderer;
import factorymethoddesignpattern.document.renderer.PdfParagraphRenderer;

// Concrete Creator for PDF format
public class PdfExporter extends DocumentExporter {
    @Override
    public ElementRenderer createRenderer(String elementType) {
        if ("Paragraph".equals(elementType)) {
            return new PdfParagraphRenderer();
        } else if ("Image".equals(elementType)) {
            return new PdfImageRenderer();
        }
        // Return a default or null renderer if element type is unknown
        return (elem) -> System.out.println("Unsupported element type for PDF.");
    }
}
