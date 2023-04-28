package tw.org.iii.tutor;

import java.util.HashSet;

import tw.org.iii.classes.Bike;

public class Brad35 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");
		set.add(new Bike());
		set.add(123); // 123=>auto-boxing
		set.add("Brad");
		set.add(123);
		System.out.println(set.size());
		System.out.println(set.toString());
		System.out.println(set);
		
	}

}
