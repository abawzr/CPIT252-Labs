package labwork2_2135155;

public class ISDegree extends ProgDecorator {

    public ISDegree(Program newProgram) {
        super(newProgram);
    }

    @Override
    public String prepareProg() {
        return super.prepareProg() + " with IS Degree Fee in SAR is: ";
    }

    @Override
    public double progPrice() {
        return super.progPrice() + 18000.0;
    }
}
