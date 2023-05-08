package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.classes.MyClock;
import tw.org.iii.classes.MyDrawer;
import tw.org.iii.classes.MyDrawerV2;
import tw.org.iii.classes.MyDrawerV3;

public class MySign extends JFrame {
	private MyDrawerV3 myDrawer;
	private JButton clear, undo, redo, chColor;
	private JButton saveObj, loadObj, saveJPEG;
	private MyClock myClock;

	public MySign() {
		super("簽名");

		// 建立了一個 MyDrawer 物件 myDrawer，並設定了視窗的版面為 BorderLayout，
		// 然後將 myDrawer 物件加入到視窗的中間區域。
		// MyDrawer 是一個使用者自訂的類別，可能是繪圖物件或介面等，用 setLayout() 方法設定視窗的版面，
		// BorderLayout 則是一種版面管理器，能將視窗區域分為東、西、南、北和中間五個區域，可以將元件放置在這些區域中
		// 這裡使用 add() 方法將 myDrawer 物件加入到中間區域。
		myDrawer = new MyDrawerV3();
		setLayout(new BorderLayout());
		add(myDrawer, BorderLayout.CENTER);

		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
		saveObj = new JButton("Save Obj");
		loadObj = new JButton("Load Obj");
		saveJPEG = new JButton("Save JPEG");
		myClock = new MyClock();
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear); top.add(undo); top.add(redo);
		top.add(chColor); top.add(saveObj); top.add(loadObj);
		top.add(saveJPEG);
		top.add(myClock);
		
		add(top, BorderLayout.NORTH);
		
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		chColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
		
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveObject();
			}
		});

		loadObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadObject();
			}
		});
		
		saveJPEG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.saveJPEG();
			}
		});
		
		
		setSize(800, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void changeColor() {
		/*
		Color newColor = JColorChooser.showDialog(
			null, "Change Color", myDrawer.getColor());
		if (newColor != null) {
			myDrawer.setColor(newColor);
		}
		*/
	}
	
	private void saveObject() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			myDrawer.saveLines(file.getAbsolutePath());
		}
	}
	
	private void loadObject() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			myDrawer.loadLines(file.getAbsolutePath());
		}
	}

	public static void main(String[] args) {
		new MySign();
	}

}