package tw.org.iii.tutor;

public class Brad22宣告物件 {

	public static void main(String[] args) {
		String s1 = "Brad";
		System.out.println(s1);
		System.out.println("Brad".charAt(0));
		String s2 = new String();
		byte[] b1 = {97, 98, 99, 100};
//		byte[] b1; 第二種方法
//		b1 = new b1[]{97, 98, 99, 100};
		String s3 = new String(b1);
		System.out.println(s2);
		System.out.println(s3);//b1數字代表英文
		System.out.println(b1[1]);
	}

}
