package home;

public class Test {

    public static void main(String[] args){

        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape oval= new Oval(new GreenColor());
        oval.applyColor();

    }
    
    
}
