package ro.ulbs.paradigme.lab6.util.probelma2;


public abstract class ACalculator<T extends Number> {
        protected T state;


        public ACalculator(T initialValue) {
            this.state = initialValue;
        }


        public abstract void init(T value);


        public T result() {
            return state;
        }


        public void clear() {
            init((T) (Number) 0);
        }
    }


