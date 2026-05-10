package Exercise10_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D(){
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width * height);
    }

    public boolean contains(double x, double y){
        double leftBoundaries = getX() - getWidth() / 2;
        double rightBoundaries = getX() + getWidth() / 2;
        double bottomBoundaries = getY() - getHeight() / 2;
        double topBoundaries = getY() + getHeight() / 2;

        return x >= leftBoundaries && x <= rightBoundaries && y >= bottomBoundaries && y <= topBoundaries;
    }

    public boolean contains(MyRectangle2D r){
        double leftBoundaries = getX() - getWidth() / 2;
        double rightBoundaries = getX() + getWidth() / 2;
        double bottomBoundaries = getY() - getHeight() / 2;
        double topBoundaries = getY() + getHeight() / 2;

        double leftBoundariesR = r.getX() - r.getWidth() / 2;
        double rightBoundariesR = r.getX() + r.getWidth() / 2;
        double bottomBoundariesR = r.getY() - r.getHeight() / 2;
        double topBoundariesR = r.getY() + r.getHeight() / 2;

        return leftBoundariesR >= leftBoundaries && rightBoundariesR <= rightBoundaries
                && bottomBoundariesR >= bottomBoundaries && topBoundariesR <= topBoundaries;
    }

    public boolean  overlaps(MyRectangle2D r){
        double leftBoundaries = getX() - getWidth() / 2;
        double rightBoundaries = getX() + getWidth() / 2;
        double bottomBoundaries = getY() - getHeight() / 2;
        double topBoundaries = getY() + getHeight() / 2;

        double leftBoundariesR = r.getX() - r.getWidth() / 2;
        double rightBoundariesR = r.getX() + r.getWidth() / 2;
        double bottomBoundariesR = r.getY() - r.getHeight() / 2;
        double topBoundariesR = r.getY() + r.getHeight() / 2;

        if (leftBoundariesR > rightBoundaries || rightBoundariesR < leftBoundaries ||
                bottomBoundariesR > topBoundaries || topBoundariesR < bottomBoundaries) {
            return false;
        }

        return true;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
