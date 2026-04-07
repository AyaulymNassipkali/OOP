package problem1;

public class Cube extends Shape3D{
    public double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double volume(){
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea(){
        return 6 * Math.pow(side, 2);
    }
}
