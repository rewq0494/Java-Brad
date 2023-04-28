package tw.org.iii.tutor;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad21物件結合 extends JFrame { //繼承JF
	private JButton b1;
	public Brad21物件結合() {
		
		//System.out.println("Brad21()");
		setTitle("我的視窗");//視窗名
		
		setLayout(new FlowLayout());
		b1 = new JButton("按我");
		add(b1);
		
		setSize(640, 480);//長寬
		setVisible(true);//顯示視窗
		setDefaultCloseOperation(EXIT_ON_CLOSE); //完全關閉視窗
	}
	public static void main(String[] args) {
		new Brad21物件結合();
	}

}
