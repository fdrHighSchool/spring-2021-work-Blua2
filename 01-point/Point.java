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

    /* 
    N Distance
    P Recieve the distance between two Point objects
    I Point objects
    R distance(double)
    */
    public double Distance(Point Point1, Point Point2){
        double distance;

        double x1 = Point1.x; double y1 = Point1.y; //Retrieve the individual x and y values from Point objects.
        double x2 = Point2.x; double y2 = Point2.y;

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); //formula for distance

        return distance;
    }

    /* 
    N midPoint
    P Calculate the midpoint of two points
    I Point objects
    R midPoint(Point object)
    */
    public Point midPoint(Point Point1, Point Point2){
        int x1 = Point1.x; int y1 = Point1.y;
        int x2 = Point2.x; int y2 = Point2.y;
        int xm; int ym;

        xm = (x1 + x2)/2; //Values for xm and ym have to be stored in their own variables b/c PEMDAS doesn't work the same in Java.
        ym = (y1 + y2)/2;

        Point midPoint = new Point(xm,ym);

        return midPoint;
    }

    /* 
    N slope
    P Calculate the slope of two points that would connect them
    I Point objects
    R slope(double)
    */
    public double slope(Point Point1, Point Point2){
        double slope;
        
        int x1 = Point1.x; int y1 = Point1.y;
        int x2 = Point2.x; int y2 = Point2.y;
        double xm = x2 - x1; double ym = y2 - y1;

        slope = ym/xm;

        return slope;
    }

    /* 
    N isCollinear
    P Determine if the three point objects are collinear
    I Three Point objects
    R isCollinear(Boolean)
    */
    public Boolean isCollinear(Point Point1, Point Point2, Point Point3){
        Boolean isCollinear = false;

        int x1 = Point1.x; int y1 = Point1.y; int x3 = Point3.x;
        int x2 = Point2.x; int y2 = Point2.y; int y3 = Point3.y;

        if((y2 - y1)/(x2 - x1) == (y3 - y2)/(x3 - x2)){//Check if the formula for collinearity is true
            isCollinear = true;
        }

        return isCollinear;
    }
}
