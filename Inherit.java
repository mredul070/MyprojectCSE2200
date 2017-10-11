
class Inherit extends Test
{
	int sum,sub,mul,div;
	void add(int v1,int v2)
	{
		sum=v1+v2;
		System.out.println("The result of operation is "+sum);
	}
	void subtraction(int v1,int v2)
	{
		sub=v1-v2;
		System.out.println("The result of operation is "+sub);
	}
	void multiplication(int v1,int v2)
	{
		mul=v1*v2;
		System.out.println("The result of operation is "+mul);
	}
	void division(int v1,int v2)
	{
		div=v1/v2;
		System.out.println("The result of operation is "+div);
	}
}
