public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 5);
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
