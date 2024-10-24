package labwork2_2135155;

public class CSDegree extends ProgDecorator {

    public CSDegree(Program newProgram) {
        super(newProgram);
    }

    @Override
    public String prepareProg() {
        return super.prepareProg() + " with CS Degree Fee in SAR is: ";
    }

    @Override
    public double progPrice() {
        return super.progPrice() + 16500.0;
    }
}
