package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public Pont (int n) {
        this.x = koordianataGeneralasa(n);
        this.y =koordianataGeneralasa(n);



    }

    private int koordianataGeneralasa(int n) {
        return (int)(Math.random() *((2*n)+1) ) -n;
    }


    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
