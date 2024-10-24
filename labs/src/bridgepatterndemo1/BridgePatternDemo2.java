package bridgepatterndemo1;

public class BridgePatternDemo2 {

    public static void main(String[] args) {

        Shape Obj1 = new Circle();
        Obj1.area();
        Obj1.volume();

        Obj1 = new Rectangle();
        Obj1.area();
        Obj1.volume();

        Obj1 = new Sphere();
        Obj1.area();
        Obj1.volume();

    }
}
