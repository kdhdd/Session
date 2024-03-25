public class Circle {
    int radius;

    public void Area() {
        System.out.println(radius * radius * 3.14);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 8;
        circle1.Area();
    }
}
