package JavaSimple;

class LongFunction
{
	long num1=1234484578;
	long num2=1276792981;
	long res;
	void long_method()
	{
		res=num1+num2;
		System.out.println(res);
	}
	
}
public class MainLong {

	public static void main(String[] args) {
		LongFunction lobj = new LongFunction();
		lobj.long_method();
	}

}
