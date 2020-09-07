package LB9;
import java.math.*;
public class TestBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger i1 =new BigInteger("1234");
		BigInteger i2 =new BigInteger("1234");
		
		if(i1.compareTo(i2)==0)
		System.out.println("equal");
		else
			if(i1.compareTo(i2)>0)
		System.out.println(i1+" is greater than "+i2);
			else 
				System.out.println(i1+" is less than "+i2);
		
		
	}

}
