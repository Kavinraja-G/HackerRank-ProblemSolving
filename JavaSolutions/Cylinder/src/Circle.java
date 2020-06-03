public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0)
            this.radius=0;
        this.radius = radius;
    }
    public double getArea(){
        return (radius*radius*Math.PI);
    }
}
