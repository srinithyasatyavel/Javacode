package automation68;

import java.util.Scanner;

public class Areaperimetertriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b, h;
Scanner s=new Scanner(System.in);
b=s.nextInt();
h=s.nextInt();
float areaoftriangle=1/2*b*h;
System.out.println("area of triangle is" +areaoftriangle);
int a,c;
a=s.nextInt();
c=s.nextInt();
int peritriangle=a+b+c;
System.out.println("perimeterof triangle is" +peritriangle);

	}

}
