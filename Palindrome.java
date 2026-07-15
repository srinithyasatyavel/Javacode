package automation68;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hitler";
String y="";
for(int i=s.length()-1;i>=0;i--)
{
	char c=s.charAt(i);
	y=y+c;
}
if(s.equalsIgnoreCase(y))
{
	System.out.println("the two strings are palindrome");
}
else
	System.out.println("the two strings are not palindrome");

	}

}
