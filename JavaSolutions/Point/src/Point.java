import static java.lang.Math.sqrt;

public class Point<b> {
    public int x;
    public int y;
    public Point(){
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double dist1=(double) ( this.x*this.x + this.y*this.y);
        return Math.sqrt(dist1);
    }
    public double distance(int x, int y){
        double dist2= ( (x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
        return Math.sqrt(dist2);
    }






}

