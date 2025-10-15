package factorymethoddesignpattern.document.renderer;

import factorymethoddesignpattern.document.elements.DocumentElement;

// Concrete Product for rendering a Paragraph to HTML
public class HtmlParagraphRenderer implements ElementRenderer {
    @Override
    public void render(DocumentElement element) {
        System.out.println("<p>" + element.getContent() + "</p>");
    }
}
