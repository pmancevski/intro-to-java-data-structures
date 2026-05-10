package Exercise10_12;

import Exercise10_4.MyPoint;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D(){
        p1 = new MyPoint();
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea(){
        //formula: | (x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)) / 2 |

        return Math.abs(((p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX()
                * (p1.getY() - p2.getY())) / 2));
    }

    //there are 2 methods for calculating area of triangle, i didnt see the hint and asked AI for first method
    // (only for math formula :) )
    public double getArea1(){
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = p3.getX();
        double y3 = p3.getY();

        double side1 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
        double side2 = Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)), 0.5);
        double side3 = Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)), 0.5);

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        double side1 = MyPoint.distance(p1, p2);
        double side2 = MyPoint.distance(p2, p3);
        double side3 = MyPoint.distance(p3, p1);

        return side1 + side2 + side3;
    }

    public boolean contains(MyPoint p){
        Triangle2D triangle1 = new Triangle2D(p, p1, p2);
        Triangle2D triangle2 = new Triangle2D(p, p2, p3);
        Triangle2D triangle3 = new Triangle2D(p, p3, p1);

        double mainTriangleArea = getArea();
        double triangle1Area = triangle1.getArea();
        double triangle2Area = triangle2.getArea();
        double triangle3Area = triangle3.getArea();

        return triangle1Area +  triangle2Area + triangle3Area == mainTriangleArea;
    }

    public boolean contains(Triangle2D triangle){

        return  this.contains(triangle.getP1()) && this.contains(triangle.getP2()) && this.contains(triangle.getP3());
    }

    public boolean overlaps(Triangle2D triangle){
        // Check if any vertex of t is inside this triangle
        if (contains(triangle.getP1()) || contains(triangle.getP2()) || contains(triangle.getP3())) {
            return true;
        }

        // Check if any vertex of this triangle is inside t
        if (triangle.contains(getP1()) || triangle.contains(getP2()) || triangle.contains(getP3())) {
            return true;
        }

        return false;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}
