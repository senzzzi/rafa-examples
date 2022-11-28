public class Square implements GeometricFigure {

    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double getArea() {
        return (double) a * b;
    }
}
