package inheritance.exercise.e2;

import java.util.Arrays;

public class TextPoint {
    public static void main(String[] avgs){
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D);
        float[] tmp = point2D.getXY();
        System.out.println(Arrays.toString(tmp));

        Point3D point3D = new Point3D(2 , 3 , 4);
        System.out.println(point3D);
        float[] res = point3D.getXYZ();
        System.out.println(Arrays.toString(res));

    }
}
