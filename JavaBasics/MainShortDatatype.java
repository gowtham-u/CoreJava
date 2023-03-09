package JavaSimple;

class ShortFunction
{
	short num1=12344;
	short num2=32767;
	int res;
	void short_method()
	{
		res=num1+num2;
		System.out.println(res);
	}
	
}
public class MainShortDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortFunction sobj=new ShortFunction();
		sobj.short_method();
	}

}
