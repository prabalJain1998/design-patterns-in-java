public class ShapeFactory {
    public static Shape getInstance(String input) {
        switch (input) {
            case "RECTANGLE":
                return new Rectangle();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }
}
