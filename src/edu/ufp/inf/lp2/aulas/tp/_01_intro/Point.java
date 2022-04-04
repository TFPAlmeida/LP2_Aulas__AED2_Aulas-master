package edu.ufp.inf.lp2.aulas.tp._01_intro;

public class Point {

    public float x;
    public float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float dist(Point p){
        //duas formas de fazer a mesma coisa
        //perguntar ao professor o porquê de usar this para chamar funções da própria classe
        float dx = this.distX(p);
        //float dx = p.distX(this);
        float dy = this.distY(p);
        //float dy = p.distY(this);

        return (float)Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }

    public float distX(Point p){
        return this.x - p.x;
    }

    public float distY(Point p){
        return this.y - p.y;
    }

    public void moveX(float dx){
        this.x += dx;
    }

    public void moveY(float dy){
        this.y += dy;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
}
