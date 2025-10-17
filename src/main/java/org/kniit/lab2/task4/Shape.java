import java.lang.Math;

public abstract class Shape {
    public abstract double getVolume();
}

class Sphere extends Shape {
    private double sphereRadius;

    public Sphere(double sphereRadius) {
        this.sphereRadius = sphereRadius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);
    }

    @Override
    public String toString() {
        return String.format("Сфера (радиус = %.4f, объем = %.4f)", sphereRadius, getVolume());
    }
}

class Cube extends Shape {
    public double cubeDimension;

    public Cube(double cubeDimension) {
        this.cubeDimension = cubeDimension;
    }

    @Override
    public double getVolume() {
        return cubeDimension * cubeDimension * cubeDimension;
    }

    @Override
    public String toString() {
        return String.format("Куб (сторона = %.4f, объем = %.4f)", cubeDimension, getVolume());
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
        return String.format("Цилиндр (радиус = %.4f, сторона = %.4f, объем = %.4f)", foundationRadius, height, getVolume());
    }
}
