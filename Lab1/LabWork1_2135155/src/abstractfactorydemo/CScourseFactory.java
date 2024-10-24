package abstractfactorydemo;

public class CScourseFactory implements AbstractFactory {

    @Override
    public Degree calculateTotalFee() {
        return new CSDegree();
    }

    @Override
    public Diploma calculatetotalFee() {
        return new CSDiploma();
    }

}
