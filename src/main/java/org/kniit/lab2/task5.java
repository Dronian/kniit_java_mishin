import java.util.ArrayList;
import java.util.List;


interface FileSystemComponent {
    String getName();
    int getSize();

    default void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Не поддерживается для этого типа компонента.");
    }

    default void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Не поддерживается для этого типа компонента.");
    }

    void display(String indent);
}

class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display(String indent) {
        System.out.printf("%s%s (%d bytes)\n", indent, name, size);
    }
}

class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "  ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 300);

        FileSystemComponent folder1 = new Folder("Folder1");
        FileSystemComponent folder2 = new Folder("Folder2");

        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);
        folder2.add(folder1);

        folder2.display("");

        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");

    }
}
