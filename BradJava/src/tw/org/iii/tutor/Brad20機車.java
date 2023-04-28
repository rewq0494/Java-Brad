package tw.org.iii.tutor;

import tw.org.iii.classes.Scooter;

public class Brad20機車 {

	public static void main(String[] args) {
		//根據scooter類別 創造 scooter物件
		Scooter s1 = new Scooter();
		//s1物件 呼叫 changeGear方法 的時候傳入數字 2
		s1.changeGear(2);
		s1.upspeed();s1.upspeed();s1.upspeed();
		System.out.println(s1.getSpeed());
		
		s1.downspeed();
		System.out.println(s1.getSpeed());
		
	}

}
