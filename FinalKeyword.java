package basicOOPs;
class Main
{
	final int a;
	Main(int x)
	{
		a=x; 
	}
}
class FinalKeyword 
{
	
	public static void main(String args[])
	{
		
	Main m=new Main(10);
	Main m2=new Main(15);
	
	System.out.println("This is final class"+m.a);
	System.out.println("This is final class"+m2.a);
	
	}

}