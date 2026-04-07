package problem1;
//проверка working
public class A1 {
    public static void main(String[] args){
        Shape3D cylinder = new Cylinder(5, 10);
        Shape3D cube = new Cube(3);
        Shape3D sphere = new Sphere(2);

        System.out.println("Volume of cylinder: " + cylinder.volume());
        System.out.println("SurfaceArea of Cube: " + cube.surfaceArea());
        System.out.println("Volume of sphere: " + sphere.volume());
    }
}
