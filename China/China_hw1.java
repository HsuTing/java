import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class China_hw1 extends JFrame implements ActionListener{
	private JTextArea inputlines1, inputlines2;
	private JLabel label1, label2;
	
	public static void main(String[] args) {
		China_hw1 frame = new China_hw1();
		frame.setVisible(true);
	}
	
	public China_hw1(){
		this.setSize(350, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		JButton btn1 = new JButton("Convert");
		btn1.setLocation(25, 150);
		btn1.setSize(btn1.getPreferredSize());
		btn1.addActionListener(this);
		this.add(btn1);
		
		JButton btn2 = new JButton("Clear");
		btn2.setLocation(150, 150);
		btn2.setSize(btn2.getPreferredSize());
		btn2.addActionListener(this);
		this.add(btn2);
		
		label1 = new JLabel("Input number:");
		label1.setLocation(25, 25);
		label1.setSize(200, 50);
		add(label1);
		
		label2 = new JLabel("The result:");
		label2.setLocation(25, 65);
		label2.setSize(200, 50);
		add(label2);
		
		inputlines1 = new JTextArea(1, 25);
		inputlines1.setLocation(25, 60);
		inputlines1.setSize(inputlines1.getPreferredSize());
		inputlines1.setText("<Input your number here>");
		add(inputlines1);
		
		inputlines2 = new JTextArea(1, 25);
		inputlines2.setLocation(25, 100);
		inputlines2.setSize(inputlines2.getPreferredSize());
		inputlines2.setText("<Here is output>");
		add(inputlines2);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Convert")){
			String temp = convert(inputlines1.getText());
			inputlines2.setText(temp);
		}
		else if(e.getActionCommand().equals("Clear")){
			inputlines1.setText("<Input your number here>");
			inputlines2.setText("<Here is output>");
		}
	}
	
	private String convert(String number){
		return Integer.toBinaryString(Integer.parseInt(number));
	}
}
