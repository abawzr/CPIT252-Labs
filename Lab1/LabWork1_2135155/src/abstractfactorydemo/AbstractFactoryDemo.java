package abstractfactorydemo;

import java.util.Scanner;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory factory;
        Degree degree;
        Diploma diploma;
        String program = "";
        System.out.println("Enter Program Name to Know Fee: ");
        try (Scanner sc = new Scanner(System.in);) {
            program = sc.next();
        }
        if (program.equalsIgnoreCase("IT")) {
            factory = new ITcourseFactory();
            degree = factory.calculateTotalFee();
            degree.compute();
            diploma = factory.calculatetotalFee();
            diploma.compute();
        } else if (program.equalsIgnoreCase("CS")) {
            factory = new CScourseFactory();
            degree = factory.calculateTotalFee();
            degree.compute();
            diploma = factory.calculatetotalFee();
            diploma.compute();
        } else {
            System.out.println("Not supported");
        }
    }
}
