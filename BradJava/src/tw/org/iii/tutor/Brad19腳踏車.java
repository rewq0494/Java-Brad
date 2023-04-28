package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;

public class Brad19腳踏車 {

	public static void main(String[] args) {
		// 呼叫宣告屬性 創變數 建立一個 Bike 物件，並將其實體化（new Bike()）
		//接著，透過 bike 這個物件參考，可以呼叫 Bike 類別中的方法或存取其屬性。
		Bike bike = new Bike();
		System.out.println(bike.getSpeed());
		bike.upspeed();bike.upspeed();bike.upspeed(); //使用加速
		System.out.println(bike.getSpeed());
		bike.downspeed();bike.downspeed();
		System.out.println(bike.getSpeed());
		
		
	}

}
