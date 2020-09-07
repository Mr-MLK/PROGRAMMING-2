package LB4;

public class StackOfString {

	
	private String [] elements ;
	private int size;
	public static final int Def_capacity = 16 ;
	
	public StackOfString() {
		this(Def_capacity);
		
	}

	public StackOfString(int defCapacity) {

	elements = new String [defCapacity];
	
	}
	
	public void push (String value) {
		
		
		if (size >= elements.length) {
			String [] temp = new String [elements.length * 2];
			System.arraycopy( elements , 0 , temp ,0 , elements.length);
			
			elements = temp ;
			
			
		}
		
		elements [size++] = value ;
	}
	
	public String pop () {
		return elements[--size];
	}
	
	public String peek() {
		return elements[size];
	}
	
	public boolean empty () {
		return size ==0 ;
	}
	
	public int getSize () {
		return size;
	}
	
	public void printStack() {
		System.out.println("stack (top to bottom): ");
		for (int i =size -1 ; i>-1 ; i--)
			System.out.println (elements[i] + " ");
		System.out.println();
	}
	
	
	
	
	
}
