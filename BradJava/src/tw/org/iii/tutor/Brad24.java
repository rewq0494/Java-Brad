package tw.org.iii.tutor;
import tw.org.iii.classes.Bike;
public class Brad24 {

	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = s1.concat("Chao");
		String s3 = s1.replace('a', 'A'); //把a改成A
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("------");
		
		int a = 10, b = 3;
		System.out.println(a == b); //f
		String str1 = "Brad";
		String str2 = "Brad";
		System.out.println(str1 == str2); //t
		String str3 = new String("Brad");
		String str4 = new String("Brad");
		System.out.println(str3 == str4); //f
		System.out.println(str1 == str4); //f
		
		System.out.println("------");
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1 == b2);
		
		
	}

}
