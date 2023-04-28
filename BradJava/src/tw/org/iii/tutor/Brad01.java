package tw.org.iii.tutor;

public class Brad01 {

	public static void main(String[] args) {
		// byte, short, int, long 整數宣告
		// byte 2^8 容量 -128~127
		// short 2^16 => 65563 => -32768 ~ 32767
		// int  2^32
		// long 2^64
		byte var1;
		byte var2, var3;
		byte var4 = 123;
		//沒宣告變數的值 Java無法執行
		
		System.out.println(var4);
		//byte 無法使用 byte var5 = var4 + 1;
		int var5 = var4 + 1;
		
		short var6 = 321, var7 = 123;
		int var8 = var6 + var7;
		//--------------------------------------//
		// 變數名稱首字限 [a-zA-Z$_], [a-zA-Z0-9$_]*
		byte $$$ = 100;
		System.out.println($$$);
		int 變數1 = 123;
		System.out.println(變數1);
		
		
		
		
	}

}
