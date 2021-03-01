import java.util.*;

public class DriverPoint{
    public static void main(String[] args){
       ArrayList<Object> Points = new ArrayList<Object>();

       Point p1 = new Point(5, 6);
       Point p2 = new Point(3, 3);
        
       Points.add(p1);
       Points.add(p2);

       System.out.println(p1 + "  " +  p2);
       System.out.println(Points);
    }
}