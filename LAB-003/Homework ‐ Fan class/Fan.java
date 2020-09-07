package HW1;

public class Fan {
	
	final int SLOW =0; 
	final int MEDIUM =1;
	final int FAST =2;
	
	private int SPEED = SLOW ; 
	private boolean ON = false ;
	private double radius = 4;
	
	String color = "red";
	
	public Fan(){
		
	}
	
	public int getSPEED() {
			return SPEED;
		}
		public void setSPEED(int speed) {
			SPEED = speed;
		}
		public boolean isON() {
			return ON;
		}
		public void setON(boolean on) {
			ON = on;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		
		public String tostring(){
	        
	        if (ON == false){
	            return "\n color: "+ color +"\n radius: "+ radius +"\n The Fan is off ";
	        }
	        
	        else{
	            return "\n speed: "+ SPEED +"\n color: "+ color +"\n radius: " +radius ;
			
			
		}
	
		}
	
	
	

}
