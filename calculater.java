import java.util.*;
class calculater
{
	public static void main(String args[])
	{
		double a,b,c;
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("*********************");
			System.out.println("  SIMPLE CALCULATER  ");
			System.out.println("*********************");
			System.out.println(" ________________________________________________");
			System.out.println("|Note: First enter a number then enter arithmetic|");
			System.out.println("|operator and enter secound number               |");
			System.out.println("|________________________________________________|");
			a=(double)scanner.nextDouble();
	        char operator = scanner.next().charAt(0);
			b=(double)scanner.nextDouble();
			switch(operator)
			{
			case '+' :
                 c=a+b;
                 break;
            case '-' :
            	c=a-b;
            	break;
            case '*' :
            	c=a*b;
            	break;
            case '/' :
            	c=a/b;
            	break;
            default :
            	System.out.println("Error ! operation ia not correct");
            	return;
			}
			System.out.println("------");
			System.out.println(c);

		}
	}
}
