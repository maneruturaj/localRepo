package Fifa;

public class Argintia_France {

	public static void main(String[]args)
	{
		String p="Argentina";
		String q = "Argentina";
		
		String r= new String("Argentina");
		String s= new String("Argentina");
		
		System.out.println(p==q);
		System.out.println(q==r);
		System.out.println(r==s);
		
		char result=p.charAt(5);
		System.out.println(result);
		
		int count=r.length();
		System.out.println(count);
		
		q =q.concat("  Messi");
		System.out.println(q);
		
		int resulta =q.indexOf('n');
		System.out.println(resulta);
		
		
		
		
	}
}
