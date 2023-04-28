package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 我本身是視窗 我也會執行按下按鈕的事情
//使用implements關鍵字實作介面時，這個類別必須實作該介面中定義的所有方法，
//否則編譯會出現錯誤訊息。實作介面的主要目的是為了達成多型性的程式設計。
public class GNum猜數字 extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;

	public GNum猜數字() {
		super("猜數字遊戲");

		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();

		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);

		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);

		guess.addActionListener(this);

		initView();
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		newGame();
	}

	public static void main(String[] args) {
		new GNum猜數字();
	}

	private void initView() {
		input.setFont(new Font(null, Font.BOLD, 24));
		log.setFont(new Font(null, Font.BOLD | Font.ITALIC, 20));
	}

	private void newGame() {
		answer = createAnswer(3);
		System.out.println("answer = " + answer);
		log.setText("");
		input.setText("");
		counter = 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String strInput = input.getText();

		if (isValid(strInput)) {
			counter++;

			String result = checkAB(strInput);
			log.append(String.format("%d. %s => %s \n", counter, strInput, result));
			input.setText("");

			if (result.equals("3A0B")) {
				JOptionPane.showMessageDialog(null, "恭喜老爺");
				newGame();
			} else if (counter == 10) {
				JOptionPane.showMessageDialog(null, "魯蛇: answer = " + answer);
				newGame();
			}
		}

	}

	private boolean isValid(String g) {

		return true;
	}

	private String checkAB(String g) {
		int A, B;
		A = B = 0;
		for (int i = 0; i < g.length(); i++) {
			char c = g.charAt(i);
			if (c == answer.charAt(i)) { // c是否存在answer的相同位置？
				A++;
			} else if (answer.indexOf(c) != -1) {// c是否存在於answer中？ 也可以用 >=0
				B++;
			}
		}
		return String.format("%dA%dB", A, B);
	}

	private String createAnswer(int n) {
		// poker洗牌
		int num = 10;
		int[] poker = new int[num];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;

		for (int i = num - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append(poker[i]);
		}

		return sb.toString();
	}

}

class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
}