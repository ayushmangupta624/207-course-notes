public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    /**
     * Scales both dimensions of the rectangle by the given factor.
     * @param factor is the multiplier applied to width and height. 
     */
    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    public boolean isLargerThan(Rectangle other){
        if(area() > other.area())
            return true;
        else
            return false;
    }
}
