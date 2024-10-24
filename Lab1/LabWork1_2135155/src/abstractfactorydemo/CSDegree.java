package abstractfactorydemo;

public class CSDegree extends Degree {

    public CSDegree() {
        duration = 4;
        fee = 6000;
    }

    @Override
    public void compute() {
        System.out.println("The CS Degree fee is: " + duration * fee + " SAR \n");
    }

}
