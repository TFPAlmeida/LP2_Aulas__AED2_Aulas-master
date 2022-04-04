package edu.ufp.inf.lp2.aulas.pl._1_intro;

import java.lang.String;

public class Circle {

  private Point center;

  private Point periferic;

  public Circle(Point center, Point periferic) {
    this.center = new Point(0.0f,0.0f);
    this.periferic = new Point(0.0f,0.0f);
  }

  public void move(float dx, float dy) {
  }

  public float area() {
   float area, raio;

   raio = (float) Math.sqrt(Math.pow(this.periferic.getX() - this.center.getX(),2) + Math.pow(this.periferic.getY() - this.center.getY(),2));
   area = (float) (Math.PI * Math.pow(raio,2));

    return area;
  }

  public float perimeter() {
    float perimetro, raio;

    raio = (float) Math.sqrt(Math.pow(this.periferic.getX() - this.center.getX(),2) + Math.pow(this.periferic.getY() - this.center.getY(),2));
    perimetro = (float) (2 * Math.PI * raio);
    return perimetro;
  }

  public boolean isInside(Point p) {
    float raio, distanciaPC;

    raio = (float) Math.sqrt(Math.pow(this.periferic.getX() - this.center.getX(),2) + Math.pow(this.periferic.getY() - this.center.getY(),2));
    distanciaPC = (float) Math.sqrt(Math.pow(this.center.getX() - p.getX(),2) + Math.pow(this.center.getY() - p.getY(),2));


    return (distanciaPC <= raio);
  }

  public boolean isOutside(Point p) {
  return !isInside(p);
  }

  public String toString() {
  return null;
  }

  public float radius() {
  return 0.0f;
  }

  public static void main(String[] args) {

  }

  public Point getCenter() {
    return center;
  }

  public Point getPeriferic() {
    return periferic;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public void setPeriferic(Point periferic) {
    this.periferic = periferic;
  }
}