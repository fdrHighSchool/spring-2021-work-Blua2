import java.util.*;

public class DriverPoint{
    public static void main(String[] args){
       ArrayList<Object> Points = new ArrayList<Object>();

       Point Point1 = new Point(5, 4);
       Point Point2 = new Point(2, 2);
       Point Point3 = new Point(3, 3);
        
       Points.add(Point1);
       Points.add(Point2);
       Points.add(Point3);

       System.out.println(Points);
       System.out.println("Distance: " + Point1.Distance(Point1, Point2));
       System.out.println("Midpoint: " + Point1.midPoint(Point1, Point2));
       System.out.println("Slope: " + Point1.slope(Point1, Point2));
       System.out.println("Collinear: " + Point1.isCollinear(Point1, Point2, Point3));
    }
}