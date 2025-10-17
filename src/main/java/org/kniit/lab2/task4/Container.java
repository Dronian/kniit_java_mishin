public class Container {
    private double remainingVolume;

    public Container(double volume) {
        this.remainingVolume = volume;
    }

    public String getRemainingVolume() {
        return String.format("Оставшийся объем: %.4f", remainingVolume);
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
