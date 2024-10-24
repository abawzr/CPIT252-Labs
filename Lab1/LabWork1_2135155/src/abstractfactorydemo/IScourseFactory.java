package abstractfactorydemo;

public class IScourseFactory implements AbstractFactory {

    @Override
    public Degree calculateTotalFee() {
        return new ISDegree();
    }

    @Override
    public Diploma calculatetotalFee() {
        return new ISDiploma();
    }

}
