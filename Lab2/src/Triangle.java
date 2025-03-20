public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        height = height;
        base = base;

    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;

    }

    public float getArea() {
        return (height * base) / 2;

    }

    @Override
    public String toString() {
        return super.toString() + ", Triangle with base " + base + " and height " + height;
    }

    /*public boolean equals(Triangle triangle){
        if(this==triangle){
            return true;
        }
        else {
            return false;
        }

    }
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.height, height) == 0 && Float.compare(triangle.base, base) == 0;
    }
}
