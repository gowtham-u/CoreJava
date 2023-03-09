package JavaSimple;

class Swaping
{
	int num1,num2;
	void swap_method() 
	{
		
	num1=256;
	num2=512;
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("num1 is "+num1);
	System.out.println("num2 is "+num2);
	}
}

public class SwapNumber {

	public static void main(String[] args) {
		Swaping swapobj=new Swaping();
		swapobj.swap_method();

	}
}

