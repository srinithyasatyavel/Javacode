package automation68;

import java.util.Scanner;

public class Votingruntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible to vote");
		}
		
		

	}

}
