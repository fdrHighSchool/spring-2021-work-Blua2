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
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "("+ this.x+","+this.y+")";
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    public double Distance(Point Point1, Point Point2){
        double distance;

        double x1 = Point1.x; double y1 = Point1.y;
        double x2 = Point2.x; double y2 = Point2.y;

        distance = Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));

        return distance;
    }

    public static Point midPoint(Point Point1, Point Point2){
        int x1 = Point1.x; int y1 = Point1.y;
        int x2 = Point2.x; int y2 = Point2.y;
        int xm; int ym;

        xm = (x1 + x2)/2;
        ym = (y1 + y2)/2;

        Point midPoint = new Point(xm,ym);

        return midPoint;
    }

    public static double slope(Point Point1, Point Point2){
        double slope;
        
        int x1 = Point1.x; int y1 = Point1.y;
        int x2 = Point2.x; int y2 = Point2.y;

        slope = (y2 - y1)/(x2 - x1);

        return slope;
    }

    public static Boolean isCollinear(Point Point1, Point Point2, Point Point3){
        Boolean isCollinear = false;

        int x1 = Point1.x; int y1 = Point1.y; int x3 = Point3.x;
        int x2 = Point2.x; int y2 = Point2.y; int y3 = Point3.y;

        if((y2 - y1)/(x2 - x1) == (y3 - y2)/(x3 - x2)){
            isCollinear = true;
        }

        return isCollinear;
    }
}
