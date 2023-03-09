package JavaSimple;

class totalFunction
{
	int registration=5000,softskills=1000,apptitude=1000,placement=10000,total;
	void total_method()
	{
			total=registration+softskills+apptitude+placement;
			System.out.println("Total Course Fee is "+total);
		}
}
public class MainCourse {

	public static void main(String[] args) {
		totalFunction cfobj=new totalFunction();
		cfobj.total_method();

	}

}
