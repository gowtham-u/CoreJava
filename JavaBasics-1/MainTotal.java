package JavaSimple;

class TotalFunction
{
	int eng=45,tam=56,hin=64,mat=46,phy=54,che=35,total;
	void Total_method()
	{
			total=(eng+tam+hin+mat+phy+che);
			System.out.println("Total Marks is "+total);
		}
}
public class MainTotal {

	public static void main(String[] args) {
		TotalFunction tobj=new TotalFunction();
		tobj.Total_method();

	}

}
