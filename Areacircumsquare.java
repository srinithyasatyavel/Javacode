package automation68;

import java.util.Scanner;

public class Areacircumsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		int areaofsq=a*a;
		int circumsq=4*a;
		System.out.println("area of square is " +areaofsq);
		System.out.println("circumference of square is " +circumsq);
		s.close();

	}

}
