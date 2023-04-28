package tw.org.iii.tutor;

public class Brad10 {

	public static void main(String[] args) {
		int a = 10, b = 3;
//		&前面f還是會計算後面 &&前面f 後面就不會在運算
		if (++a >= 10 && --b <= 3) {
			System.out.printf("OK: a = %d; b = %d", a, b);
		}else {
			System.out.printf("XX: a = %d; b = %d", a, b);
		}
	}

}
