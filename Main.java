 import java.util.Scanner;
class Test
{
	int a;
	int number1,number2;
	void input()
	{
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division");
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		System.out.println("Enter two number for the operation");
		number1=n.nextInt();
		number2=n.nextInt();
	}
	void printerror()
	{
		System.out.println("Invalid Input");
	}

	
	
	
}
public class Main {

	public static void main(String[] args) {
		Inherit Object = new Inherit();
		Object.input();
		if(Object.a==1)
		{
			Object.add(Object.number1,Object.number2);
		}
		else if(Object.a==2)
		{
			Object.subtraction(Object.number1,Object.number2);
		}
		else if(Object.a==3)
		{
			Object.multiplication(Object.number1, Object.number2);
		}
		else if(Object.a==4)
		{
			Object.division(Object.number1, Object.number2);
			
		}
		else
		{
			Object.printerror();
		}

	}

}
