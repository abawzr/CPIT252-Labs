package abstractfactorydemo;

public class ITcourseFactory implements AbstractFactory {

    @Override
    public Degree calculateTotalFee() {
        return new ITDegree();
    }

    @Override
    public Diploma calculatetotalFee() {
        return new ITDiploma();
    }

}
