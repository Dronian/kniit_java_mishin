package Java_Projects;

public class Main {
    public static void main(String[] args) {
        SimpleURL initialUrl = new SimpleURL("https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText");

        System.out.print(initialUrl.toString());
    }
}
