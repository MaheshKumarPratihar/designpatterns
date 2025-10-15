package factorymethoddesignpattern.document.exporter;

import factorymethoddesignpattern.document.renderer.ElementRenderer;
import factorymethoddesignpattern.document.renderer.HtmlImageRenderer;
import factorymethoddesignpattern.document.renderer.HtmlParagraphRenderer;

// Concrete Creator for HTML format
public class HtmlExporter extends DocumentExporter {
    @Override
    public ElementRenderer createRenderer(String elementType) {
        if ("Paragraph".equals(elementType)) {
            return new HtmlParagraphRenderer();
        } else if ("Image".equals(elementType)) {
            return new HtmlImageRenderer();
        }
        // Return a default or null renderer if element type is unknown
        return (elem) -> System.out.println("Unsupported element type for HTML.");
    }
}

