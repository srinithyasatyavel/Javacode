package automation68;

public class Override extends Login {
	
	
	void login()
	{
		super.login();
		System.out.println("login using email");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override r=new Override();
		r.login();
		

	}

}
