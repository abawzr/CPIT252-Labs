package labwork2_2135155;

public abstract class ProgDecorator implements Program {

    private Program newProgram;

    public ProgDecorator(Program newProgram) {
        this.newProgram = newProgram;
    }

    @Override
    public String prepareProg() {
        return newProgram.prepareProg();
    }

    @Override
    public double progPrice() {
        return newProgram.progPrice();
    }

}
