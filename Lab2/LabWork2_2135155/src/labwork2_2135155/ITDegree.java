package labwork2_2135155;

public class ITDegree extends ProgDecorator {

    public ITDegree(Program newProgram) {
        super(newProgram);
    }

    @Override
    public String prepareProg() {
        return super.prepareProg() + " with IT Degree Fee in SAR is : ";
    }

    @Override
    public double progPrice() {
        return super.progPrice() + 15000.00;
    }
}
