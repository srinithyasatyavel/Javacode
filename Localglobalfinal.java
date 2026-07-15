
package automation68;

public class Localglobalfinal {
	static int g;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("globalvariable is" +g);
		g=20;
		System.out.println("local variable is" +g);
		final int g=25;
		System.out.println("final variable is" +g);
		
		

	}

}
