package automation68;

import java.util.Scanner;

public class Areacircumcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int radius=s.nextInt();
		float pi=s.nextFloat();
		float areacircle= pi*radius*radius;
		System.out.println("area of circle is"  +areacircle);
		float circumcircle=2*pi*radius;
		System.out.println("circumference of circle is" +circumcircle);
		s.close();
		

	}

}
