package automation68;
import java.util.Scanner;

public class Mathop {
	void circumtriangle()
	{
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		int a=s.nextInt();
		int c=s.nextInt();
		System.out.println("circumference oftriangle " +(a+b+c));
		//s.close();
	}
	void areatriangle()
	{
		Scanner s=new Scanner(System.in);
		double b=s.nextDouble();
		double h=s.nextDouble();
		System.out.println("area of triangle" +(0.5*(b*h)));
	//	s.close();
	}
	void arearec()
	{
		Scanner s=new Scanner(System.in);
		int length=s.nextInt();
		int breadth=s.nextInt();
		System.out.println("area of rectangle"+(length*breadth));
		//s.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathop m=new Mathop();
		m.circumtriangle();
		m.areatriangle();
		m.arearec();
		
		
	
		

	}

}
