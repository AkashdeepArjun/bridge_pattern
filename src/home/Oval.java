package home;

public class Oval extends Shape {
    
    public Oval(Color c){
        super(c);
}

@Override
void applyColor() {
    
    MyUtils.log("OVAL SHAPE  ", "applying color...");
    color.applyColor();
}
}
