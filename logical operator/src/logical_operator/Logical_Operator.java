package logical_operator;

public class Logical_Operator 
{

	public static void main(String[] args)
	{
		
		int a = 80, b = 40, c = 60, d=0; 
		
		if ((a<b) || (b==c)) 
		{
			
			d = a -b + c;
			System.out.println(" The ultimate number is = " + d);
		}
		
		else
			System.out.println("False statement");

	}

}
