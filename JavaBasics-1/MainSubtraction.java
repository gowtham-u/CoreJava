package JavaSimple;

class Subtraction
{
	float num1,num2,result;
	void sub_method()
	{
		num1=4567.34f;
		num2=2344.56f;
		result=num1-num2;
		System.out.println("Subtraction = "+result);
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println("the Subtraction of "+num1 +" and " +num2 +"  are " +result);
	}  
}
public class MainSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Subtraction subobj = new Subtraction();
		subobj.sub_method();
	}

}
