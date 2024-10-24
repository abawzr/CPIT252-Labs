package bridgepatterndemo1;

public class Circle implements Shape {

    @Override
    public void area() {
        System.out.println("The area of circle is: " + 3.14 * 2 * 2 + "\n");
    }

    @Override
    public void volume() {
        System.out.println("Volume of Circle can Not be calculated." + "\n");
    }
}
