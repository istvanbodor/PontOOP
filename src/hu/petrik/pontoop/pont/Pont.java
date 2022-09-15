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

    public double getOrigotolMertTavolsag(){

        return  Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));


    }
    public double ketPontTav(Pont a)
    {
        int x = this.x - a.x;
        int y = this.y - a.y;

        return  Math.sqrt(Math.pow(x,2) + Math.pow(y,2));


    }


    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
