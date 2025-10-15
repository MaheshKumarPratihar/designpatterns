## Document Export Application

### Problem: 
Imagine you are developing a document processing application. This application allows users to create documents that contain various types of elements, such as paragraphs of text, images, and tables. A key feature of the application is the ability to export the entire document to different formats, initially to PDF and HTML.

The way each element is rendered is highly dependent on the chosen export format. For example:

1. An image in HTML is represented by an `<img>` tag with a source attribute.
2. An image in a PDF document is embedded as a compressed binary object at specific coordinates.
3. A table in HTML is constructed using `<table>`, `<tr>`, and `<td>` tags.
4. A table in a PDF might be drawn using lines and text objects.

The core application logic needs to iterate through a list of document elements and generate the correct output for the selected format. The challenge is to do this without cluttering the element classes (Paragraph, Image, etc.) with format-specific rendering logic. We also want to be able to easily add new export formats in the future (e.g., XML, Plain Text) with minimal changes to the existing code.

### Solution with the Factory Method Design Pattern
The Factory Method pattern is ideal for this scenario. It provides an interface for creating objects in a superclass but lets subclasses alter the type of objects that will be created. This pattern allows us to decouple the main document processing logic from the concrete rendering classes for each format.

Here’s how the pattern is applied:
- Product Interface (ElementRenderer): Defines a common interface for all renderer objects.
- Concrete Products (PdfImageRenderer, HtmlImageRenderer, etc.): Implement the ElementRenderer interface for a specific element and a specific format.
- Creator (Abstract DocumentExporter): An abstract class that declares the factorymethoddesignpattern method (createRenderer). The core logic for iterating through document elements and calling their render methods lives here.
- Concrete Creators (PdfExporter, HtmlExporter): Subclasses that implement the factorymethoddesignpattern method to create and return the specific Concrete Product for their format.