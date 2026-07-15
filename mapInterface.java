package automation68;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//import org.zeromq.ZStar.Set;

public class mapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer ,String> m1=new HashMap<Integer,String>();
m1.put(10,"sri");
m1.put(15, "lakshmi");
m1.put(20, "harsha");
System.out.println(m1);
java.util.Set<Integer> s1=m1.keySet();
System.out.println(s1);
Collection<String> s2=m1.values();
System.out.println(s2);
Set<Entry<Integer, String>> s3=m1.entrySet();
System.out.println(s3);
for(Integer i1 :m1.keySet())
{
	System.out.println(i1);
}
for(String i1 :m1.values())
{
	System.out.println(i1);
}




	}

}
