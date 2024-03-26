package factory;


class myPointFactory implements PointMaker{

    public static int countpoints;
    public Point makePoint(double x, double y){
        countpoints++;
        return new Point(x, y);
    }

    public int countpoints(){
        return countpoints;
    }

    public static void main(String[] args){

        myPointFactory factory = new myPointFactory();
        Point p1 = factory.makePoint(1, 1);
        Point p2 = factory.makePoint(-1, 1);
        Point p3 = factory.makePoint(-1, -1);
        Point p4 = factory.makePoint(1, -1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }

}


class Point implements GridQuadrant, CompareQuadrant{

    private double x, y;

    public Point(double x, double y){

        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


    public void setX(double x){

        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public Quadrant getQuadrant(){

        if(x > 0 && y > 0){
            return Quadrant.Q1;
        }
        if(x < 0 && y > 0){
            return Quadrant.Q2;
        }
        if(x < 0 && y < 0){
            return Quadrant.Q3;
        }
        if(x > 0 && y < 0){
            return Quadrant.Q4;
        }
        return null;
    }


    public boolean isInSameQuadrant(Point other){

        return this.getQuadrant() == other.getQuadrant();
    }


    public String toString(){

        Quadrant thisquad = getQuadrant();
        String output = "Point(" + x + "," + y + ")" + " is in quadrant " + thisquad;
        return output;
    }


}


enum Quadrant{
    Q1, Q2, Q3, Q4
}


interface GridQuadrant{

    Quadrant getQuadrant();
}

interface CompareQuadrant{

    boolean isInSameQuadrant(Point other);

}


interface PointMaker{

    Point makePoint(double x, double y);
    int countpoints();
}