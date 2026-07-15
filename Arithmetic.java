package automation68;

public class Arithmetic {
public static void add()
{ int a=2,b=2;
	System.out.println("add me" + a+b);
}
public void sub()
{
	int c=2, d=1;
	System.out.println("minus me" + (c-d));
}

public static void mul()
{
	int a=2,b=4;
	System.out.println("product me" + a*b);
}
void divide()
{
	int c=3, d=1;
	System.out.println("divide me" + c/d);
}
static void mod()
{
	int d=4, c=2;
	System.out.println("mod is" + d%c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic call=new Arithmetic();
		add();
		call.sub();
		mul();
		call.divide();
		mod();
		

	}

}
