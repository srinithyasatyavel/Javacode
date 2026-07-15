package automation68;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int age=s.nextInt();
		System.out.println("enter ur age for voting " +age);
		
		if(age>=18)
		{
			System.out.println("u are eligible for voting");
		}
		else
			System.out.println("not eligible");
		s.close();
	}
	

}
