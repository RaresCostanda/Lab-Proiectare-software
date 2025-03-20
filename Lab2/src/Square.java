public class Square extends  Form{
    private float side;

    public Square(){
        side=side;

    }
    public Square(float side, String color){
        super(color);
        this.side=side;

    }
    public float getArea(){
        return side * side;
    }
    @Override
    public String toString(){
        return super.toString() + ", Square with side " + side;
    }
}
