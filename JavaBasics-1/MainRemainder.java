package JavaSimple;

class RemFunction
{
	int firstnumber,secondnumber,rem;
	void rem_method()
	{
		firstnumber=12;
		secondnumber=3;
		rem=firstnumber%secondnumber;
		System.out.println("Remainder of two numbers is "+rem);
	}
}
public class MainRemainder {

	public static void main(String[] args) {
		RemFunction obj=new RemFunction();
		obj.rem_method();

	}

}
