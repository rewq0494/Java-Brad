
package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//定義GNum 可實作 ActionListener
public class JasonGame extends JFrame implements ActionListener {
 private JButton guess;
 private JTextField input;
 private JTextArea log;
 private String answer;
 
 public JasonGame() {
  //有無傳參數建構式;
  // super();
  super("猜數字遊戲");
  
  guess = new JButton("猜");
  input = new JTextField();
  log = new JTextArea();
  
  setLayout(new BorderLayout());
  JPanel top = new JPanel(new BorderLayout());
  top.add(guess, BorderLayout.EAST);
  top.add(input, BorderLayout.CENTER);
  
  add(top,BorderLayout.NORTH);
  add(log,BorderLayout.CENTER);
  
  guess.addActionListener(this);
  
  setSize(640, 480);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  answer = createAnswer(3);
 }

 public static void main(String[] args) {
  new JasonGame();

 }

 @Override
 public void actionPerformed(ActionEvent e) {
  String strInput = input.getText();
  
  //比對
  String result = checkAB(strInput);
  log.append(strInput + "=>" + result + "\n");
  
  //清掉
  input.setText("");
  
  // 猜對
        if (result.equals("3A0B")) {
            JOptionPane.showMessageDialog(null, "恭喜過關");
            log.setText("");
            answer = createAnswer(3);
        }
 }
 
 private String checkAB(String g) {
  int A, B; A = B = 0;
  for (int i = 0; i < g.length(); i++) {
   char c = g.charAt(i);
   
   //c是否存在answer的相同位置？
   if (c == answer.charAt(i)) {
    A++;
   //c是否存在於answer中？
   }else if (answer.indexOf(c) != -1) {
    B++;
   }
  }
  return String.format("%dA%dB", A, B);
  
 }
 private String createAnswer(int n) {
  //採用前回poker洗牌的main方法
  int num = 10;
  int[] poker = new int[num];
  for (int i = 0; i<poker.length; i++) poker[i] = i;
  
  for (int i = num-1; i > 0; i--) {
   int rand = (int)(Math.random()*(i+1));
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

//定義MyListener 實作 ActionListener
//class MyListener implements ActionListener {
//
// @Override
// public void actionPerformed(ActionEvent e) {
//  System.out.println("OK");
// }
// 
//}