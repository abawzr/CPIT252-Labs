package bridgepatterndemo1;

import java.io.*;

public class BridgePatternDemo1 {

    static int choice;

    public static void main(String[] args) throws IOException {

        Shape Obj1 = new Circle();
        Shape Obj2 = new Rectangle();
        Shape Obj3 = new Sphere();
        do {
            System.out.print("========= Shape Area and Volume Options ============ \n");
            System.out.print("            1. Circle.              \n");
            System.out.print("            2. Rectangle.              \n");
            System.out.print("            3. Sphere.                     \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    Obj1.area();
                    Obj1.volume();
                }
                break;
                case 2: {
                    Obj2.area();
                    Obj2.volume();
                }
                break;
                case 3: {
                    Obj3.area();
                    Obj3.volume();
                }
                break;
                default: {
                    System.out.println(" You Select Nothing ");
                }
                return;
            }

        } while (choice != 4);
    }
}
