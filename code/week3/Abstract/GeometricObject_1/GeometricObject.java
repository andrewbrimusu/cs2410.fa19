public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
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

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return String.format("created on %s\ncolor: %s\nfilled: %b", dateCreated, color, filled);
    }
}