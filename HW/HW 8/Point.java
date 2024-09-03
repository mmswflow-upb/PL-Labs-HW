public class Point extends Form{

    private int x = 0, y = 0;

    public Point(int xC, int yC){

        this.x = xC;
        this.y = yC;
    }

    public int getX()
    {
        return this.x;
    }
    public int getY(){

        return this.y;
    }

    public void setPoint(int xC, int yC){

        this.x = xC;
        this.y = yC;
    }
    public String toString(){

        String s = "X: " + String.valueOf(this.x) + " Y: " + String.valueOf(this.y);
        return s;
    }
    public Double computeArea(){

        return 0.0;
    }
    public Double computeVolume(){

        return 0.0;
    }
}
