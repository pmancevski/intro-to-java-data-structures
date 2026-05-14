package utils;

import java.util.Date;

public abstract class GeometricObjectOld {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObjectOld() {
        dateCreated = new Date();
    }

    protected GeometricObjectOld(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}
