package JavaSimple;

class StringName
{
	String Name = "Gowtham";
	void string_method()
	{
		System.out.println("My Name "+Name);
	}
}
public class MainString {

	public static void main(String[] args) {
		StringName sobj=new StringName();
		sobj.string_method();
	}

}
