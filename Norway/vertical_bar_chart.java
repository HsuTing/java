import java.awt.Graphics;

import javax.swing.JPanel;


public class vertical_bar_chart extends JPanel{
	public static final int X = 100;
	public static final int Y = 100;
	private int amount;
	private int[] temp;
	
	public vertical_bar_chart(int[] number){
		this.amount = number.length;
		temp = number;
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawRect(X, Y, width, height);
	}
}
