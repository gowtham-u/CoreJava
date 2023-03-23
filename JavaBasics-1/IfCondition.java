package JavaSimple;

class Compare
{
	short low=100,high=250;
	void compare_method()
	{
		if(low<high)
		{
			System.out.println("first number is lesser than second number");
		}
	}
}
public class IfCondition {

	public static void main(String[] args) {
		Compare compare=new Compare();
		compare.compare_method();

	}

}
