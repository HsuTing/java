import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class China_hw3 extends JFrame implements ActionListener{
	private JTextArea inputlines1, inputlines2;

	public static void main(String[] args) {
		China_hw3 frame = new China_hw3();
		frame.setVisible(true);
	}
	
	public China_hw3(){
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		inputlines1 = new JTextArea(15, 23);
		inputlines1.setSize(inputlines1.getPreferredSize());
		inputlines1.setText("<Input your word here>");
		add(inputlines1);
		
		inputlines2 = new JTextArea(15, 23);
		inputlines2.setSize(inputlines2.getPreferredSize());
		inputlines2.setText("<Here is output>");
		add(inputlines2);
		
		JButton btn = new JButton("Translate");
		btn.setSize(btn.getPreferredSize());
		btn.addActionListener(this);
		add(btn);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Translate")){
			Scanner scan = new Scanner(inputlines1.getText());
			String result = "";
			
			while(scan.hasNextLine()){
				String temp = this.translate(scan.next());
				result = result + temp + "\n";
				inputlines2.setText(result);
			}
			
			scan.close();
		}
	}
	
	private String translate(String input){
		if(input.charAt(0) == 'A' || input.charAt(0) == 'E' || input.charAt(0) == 'I' || input.charAt(0) == 'O' || input.charAt(0) == 'U'){
			return input + "way";
		}
		else if(input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o' || input.charAt(0) == 'u'){
			return input + "way";
		}
		else{
			return input.substring(1) + input.substring(0, 1) + "ay";
		}
	}

}
