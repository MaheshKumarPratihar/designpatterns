package factorymethoddesignpattern.document.renderer;

import factorymethoddesignpattern.document.elements.DocumentElement;

// Concrete Product for rendering an Image to HTML
public class HtmlImageRenderer implements ElementRenderer {
    @Override
    public void render(DocumentElement element) {
        System.out.println("<img src=\"" + element.getContent() + "\" />");
    }
}
