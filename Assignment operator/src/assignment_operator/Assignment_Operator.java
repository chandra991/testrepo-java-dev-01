package assignment_operator;

public class Assignment_Operator 
{

	public static void main(String[] args) 
	{
		int a = 40 , b = 20;
		
		System.out.println(" 1st number = " + a);
		System.out.println(" 2nd number = " + b);
		
		// use compound addition assignment operator : a += b
		
		a += b; //a = a + b
		
		System.out.println(" value is = " + a);
		
		// use compund substraction assignment operator : a -= b
		
		a -= b; //a = a-b
		
		System.out.println(" value for sustraction is = " + a);
		
		// use compound multiplication operator : a *= b
		
		a *= b ; // a = a*b
		
		System.out.println(" value of multiplication is " + a);

	}

}
