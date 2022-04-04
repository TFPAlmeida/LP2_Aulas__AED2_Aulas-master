package edu.ufp.inf.lp2.aulas.tp._01_intro;

public class Circle {

    private Point center;
    private Point periferic;

    public Circle(Point center, Point periferic) {
        this.center = center;
        this.periferic = periferic;
    }

    public void move(float dx, float dy){
        this.center.x += dx;
        this.center.y += dy;
        this.periferic.x += dx;
        this.periferic.y += dy;
    }

    public float area(){
        return (float)((Math.PI)*(Math.pow(center.dist(periferic),2)));
    }

    public boolean isInside(Circle c, Point p) {
        Circle circle = new Circle(center, p);
        return circle.area()<=c.area();
    }

    public boolean isOutside(Circle c, Point p) {
        return !isInside(c,p);
    }

    public String toString() {
        return "Circle@{(" + center.x + "," + center.y + ");(" + periferic.x + "," + periferic.y + ")}";
    }

    public static void main(String[] args) {


        Point center = new Point(4,4);
        Point periferic = new Point(0,4);

        Circle circle = new Circle(center, periferic);

        Point point = new Point(4,4);

        System.out.println(circle.isInside(circle, point));
        System.out.println(circle.isOutside(circle, point));

    }

}
