package adapterpatterndemo1;

public class PayCalculator {

    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setCalc(int hourly, int rate) {
        System.out.print("The salary is: " + hourly * rate + "\n");
    }
}
