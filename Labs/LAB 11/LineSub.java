public class LineSub extends Point {
    // A line needs two points: begin and end
    // The begin point is inherited from its superclass Point
    // Private variables
    Point end; // Ending point
    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {

        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }

    public LineSub (Point begin, Point end) { // caller to construct the Points

        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    public String toString() {


        return "Begin: " + super.toString() + " End: " +this.end.toString();
    }
    public Point getBegin() { 

      return new Point(super.getX(), super.getY());

    }
    public Point getEnd() {

        return this.end;
    }
    public void setBegin(Point begin) { 
        
        int x = begin.getX();
        int y = begin.getY();
        super.setXY(x,y);
    }
    public void setEnd(int x, int y) {  

        this.end.setXY(x, y);
    }
    public int getBeginX() {

        return super.getX();
    }
    public int getBeginY() {

        return super.getY();
    }
    public int getEndX() { 

        return this.end.getX();
    }


    public int getEndY() {  

        return this.end.getY();
    }
    public void setBeginX(int x) {  

         super.setX(x);
    }
    public void setBeginY(int y) { 

        super.setY(y);
    }
    public void setBeginXY(int x, int y) { 

        super.setXY(x, y);
    }
    public void setEndX(int x) { 

        this.end.setX(x);
     }
    public void setEndY(int y) { 
        this.end.setY(y);
    }
    public void setEndXY(int x, int y) {

        this.end.setXY(x, y);
    }
    
    public int getLengthSub() {

        Double xDiffSquare = Math.pow(this.end.getX() - super.getX(),2);
        Double yDiffSquare = Math.pow(this.end.getY() - super.getY(),2);
        return (int)(Math.sqrt(xDiffSquare + yDiffSquare));
    } // Length of the line
    public double getGradientSub() { 

        int xDiff = this.end.getX() - super.getX();
        int yDiff = this.end.getY() - super.getY();

        return Math.atan2(yDiff,xDiff);

    } // Gradient in radians
    
}