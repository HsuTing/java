import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Graphics extends JFrame implements WindowListener{
	private smiley_face smiley_face;
	private frowny_face frowny_face;
	
	public static void main(String[] args) {
		Graphics frame = new Graphics();
		frame.setVisible(true);
	}
	
	public Graphics(){
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(this);
		
		smiley_face = new smiley_face();
		smiley_face.setBackground(Color.white);
		frowny_face = new frowny_face();
		frowny_face.setBackground(Color.white);
	}

	public void windowActivated(WindowEvent arg0) {
		this.add(smiley_face);
		smiley_face.setVisible(true);
		frowny_face.setVisible(false);
	}

	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent arg0) {
		this.add(frowny_face);
		smiley_face.setVisible(false);
		frowny_face.setVisible(true);
	}

	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
