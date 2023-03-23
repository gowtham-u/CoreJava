package JavaSimple;

class HelloWorld
{
	void display_hello()
	{
		System.out.println("HelloWorld");
		System.out.println();
		System.out.println("Welcome to Java Class");
	}
}
public class MainHelloWorld {

	public static void main(String[] args) {
		HelloWorld obj=new HelloWorld();
		obj.display_hello();

	}

}
