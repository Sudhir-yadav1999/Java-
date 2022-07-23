package java_revision;

class A 
{
	int a=10;
	int b=20;
	
	void method()
	{
		System.out.println(a-b);
		//Increment Operators
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10 
		//Combine addition program
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21
		//Operator
		int a1=10;  
		int b1=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a1);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b1);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true
		
	}
	
}


public class basics {

	public static void main(String[] args) {
		
		A h1=new A();
		h1.method();

	}

}
