package tw.org.iii.classes;

public class Scooter extends Bike{ //extends 延伸 腳踏車為摩托車 父類別。透過繼承，Scooter 可以繼承 Bike 中的所有屬性和方法
	private int gear;
	
	public void upspeed() {
		speed = speed < 1 ? 1 : speed * gear * 1.2; //修改內容
	}
	
	// 新增內容
	public int changeGear(int newgear) {  
		if(newgear >=0 && newgear <= 4) {
			gear = newgear;
		}
		return gear;
	}

}
