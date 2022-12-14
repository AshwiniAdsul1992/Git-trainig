package varibles;

public class StaticVariable 
   {
	 static int z = 10; ///static global is declared n initialized within the class and outside method
	 static boolean a;
	 static float q = 12.9f;
	 
	 
	public static void main (String[] arg)
	{
		System.out.println(z);
		z= 70;
		System.out.println(z);
		System.out.println(a);
		System.out.println(q);
		m1();
		
	}

     public static void  m1()
     {
    	// int a = 20;     ///////we cann't declared any variable inside any method
    	 
    	 System.out.println("hello");
     }

}

