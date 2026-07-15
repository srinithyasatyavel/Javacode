package automation68;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "apple";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c= s.charAt(i);
			reverse=reverse+c;
			
			
		}
		System.out.println("string is" +s);
		System.out.println("reversed string is" +reverse);

	}

}
