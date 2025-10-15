package factorymethoddesignpattern.document;

import factorymethoddesignpattern.document.elements.DocumentElement;
import factorymethoddesignpattern.document.elements.Image;
import factorymethoddesignpattern.document.elements.Paragraph;
import factorymethoddesignpattern.document.exporter.DocumentExporter;
import factorymethoddesignpattern.document.exporter.HtmlExporter;
import factorymethoddesignpattern.document.exporter.PdfExporter;


import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {
        // The list of elements in our document
        List<DocumentElement> documentElements = Arrays.asList(new Paragraph("This is the first paragraph."), new Image("path/to/my/image.jpg"), new Paragraph("This is another paragraph following the image."));

        // Export to HTML without the client knowing anything about HTML renderers
        System.out.println("CLIENT: I need to export this document to HTML.");
        DocumentExporter htmlExporter = new HtmlExporter();
        htmlExporter.export(documentElements);

        // Export to PDF without the client knowing anything about PDF renderers
        System.out.println("CLIENT: Now I need to export the same document to PDF.");
        DocumentExporter pdfExporter = new PdfExporter();
        pdfExporter.export(documentElements);
    }
}