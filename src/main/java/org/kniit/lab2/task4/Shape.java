import java.lang.Math;

public abstract class Shape {
    public abstract double getVolume();

    @Override
    public String toString() {
        return "Фигура";
    }
}

class Sphere extends Shape {
    private double sphereRadius;

    public Sphere(double sphereRadius) {
        this.sphereRadius = sphereRadius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(sphereRadius, 3);
    }

    @Override
    public String toString() {
        return String.format("Сфера [радиус=%.2f]", sphereRadius);
    }
}

class Cube extends Shape {
    public double cubeDimension;

    public Cube(double cubeDimension) {
        this.cubeDimension = cubeDimension;
    }

    @Override
    public double getVolume() {
        return Math.pow(cubeDimension, 3);
    }

    @Override
    public String toString() {
        return String.format("Куб [сторона=%.2f]", cubeDimension);
    }
}

class Cylinder extends Shape {
    public double foundationRadius;
    public double height;

    public Cylinder(double foundationRadius, double height) {
        this.foundationRadius = foundationRadius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(foundationRadius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Цилиндр [радиус=%.2f, сторона=%.2f]", foundationRadius, height);
    }
}
