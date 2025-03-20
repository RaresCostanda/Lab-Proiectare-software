public class Form {
    private String color;
    public static  int counter=0;
    //private String shape;
    public Form(int color) {
        this.color="white";
    }
    public Form(){
        counter++;
    }
    public Form(String color){
        this.color=color;
        //shape= shape;
    }

    public float getArea(){
        return 0;
    }
   @Override
    public String toString(){
        color=color;
        System.out.println("This form has the color "+color);
        return "This form has the color "+color;
    }
    public static int getCounter(){
        return counter;
    }

}
