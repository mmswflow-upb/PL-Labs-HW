public class Cylinder extends Form{

    private int height = 0;
    private Circle cylCirc;

    public Cylinder(int h, int r, int a, int b){

        this.height = h;
        cylCirc = new Circle(r, a ,b);
    }

    public void  setHeight(int h){
      this.height = h;
    }

    public int getHeight(){

        return this.height;
    }

    public Circle getBase(){

        return this.cylCirc;
    }

    public String toString(){

        String s = "Cylinder Height: " + String.valueOf(height) + " Base Radius: " + String.valueOf(cylCirc.getRadius());

        return s;
    }
    public Double computeArea(){

        return 2*(this.cylCirc.computeArea()) + ((2*Math.PI*cylCirc.getRadius())*this.height);
    }
    public Double computeVolume(){

        return (this.height * this.cylCirc.computeArea());
    }
}