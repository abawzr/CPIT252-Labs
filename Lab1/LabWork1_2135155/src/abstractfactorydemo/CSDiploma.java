package abstractfactorydemo;

public class CSDiploma extends Diploma {

    public CSDiploma() {
        duration = 3;
        fee = 8000;
    }

    @Override
    public void compute() {
        System.out.println("The CS Diploma fee is: " + duration * fee + " SAR \n");
    }
}
