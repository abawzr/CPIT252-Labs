package labwork2_2135155;

import java.io.*;

public class DecoratorPatternDemo {

    private static int choice;

    public static void main(String[] args) throws NumberFormatException, IOException {
        do {
            System.out.print("========= Select the number to know the program's fee======= \n");
            System.out.print("            1. IT Diploma.   \n");
            System.out.print("            2. IT Degree.\n");
            System.out.print("            3. CS Degree.         \n");
            System.out.print("            4. IS Degree.                        \n");
            System.out.print("            5. Exit                        \n");
            System.out.print("Enter your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1: {
                    ITDiploma vf = new ITDiploma();
                    System.out.println(vf.prepareProg());
                    System.out.println(vf.progPrice());
                }
                break;
                case 2: {
                    Program f1 = new ITDegree((Program) new ITDiploma());
                    System.out.println(f1.prepareProg());
                    System.out.println(f1.progPrice());
                }
                break;
                case 3: {
                    Program f2 = new CSDegree((Program) new ITDiploma());
                    System.out.println(f2.prepareProg());
                    System.out.println(f2.progPrice());
                }
                break;
                case 4: {
                    Program f3 = new ISDegree((Program) new ITDiploma());
                    System.out.println(f3.prepareProg());
                    System.out.println(f3.progPrice());
                }
                break;
                default: {
                    System.out.println("Other than these no program available");
                }
                return;
            }
        } while (choice != 5);
    }
}
