public class Circle extends Form{
        
    private int radius = 0;
    private Point circP;

    public Circle(int r, int a, int b){

        this.radius = r;
        circP = new Point(a ,b);
    }

    public void setRadius(int r){

        this.radius = r;
    }

    public int getRadius(){

        return this.radius;
    }

    public Point getPoint(){

        return this.circP;
    }

    public String toString(){

        String s = "Circle Radius: " + String.valueOf(this.radius);

        return s;
    }
    public Double computeArea(){

        return (Math.pow(this.radius,2))*Math.PI;
    }
    public Double computeVolume(){

        return 0.0;
    }
}