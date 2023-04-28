package tw.org.iii.classes;

import java.io.Serializable;

public class Bike extends Object implements Serializable{ //因原先沒有附類別 所以(預設)Object為父
	
	// 創建 速度-屬性 且屬性名全小寫 用動詞介系詞（駝峰命名）
	protected double speed; // 加上 public 全部人都能呼叫  private私人  protected可以在其所屬類別及其子類別中訪問
	private String color;  //物件的屬性沒初始值
	
	public  Bike()  { //建構式 名稱要與類別一模一樣
		//System.out.println("Bike()");
		color = "yellow";
	}
	
	public String getColor() {
		return color;
	}
	
	public void upspeed() { // 如果沒加上public 只能在同個屬性資料夾內使用
		speed = speed < 1 ? 1 : speed * 1.2;
	}

	public void downspeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}
	public double getSpeed() {
		return speed;
	}
	
	@Override
		public String toString() {
			return "Bike:" + speed;
		}
}
