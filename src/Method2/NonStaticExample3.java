package Method2;

import methods.*;

public class NonStaticExample3 

   {
	 
	public void mobile()
	{
		System.out.println("battery fully charged");
		
	}
	
	public static void main(String[] arg)
	{
		NonStaticExample1  wxy = new NonStaticExample1();
		wxy.m1();
		
		NonStaticExample2 klh = new NonStaticExample2();
		klh.Error1();
		System.out.println("g");
	}
	

}
