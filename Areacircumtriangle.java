package automation68;

import java.util.Scanner;

public class Areacircumtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int l,b;
Scanner s=new Scanner(System.in);
l=s.nextInt();
b=s.nextInt();
float arearec=l*b;
float circumrec=2 *(l+b);
System.out.println("area of rectangle is" +arearec);
System.out.println("circumference of rectangle is" +circumrec);


	}

}
