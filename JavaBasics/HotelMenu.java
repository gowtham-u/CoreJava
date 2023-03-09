package JavaSimple;

class HotelFunction
{
	int idly=10,vada=10,pongal=50,dosa=20;
	void hotel_method()
	{
		System.out.println("Idly   Rs "+idly);
		System.out.println("Vada   Rs "+vada);
		System.out.println("Pongal Rs "+pongal);
		System.out.println("Dosa   Rs "+dosa);
	}
}
public class HotelMenu {

	public static void main(String[] args) {
		HotelFunction hotel=new HotelFunction();
		hotel.hotel_method();

	}

}
