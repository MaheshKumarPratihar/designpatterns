package factorymethoddesignpattern.document.elements;

// Concrete document element: Image
public class Image implements DocumentElement {
    private final String imagePath;

    public Image(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String getType() {
        return "Image";
    }

    @Override
    public String getContent() {
        return imagePath;
    }
}
