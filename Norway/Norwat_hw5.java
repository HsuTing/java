import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Norwat_hw5 extends JFrame implements ActionListener{
	private JTextArea text;
	private JButton btn;

	public static void main(String[] args) {
		Norwat_hw5 frame = new Norwat_hw5();
		frame.setVisible(true);
	}
	
	public Norwat_hw5(){
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		text = new JTextArea(5, 10);
		text.setLocation(0,0);
		text.setSize(text.getPreferredSize());
		JScrollPane scrolledText = new JScrollPane(text);
		scrolledText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);;
		add(scrolledText, BorderLayout.NORTH);
		
		btn = new JButton("confirm");
		btn.addActionListener(this);
		add(btn, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		
	}

}
