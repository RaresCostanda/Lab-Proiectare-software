public class Circle extends Form{
    private float radius;

    public Circle(){
        radius=radius;

    }

    public Circle(float radius, String color){
        super(color);
        this.radius=radius;

    }
    public float getArea(){
        float pi=3;
        return (pi*radius*radius);
    }
    @Override
    public String toString(){
        return super.toString() + ", Circle with radius " + radius ;
    }
}
