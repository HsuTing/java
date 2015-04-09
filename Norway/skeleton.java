import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class skeleton extends JFrame implements ActionListener{
	private JTextArea text;
	private JButton btn;
	
	private class information implements WindowListener{
		public void windowActivated(WindowEvent e) {
			text.setText("\n\nwindowActivated");
		}

		public void windowClosed(WindowEvent e) {
			text.setText("\n\nwindowClosed");
		}

		public void windowClosing(WindowEvent e) {
			text.setText("\n\nwindowClosing");
		}

		public void windowDeactivated(WindowEvent e) {
			text.setText("\n\nwindowDeactivated");
		}

		public void windowDeiconified(WindowEvent e) {
			text.setText("\n\nwindowDeiconified");
		}

		public void windowIconified(WindowEvent e) {
			text.setText("\n\nwindowIconified");
		}

		public void windowOpened(WindowEvent e) {
			text.setText("\n\nwindowOpened");
		}
	}

	public static void main(String[] args) {
		skeleton frame = new skeleton();
		frame.setVisible(true);
	}
	
	public skeleton(){
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.addWindowListener(new information());
		
		text = new JTextArea(5, 10);
		text.setEnabled(false);
		text.setSize(text.getPreferredSize());
		
		btn = new JButton("exit");
		btn.addActionListener(this);
		
		this.add(this.text, BorderLayout.NORTH);
		this.add(this.btn, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("exit")){
			System.exit(0);
		}
	}
}
