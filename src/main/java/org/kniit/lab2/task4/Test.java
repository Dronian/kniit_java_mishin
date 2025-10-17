public class Test {
    public static void main(String[] args) {
        Container container = new Container(1000);
        
        Shape sphere = new Sphere(5);
        Shape cube = new Cube(3);  
        Shape cylinder = new Cylinder(2, 4);
        
        System.out.println(container.add(sphere));
        System.out.println(container.add(cube));
        System.out.println(container.add(cylinder));
        
        System.out.println("Оставшийся объем: " + container.getRemainingVolume());
    }
}
