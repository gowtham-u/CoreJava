package JavaSimple;

class BooleanFunction
{
	boolean b1=true;
	boolean b2=false;
	void boo_method()
	{
		int a=15,b=10;
		if(a<=b)
			System.out.println(b1);
		else
			System.out.println(b2);
	}
}
public class MainBoolean {

	public static void main(String[] args) {
		BooleanFunction bolobj= new BooleanFunction();
		bolobj.boo_method();

	}

}