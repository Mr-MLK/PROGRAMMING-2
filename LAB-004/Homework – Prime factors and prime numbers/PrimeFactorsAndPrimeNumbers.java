package LB4;
import java.util.Scanner;
public class PrimeFactorsAndPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
        
        StackOfIntegers stack = new StackOfIntegers();

        System.out.print("Please enter a positive integer: ");
        	int userVal = in.nextInt();

        	if (isPrime(userVal)){
            System.out.printf("%d is a prime number.", userVal);
        } 
    	else {
            getFactors(userVal, stack);
        }

        int size = stack.getSize();
        System.out.printf("The smallest prime factors of %d is ", userVal);
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", stack.pop());
        }
        System.out.println("");
        printAllPrime(  userVal,   stack);
    }

    public static void getFactors(int value, StackOfIntegers stck) {
        int[] values = new int[100];
        values[0] = value;
        int valCount = 1;
       for (int  PrimeV : values) {
            if (isPrime(PrimeV)) {
                stck.push(PrimeV);
                break;} 
            
           for (int i = 2; i < PrimeV; i++) {
                if (PrimeV % i == 0) {
                    stck.push(i);
                    values[valCount] = PrimeV / i;
                    break;
                }
            }
            valCount++;
        }
    }
   public static boolean isPrime(int value) {
        if (value == 1 || value == 2) {
            return true;
        } else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0)
                    return false;
            }
        }
        return true;
    }
   
   public static void printAllPrime(int value, StackOfIntegers stck)
   { 
       for(int i=2 ; i< value;i++)
               if(isPrime(i))stck.push(i);
      int size = stck.getSize();
        
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", stck.pop());
        }
   
   }

	}


