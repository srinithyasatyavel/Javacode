package automation68;

public class Overloadcons {

	Overloadcons()
	{
		System.out.println("hi");
	}
	Overloadcons(int a)
	{
		System.out.println("planb" + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadcons c=new Overloadcons();
		Overloadcons b=new Overloadcons(10);

	}

}
