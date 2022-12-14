package varibles;

public class LocalVariable 
 {
	static int d = 40;
	
	public void m1()
	{
		int a = 30;   //////local variable ------>temporary variable 
		System.out.println(a);
	}

	public static void m2()
	{
		int c = 90; ///we can declared in any method within the class
		System.out.println(c);
	}
	
	public static void main (String[] arg)
	{
		m2();
		LocalVariable xyz = new LocalVariable();
		xyz.m1();
		System.out.println(d);
		System.out.println(d);
	}
}
