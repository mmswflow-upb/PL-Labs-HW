public class TestLine {
    public static void main(String[] args) {
    Line l1 = new Line(0, 0, 3, 4);
    System.out.println(l1);
    System.out.println("The length of the line l1 is " + l1.getLength());
    System.out.println("The gradient of the line l1 is " + l1.getGradient());
    System.out.println();
    Point p1 = new Point(5, 6);
    Point p2 = new Point(7, 8);
    Line l2 = new Line(p1, p2);
    System.out.println(l2);
    System.out.println("The length of the line l2 is " + l2.getLength());
    System.out.println("The gradient of the line l2 is " + l2.getGradient());
    System.out.println();
    l2.setBeginXY(1,2);
    l2.setEndXY(14,15);
    System.out.println(l2);
    System.out.println("For the new coordinates of the line l2 the results are:");
    System.out.println("The length of the new line l2 is " + l2.getLength());
    System.out.println("The gradient of the new line l2 is " + l2.getGradient());
    System.out.println();
    Point p3 = new Point(9, 10);
    l2.setBegin(p3);
    System.out.println("The new coordinates of the starting point of the line l2 are:");
    System.out.println("The X and Y coordinates of the starting point are " + l2.getBegin());
    System.out.println("The X coordinate is " + l2.getBeginX() + " and the Y coordinate is " + l2.getBeginY());
    }
}