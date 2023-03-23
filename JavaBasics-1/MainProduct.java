package JavaSimple;

class ProductFunction
{
	int firstnumber,secondnumber,multiply;
	void product_method()
	{
		firstnumber=12;
		secondnumber=3;
		multiply=firstnumber*secondnumber;
		System.out.println("Product of two numbers is "+multiply);
	}
}
public class MainProduct {

	public static void main(String[] args) {
		ProductFunction obj=new ProductFunction();
		obj.product_method();

	}

}
