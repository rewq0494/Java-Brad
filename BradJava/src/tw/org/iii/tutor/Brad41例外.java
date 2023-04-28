package tw.org.iii.tutor;

public class Brad41例外 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int[] c  = {1, 2, 3, 4};
		try {
			System.out.println(a / b);
			System.out.println(c[6]);
		}catch(ArithmeticException ae) { //運算出現例外
			System.out.println("Oooop");
		}catch (ArrayIndexOutOfBoundsException ee){ //陣列
			System.out.println("not");
		}
		
		System.out.println("ok");
		}
		
	}


