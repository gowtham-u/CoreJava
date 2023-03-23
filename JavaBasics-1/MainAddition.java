package JavaSimple;

class Addition
{
	int num1,num2,add;
	void add_method()
	{
		num1=10;
		num2=55;
		add=num1+num2;
		System.out.println("Addition = "+add);
		System.out.println(add);
		System.out.println("the addition of "+num1 +" and " +num2 +" are " +add);
	}
}
public class MainAddition {
	public static void main(String[] args) {
		Addition addobj=new Addition();
		addobj.add_method();
	}
}
