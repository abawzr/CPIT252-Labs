package adapterpatterndemo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateAdapt extends PayCalculator implements ICalculate {

    public void calHourly() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the Employee Name: ");
            String eName = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the Rate per Hour: ");
            int rate = Integer.parseInt(br.readLine());
            System.out.print("\n");
            System.out.print("Enter the number of hours: ");
            int hourly = Integer.parseInt(br.readLine());
            setCalc(rate, hourly);
            System.out.print("\n");
            setEmpName(eName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String show() {

        String eName = getEmpName();
        return ("The Employee name is:" + eName + "\n");
    }
}
