package factorymethoddesignpattern.document.exporter;

import factorymethoddesignpattern.document.renderer.ElementRenderer;
import factorymethoddesignpattern.document.elements.DocumentElement;

import java.util.List;

// Creator: Declares the factory method that returns a Product object.
public abstract class DocumentExporter {

    // The factory method. Subclasses MUST implement this.
    public abstract ElementRenderer createRenderer(String elementType);

    // The core logic that uses the factory method.
    // This method is not coupled to any concrete renderer classes.
    public void export(List<DocumentElement> elements) {
        System.out.println("--- Starting Export ---");
        for (DocumentElement element : elements) {
            ElementRenderer renderer = createRenderer(element.getType());
            renderer.render(element);
        }
        System.out.println("--- Export Finished ---\n");
    }
}
