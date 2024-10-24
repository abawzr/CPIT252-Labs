package bridgepatterndemo1;

public class Rectangle implements Shape {

    @Override
    public void area() {
        System.out.println("The area of Rectangle is: " + 3 * 3 + "\n");
    }

    @Override
    public void volume() {
        System.out.println("The Volume of Rectangle is: " + 3 * 3 * 3 + "\n");
    }
}
