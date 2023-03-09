package JavaSimple;

class DivideFunction
{
	int firstnumber,secondnumber,div;
	void divide_method()
	{
		firstnumber=12;
		secondnumber=3;
		div=firstnumber/secondnumber;
		System.out.println("Division of two numbers is "+div);
	}
}
public class MainDivide {

	public static void main(String[] args) {
		DivideFunction obj = new DivideFunction();
		obj.divide_method();

	}

}
