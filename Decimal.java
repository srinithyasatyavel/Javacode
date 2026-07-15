package automation68;

public class Decimal extends Add{

	void decimaladd()
	{
		float a=(float) 10.22, b=15.55f;
		System.out.println("decimal addition is" +(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decimal d=new Decimal();
		d.add();
		d.decimaladd();

	}

}
