
public class Point {
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y){
        setLocation(x, y);
    }

    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setLocation(int x, int y){

    }

    public String toString(){
        return "("+ this.x+","+this.y+")";
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    public void Distance(Object Point1, Object Point2){

    }

    public void midPoint(Object Point1, Object Point2){

    }

    public void slope(Object Point1, Object Point2){

    }
    public void isCollinear(Object Point1, Object Point2){

    }
}
