package edu.ufp.inf.lp2.aulas.tp._01_intro;

public class Triangle {

    private Point upperpt;

    private Point lowerleftpt;

    private Point lowerrigghtpt;


    public Triangle(Point upperpt, Point lowerleftpt, Point lowerrigghtpt) {
        this.upperpt = upperpt;
        this.lowerleftpt = lowerleftpt;
        this.lowerrigghtpt = lowerrigghtpt;
    }

    public void move(float dx, float dy, float dz) {
        this.upperpt.x+=dx;
        this.upperpt.y+=dy;
        this.lowerleftpt.x+=dx;
        this.lowerleftpt.y+=dy;
        this.lowerrigghtpt.x+=dx;
        this.lowerrigghtpt.y+=dy;
    }

    public double area() {
        float area = (upperpt.distY(lowerleftpt) * lowerleftpt.distX(lowerrigghtpt))/2;
        if(area <0)area*=(-1);return area;
    }

    public float perimeter() {
        return lowerleftpt.dist(lowerrigghtpt) + lowerleftpt.dist(upperpt) + lowerrigghtpt.dist(upperpt);
    }

    public boolean isInside(Point p) {

        boolean has_neg, has_pos;

        float d1 = (upperpt.x - lowerrigghtpt.x) * (lowerleftpt.y- lowerrigghtpt.y) - (lowerleftpt.x - lowerrigghtpt.x) * (upperpt.y - lowerrigghtpt.y);
        float d2 = (p.x - lowerrigghtpt.x) * (lowerleftpt.y- lowerrigghtpt.y) - (lowerleftpt.x - lowerrigghtpt.x) * (p.y - lowerrigghtpt.y);
        float d3 = (upperpt.x - p.x) * (lowerleftpt.y- p.y) - (lowerleftpt.x - p.x) * (upperpt.y - p.y);

        System.out.println(d1 + " " + d2 + " " + d3);

        has_neg = (d1 < 0) || (d2 < 0) || (d3 < 0);
        has_pos = (d1 > 0) || (d2 > 0) || (d3 > 0);

        return !(has_neg && has_pos);
    }

    public boolean isOutside(Point p) {

        return !isInside(p);
    }

    public String toString() {

        return "Triangle@{(" + upperpt.x + "," + upperpt.y + ");(" + lowerleftpt.x + "," + lowerleftpt.y + ");(" + lowerrigghtpt.x + "," + lowerrigghtpt.y + ")}";
    }

    public static void main(String[] args) {

        Point upperpt = new Point(5,10);
        Point lowerleftpt = new Point(0, 0);
        Point lowerrightpt = new Point(10,0);

        Point point = new Point(5,5);

        Triangle triangle = new Triangle(upperpt, lowerleftpt, lowerrightpt);

        System.out.println(triangle.isInside(point));
        System.out.println(triangle.isOutside(point));
    }

}
