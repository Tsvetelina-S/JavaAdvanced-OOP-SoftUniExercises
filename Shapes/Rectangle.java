package Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public Double calculatePerimeter() {
        return (2 * (getWidth() * getHeight()));
    }

    @Override
    public Double calculateArea() {
        return getWidth() * getHeight();
    }
}
