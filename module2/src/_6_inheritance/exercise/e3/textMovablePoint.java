package inheritance.exercise.e3;

public class textMovablePoint {
    public static void main(String[] args) {
        Point point = new Point(20,30);
        System.out.println(point.toString());
        point.setXY(10,20);
        System.out.println(point.toString());
        point = new MovablePoint(point.getX(), point.getY(), 10, 20);
        System.out.println(point.toString());
        ((MovablePoint) point).move();
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint( 10,20,30,40);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
