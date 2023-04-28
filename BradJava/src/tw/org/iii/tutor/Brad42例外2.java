package tw.org.iii.tutor;

public class Brad42例外2 {

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
		}catch(RuntimeException a123) { //任何一個例外 都處理
			System.out.println("Noooooo");
		}
		
		System.out.println("ok");
		}
		
	}


