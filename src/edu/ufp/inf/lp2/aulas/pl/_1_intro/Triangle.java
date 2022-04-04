package edu.ufp.inf.lp2.aulas.pl._1_intro;

import java.lang.String;

public class Triangle {

  private Point upperpt;

  private Point lowerrleftpt;

  private Point lowerrightpt;


  public Triangle(Point upperpt, Point lowerrleftpt, Point lowerrightpt) {
    this.upperpt = new Point(0.0f,0.0f);
    this.lowerrleftpt = new Point(0.0f,0.0f);
    this.lowerrightpt = new Point(0.0f,0.0f);
  }

  public void move(float dx, float dy, float dz) {
  }

  public float area() {
    float altura;
    float base;

    altura = this.upperpt.getY() - this.lowerrightpt.getY();
    base = this.lowerrightpt.getX() - this.lowerrleftpt.getX();

    return (base * altura)/2;
  }

  public float perimeter() {
    float altura;
    float base1, base2;
    double ab, ac;
    altura = this.upperpt.getY() - this.lowerrightpt.getY();
    base1 = this.upperpt.getX() - this.lowerrleftpt.getX();
    base2 = this.lowerrightpt.getX() - this.upperpt.getX();
    ab =  Math.sqrt(Math.pow(base1,2) + Math.pow(altura,2));
    ac = Math.sqrt(Math.pow(base2,2) + Math.pow(altura,2));


    return (float)(base1 + base2 + ab + ac);
  }

  public boolean isInside(Point p) {
    float area_total, area1, area2, area3;
    float base0, base1, base2, base3;
    float altura0, altura1, altura2, altura3;
    float x2, y2, x3, y3; // == Point p2, p3;

    altura0 = this.upperpt.getY() - this.lowerrightpt.getY();
    base0 = this.lowerrightpt.getX() - this.lowerrleftpt.getX();

    area_total = (base0 * altura0)/2;

    altura1 = p.getY() - this.lowerrightpt.getY();
    base1 = this.lowerrightpt.getX() - this.lowerrleftpt.getX();

    area1 = (base1 * altura1)/2;

    x2 = (this.lowerrightpt.getX() + this.upperpt.getX())/2;
    y2 = (this.lowerrightpt.getY() + this.upperpt.getY())/2;
    altura2 = (float) Math.sqrt(Math.pow(x2 - p.getX(),2) + Math.pow(y2 - p.getX(),2));
    base2 = (float) Math.sqrt(Math.pow(this.lowerrightpt.getX() - this.upperpt.getX(),2) + Math.pow(this.lowerrightpt.getY() - this.upperpt.getY(),2));

    area2 = (base2 * altura2)/2;

    x3 = (this.upperpt.getX() + this.lowerrleftpt.getX())/2;
    y3 = (this.upperpt.getY() + this.lowerrleftpt.getY())/2;
    altura3 = (float) Math.sqrt(Math.pow(x3 - p.getX(),2) + Math.pow(y3 - p.getX(),2));
    base3 = (float) Math.sqrt(Math.pow(this.upperpt.getX() - this.lowerrleftpt.getX(),2) + Math.pow(this.upperpt.getY() - this.lowerrleftpt.getY(),2));

    area3 = (base3 * altura3)/2;

    return (area_total == area1 +area2 + area3);
  }

  public boolean isOutside(Point p) {
  return !isInside(p);
  }

  public String toString() {
  return null;
  }

  public Point getUpperpt() {
    return upperpt;
  }

  public Point getLowerrleftpt() {
    return lowerrleftpt;
  }

  public Point getLowerrightpt() {
    return lowerrightpt;
  }

  public void setUpperpt(Point upperpt) {
    this.upperpt = upperpt;
  }

  public void setLowerrleftpt(Point lowerrleftpt) {
    this.lowerrleftpt = lowerrleftpt;
  }

  public void setLowerrightpt(Point lowerrightpt) {
    this.lowerrightpt = lowerrightpt;
  }

  public static void main(String[] args) {

  }
}