package tw.org.iii.classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel{
	private LinkedList<LinkedList<Point>> lines, recycleBin;//將單條改為多條
	
	public MyDrawer() {
		setBackground(Color.yellow); //將視窗的背景顏色設為黃色
		
		lines = new LinkedList<>();
		recycleBin = new LinkedList<>();
		
		Mylistener mylistener = new Mylistener();
		addMouseListener(mylistener); //將 mylistener 物件加入視窗的滑鼠監聽器中，以監聽使用者對滑鼠按鍵的操作
		addMouseMotionListener(mylistener); //將 mylistener 物件加入視窗的滑鼠移動監聽器中，以監聽使用者對『滑鼠移動』的操作
		
	}
	
	public void clear() { //清除變數內容
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if(lines.size()>0)
		recycleBin.add(lines.removeLast());
		repaint();
	}
	
	public void redo() {
		if(recycleBin.size() > 0) {
			lines.add(recycleBin.removeLast());
			repaint();
		}
	}
	@Override //paintComponent() 是一個方法，用來繪製 Java Swing 的圖形介面元件
	protected void paintComponent(Graphics g) {//paintC option + /
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g; // g 轉換成 Graphics2D 物件  轉換後的 g2d 物件就可以使用 Graphics2D 特有的方法來繪圖
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(3));//setStroke-BasicStroke 控制線粗細
		
		for(LinkedList<Point> line: lines) {
		for(int i=1; i<line.size();i++) {
			Point p0 = line.get(i-1);
			Point p1 = line.get(i);
			g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}
//		g2d.drawLine(0, 0, 200, 300);
	}
	
	private class Mylistener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			recycleBin.clear();
			LinkedList<Point> line = new LinkedList<>();//創新線
			Point point = new Point();
			point.x = e.getX();point.y = e.getY();
			line.add(point);
			lines.add(line);
			
			repaint();
		}
		public void mouseDragged(MouseEvent e) { //mousD option+/
			Point point = new Point();
			point.x = e.getX();point.y = e.getY();
			
			lines.getLast().add(point);
			
			repaint();
		}
//		@Override //滑鼠點擊事件
//		public void mousePressed(MouseEvent e) { //mousP option+/
//			System.out.println("press:" + e.getX() + ", " + e.getY());
//		}
//		@Override //按下並移動事件
//		public void mouseDragged(MouseEvent e) { //mousD option+/
//			System.out.println("deag: " + e.getX() + ", " + e.getY());
//			repaint();
//		}
	}
 
}

class Point {
	public int x, y; 
	
}
