import java.util.Scanner;
import java.util.Arrays;


public class HW1 {
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		System.out.println("Enter the size of the first arrray ");
		
		int size = reader.nextInt();
		int [] firstarray = new int [size];
		
		Fillarray(firstarray);   // ������� ������ ������� 
		
		
		System.out.println(" Enter the size of the second array");
		
		size = reader.nextInt();
		int [] secondarray = new int [size];
		
		Fillarray(secondarray);
		
		
		checkIfIdentical( firstarray , secondarray);
		
	}

public static void Fillarray (int [] array )   //  ����� ������ �������� ���� ������ �������� 
		{	
			for ( int i=0 ; i < array.length ; i++)
			{
				int number = 0 ;
				
				System.out.println("Enter the number  " + (i+1) );    // (i+1) ���� ���� �������� ���� ���� ���� ���� �� ����� 
				number = reader.nextInt();
				
			}
		}
	
public static void checkIfIdentical  ( int [] array1 , int  []array2 )		// ����� ������ �� ���������� ������� �� ��	
		{
			if ( array1.length == array2.length)
			{
				
				if (Arrays.equals( array1 , array2))
				{
					System.out.println("the two arrays are identical arrays ");
				}
				else {
					
					System.out.println("the two arrays are not identical arrays ");
				}
			}
			

			
			else 
			
			{
				System.out.println("The two arrays are not equals");
			}
				
			}
		
		}








	
	

