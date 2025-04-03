package ro.ulbs.paradigme.lab6.util.probelma2;

public class DoubleCalculator extends ACalculator<Double> {

    @Override
    public void init(Double value){
        this.state=value;
    }
    public DoubleCalculator(Double initialValue) {
        super(initialValue);
    }

    public DoubleCalculator add(Double value) {
        this.state += value;
        return this;
    }
    public DoubleCalculator subtract(Double value) {
        this.state -= value;
        return this;
    }


    public DoubleCalculator multiply(Double value) {
        this.state *= value;
        return this;
    }

}
