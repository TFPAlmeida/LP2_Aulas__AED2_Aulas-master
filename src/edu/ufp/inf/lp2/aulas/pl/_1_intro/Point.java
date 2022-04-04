package edu.ufp.inf.lp2.aulas.pl._1_intro;

public class Point {
    private float x, y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public void moveX(float dx) {
        this.x += dx;
    }

    public void moveY(float dy) {
        this.y += dy;
    }

    public float dist(Point p) {

        /*
        float dx = this.distX(p);
        float dy = p.distY(this);
        return (float) Math.sqrt(dx*dx + dy*dy);
        */

        return (float) Math.sqrt((float) Math.pow(distX(p), 2) + (float) Math.pow(distY(p), 2));
    }

    public float distX(Point p) {
        return p.getX() - this.x;
    }

    public float distY(Point p) {
        return p.getY() - this.y;
    }

    public boolean betweenPointsX(Point leftPt, Point rightPt){
        return (this.x>=leftPt.x && this.y<=rightPt.x);
    }

    public boolean betweenPointsY(Point upPt, Point downPt){
        return (this.x<=upPt.y && this.y>=downPt.y);
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2.0f, 0.5f);
        p1.setX(1.0f);
        p1.setY(1.0f);
        System.out.println(p1.distX(p2));
        System.out.println(p2.distX(p1));
        System.out.println(p1.dist(p2));
        p1.moveX(2.0f);
        System.out.println(p1.getX());

    }


}
