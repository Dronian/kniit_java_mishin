public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);

        Shape sphere = new Sphere(5);
        Shape cube = new Cube(4);
        Shape cylinder = new Cylinder(3, 5);

        System.out.println(container.add(sphere));
        System.out.println(container.add(cube));
        System.out.println(container.add(cylinder));

        System.out.println(container.getRemainingVolume() + "\n");

        System.out.println(container.add(sphere));
        System.out.println(container.add(cube));
        System.out.println(container.add(cylinder));

        System.out.println(container.getRemainingVolume() + "\n");

        System.out.println(container.add(cube));
        System.out.println(container.add(cylinder));

        System.out.println(container.getRemainingVolume() + "\n");

        System.out.println(container.add(cube));

        System.out.println(container.getRemainingVolume());
    }
}
