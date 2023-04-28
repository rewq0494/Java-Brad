package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;

public class Brad33封箱 {

	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		Integer d = Integer.parseInt("10");
		Integer e = 13;//自動封箱 auto-boxing
		System.out.println(e.doubleValue());
		
		Bike b1 = new Bike();//b1+b2 物件與物件無法相加
		Bike b2 = new Bike();
		//System.out.println(b1+b2);//物件與物件無法相加
	
		System.out.println(b+e); // b, c, d, e => auto-unboxing 自動解封箱 
	}

}
