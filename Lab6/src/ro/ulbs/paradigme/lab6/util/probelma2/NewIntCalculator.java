package ro.ulbs.paradigme.lab6.util.probelma2;

public class NewIntCalculator extends ACalculator<Integer> {


    public NewIntCalculator(Integer initialValue) {
        super(initialValue);
    }


    @Override
    public void init(Integer value) {
        this.state = value;
    }


    public NewIntCalculator add(Integer value) {
        this.state += value;
        return this;
    }


    public NewIntCalculator subtract(Integer value) {
        this.state -= value;
        return this;
    }


    public NewIntCalculator multiply(Integer value) {
        this.state *= value;
        return this;
    }
}
