public class Container {
    private double initialVolume;
    private double remainingVolume;

    public Container(double volume) {
        this.initialVolume = volume;
        this.remainingVolume = volume;
    }

    public double getRemainingVolume() {
        return remainingVolume;
    }

    public String add(Shape shape) {
        double shapeVolume = shape.getVolume();

        if (remainingVolume >= shapeVolume) {
            remainingVolume -= shapeVolume;
            return String.format("Фигура \"%s\" добавлена в контейнер", shape);
        }
        else {
            return String.format("Фигура \"%s\" не может быть добавлена в контейнер", shape);
        }
    }
}
