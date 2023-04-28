package tw.org.iii.tutor;

public class Brad43例外案例 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
		b1.setLeg(2);
		System.out.println("ok");
		}catch(Exception eee) {
			System.out.println("Error");
		}
	}

}
class Bird {
	private int leg;
	void setLeg(int leg) throws Exception { //宣告有可能會拋出例外
		if(leg >= 0 && leg <= 2) {
		this.leg = leg;
		}else {
			throw new Exception();
		}
	}
}