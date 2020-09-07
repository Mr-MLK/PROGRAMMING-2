package LB8;

public class TestLAB8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rec1 =new Rectangle(15 , 30);
		
		Circle cir1 = new Circle(2.2);
		
		System.out.println("the area of the rectangle is  : "+rec1.getArea() + " for the perimeter "+rec1.getPerimeter());
		
		System.out.println("the area of the circle is  : "+cir1.getArea() + " for the perimeter "+cir1.getPerimeter());
	}

}
