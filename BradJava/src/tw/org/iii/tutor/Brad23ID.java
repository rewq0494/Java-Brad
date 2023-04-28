package tw.org.iii.tutor;

import tw.org.iii.classes.TWId;

public class Brad23ID {

	public static void main(String[] args) {
		String id = "K123456789";
		if (TWId.checkId(id)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("-------");
		TWId id1 = new TWId();
		TWId id2 = new TWId(1);
		TWId id3 = new TWId(false);
		TWId id4 = new TWId(true, 0);
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		TWId id5 = TWId.createTWId("A123456789");
		System.out.println(id5.getId());
		
		//手機
		String ph = "0973-111111";
		if(ph.matches("09[1-9]{2}-[0-9]{6}")) { // {2}代表前面的出現2次
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
	}

}