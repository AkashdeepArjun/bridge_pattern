package home;

public class Triangle extends Shape{

    public Triangle(Color c){
            super(c);
    }
    
    @Override
    void applyColor() {
        
        MyUtils.log("TRIANGLE SHAPE  ", "applying color...");
        color.applyColor();
    }
}
