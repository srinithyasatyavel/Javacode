package automation68;

public class Methodoverload {
	void add()
	{ 
		int a=2, b=3;
		System.out.println("hi" +(a+b));
	}
void add(int c, int d)
{
	//int c=4, d=2;
	System.out.println("bye" +(c+d));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverload m=new Methodoverload();
	m.add();
	m.add(4,2);

	}

}
