package Homework-Fan-class;

public class TEST {
boolean x = true;
	public static void main(String[] args) {
		
		TEST s =new TEST();
		
		Fan F1 = new Fan();
		Fan F2 = new Fan();
		
		F1.setColor("blue");
		F1.setON(true);
		F1.setRadius(5);
		F1.setSPEED(2);
		
		F2.setColor("red");
		F2.setON(false);
		F2.setRadius(4);
		F2.setSPEED(0);
		
		System.out.println("the description of Fan nomber 1: " + F1.tostring() + 
							"\n the description of Fan nomber 2:  " + F2.tostring());
		
		System.out.println(F1.SLOW);
	}

}
