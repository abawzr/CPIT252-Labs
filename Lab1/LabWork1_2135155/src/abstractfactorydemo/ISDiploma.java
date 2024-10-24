package abstractfactorydemo;

public class ISDiploma extends Diploma {

    public ISDiploma() {
        duration = 3;
        fee = 6500;
    }

    @Override
    public void compute() {
        System.out.println("The IS Diploma fee is: " + duration * fee + " SAR \n");
    }
}
