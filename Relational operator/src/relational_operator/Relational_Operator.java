package relational_operator;

public class Relational_Operator 
{

	public static void main(String[] args) 
	{
		int num1 = 20, num2 = 20 , num3 = 40;
		
		System.out.println(" 1st number is = " + num1);
		System.out.println(" 2nd number is = " + num2);
		System.out.println(" 3rd number is = " + num3);
		
		// use relational operation between num1 and num2
		
		System.out.println(" Is number1 same as number 2 ? = " + ( num1 == num2));
		//System.out.println(" Is number1 same as number3 ? = " + ( num1 == num3 ));
		//System.out.println(" Is number1 same as number3 ? = " + ( num1 != num3 ));
		System.out.println(" Is number1 greater number3 ? = " + ( num1 <= num2 ));
		
	}
}
