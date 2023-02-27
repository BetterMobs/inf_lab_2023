public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 3);
        Point p2 = new Point(4,0);
        Segment s1 = new Segment(p1, p2);
//        System.out.println(s1.getP2().x);
        System.out.println(s1.distance());
//        System.out.println(p1.x);
//        System.out.println(p1.y);
    }
}