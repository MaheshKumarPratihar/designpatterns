package factorymethoddesignpattern.document.renderer;

import factorymethoddesignpattern.document.elements.DocumentElement;

// Product interface: Defines the interface for objects the factory method creates.
public interface ElementRenderer {
    void render(DocumentElement element);
}
