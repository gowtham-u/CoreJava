package JavaSimple;

class EqualNumber
{
	byte num1=1,num2=1;
	void equal_method()
	{
		if(num1==num2)
		{
			System.out.println("The Given Numbers are Equal");
		}
	}
}
public class EqualityCheck {

	public static void main(String[] args) {
		EqualNumber eobj=new EqualNumber();
		eobj.equal_method();
	}
}
