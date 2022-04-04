package edu.ufp.inf.lp2.aulas.pl._1_intro;

import java.lang.String;

public class Rectangle {

  private Point ulc;

  private Point lrc;

  public Rectangle(Point ulc, Point lrc) {
    this.ulc = new Point(0.0f,0.0f);
    this.lrc = new Point(0.0f,0.0f);
  }


  public void move(float dx, float dy) {

    this.ulc.move(dx,dy);
    this.lrc.move(dx,dy);
  }

  public float area() {

    float deltax, deltay;
    deltax = this.ulc.distX(this.lrc);
    deltay = this.ulc.distY(this.lrc);

    return Math.abs(deltax * deltay);
  }

  public float perimeter() {

    float deltax, deltay;
    deltax = this.ulc.distX(this.lrc);
    deltay = this.ulc.distY(this.lrc);

    return (deltax +deltay) * 2;
  }

  public boolean isInside(Point p) {

    return p.betweenPointsX(this.ulc, this.lrc) && p.betweenPointsY(this.ulc, this.lrc);
  }

  public boolean isOutside(Point p) {
  return !isInside(p);
  }

  public boolean interceptedBy(Rectangle r){
    return r.isInside(this.ulc) || r.isInside(this.lrc) || r.interceptedBy(this);
  }

  public Point getUlc() {
    return ulc;
  }

  public Point getLrc() {
    return lrc;
  }

  public void setUlc(Point ulc) {
    this.ulc = ulc;
  }

  public void setLrc(Point lrc) {
    this.lrc = lrc;
  }


  @Override
  public String toString() {
    return "Rectangle{" +
            "ulc=" + this.ulc.getX() + "/" + this.ulc.getY() +
            ", lrc=" + this.lrc.getX() + "/" + this.lrc.getY() +
            '}';
  }

  public static void main(String[] args) {

    Point p1 = new Point(1.0f,7.0f);
    Rectangle r1 = new Rectangle(p1, new Point(15.0f,1.0f));

    System.out.println("Area: " + r1.area());
    System.out.println("Perimetro: " + r1.perimeter());
    System.out.println("ToString P1: " + p1);
    System.out.println("ToString R1: " + r1);

  }

}