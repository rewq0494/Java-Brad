package tw.org.iii.tutor;

public class Brad26轉換 {

	public static void main(String[] args) {
		byte b1 = 123;
		int i1 = b1; //byte放到int 自動轉型
		int i2 = 128; 
		byte b2 = (byte)i2; //當強制轉型後 原宣告的值 不會超過宣告（byte,int..)的範圍
		System.out.println(b2);
		System.out.println("----");
		byte b3 = 127;
		b3++;
		b3 += 1;
		System.out.println(b3);
	}

}
