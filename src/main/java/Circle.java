public class Circle extends Figure {
    private double area;

    public double getArea() {
        return CircleArea();
    }

    public static void main(String[] args) {
        System.out.println(CircleArea());

    }


    public static double CircleArea() {
        Point center = new Point();
        Point radiusLine = new Point();
        int center_x = center.get_X();
        int center_y = center.get_Y();
        int radiusLine_x = radiusLine.get_X();
        int radiusLine_y = radiusLine.get_Y();
        double raduis = Math.sqrt(Math.pow(radiusLine_x - center_x, 2) + Math.pow(radiusLine_y - center_y, 2));
        double area = 3.1415 * Math.pow(raduis, 2);
        return area;
    }
}
