package varibles;

public class NonStaticVariable 
  { 
	 int a= 20;    /////non static global variable
	 
	public static void main(String[] args)
	{
		NonStaticVariable obj = new NonStaticVariable();
	    System.out.println("output is :" +obj.a);
		
	    NonStaticVariable obj2 = new NonStaticVariable();
	    obj2.m2();
  	
	    m3();
		 }
	
     public void m2() 
     {
    	int b= 30;    //////declared in any method
    	 System.out.println("output:" +b);
     }
     
     public static void m3 ()
      {
    	
    	 int z = 90;
    	  System.out.println("result :" +z);
     }
     
   
  }
     






