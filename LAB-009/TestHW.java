package LB9;

public class TestHW {

    
    public static void main(String[] args) {
        
        GeometricObject S = new Square(8);
        S.setColor("Blue");
        
        System.out.println("\nSquare Perimeter: "+S.getPerimeter()
                +" \nSquare Area: "+S.getArea()
                +" \nSquare Color: "+S.getColor());
        S.howToColor();
        
    }
    
}
