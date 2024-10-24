package abstractfactorydemo;

public class ISDegree extends Degree {

    public ISDegree() {
        duration = 4;
        fee = 4500;
    }

    @Override
    public void compute() {
        System.out.println("The IS Degree fee is: " + duration * fee + " SAR \n");
    }
}
