package main;

public class Koord {

    private int x;
    private int y;

    public Koord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double tavOrigotol() {
        return Math.sqrt((x * x) + (y * y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String allapot() {
        return "x: " + x + " y: " + y;
    }
}


