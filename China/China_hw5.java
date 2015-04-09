import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class China_hw5 extends JFrame implements ActionListener{
	private JTextArea result, operand;
	private JLabel label1, label2;
	private JButton[] btn = new JButton[10];
	private JButton decimal, equal, add, sub, multi, div, reset, clear;
	private boolean check1 = false, check2 = false, check3 = false;
	private String operation;

	public static void main(String[] args) {
		China_hw5 frame = new China_hw5();
		frame.setVisible(true);
	}
	
	public China_hw5(){
		this.setSize(350, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		label1 = new JLabel("Result:");
		label1.setLocation(0, -10);
		label1.setSize(200, 50);
		
		result = new JTextArea(3, 30);
		result.setLocation(0, 25);
		result.setSize(result.getPreferredSize());
		
		label2 = new JLabel("Operand:");
		label2.setLocation(0, 65);
		label2.setSize(200, 50);
		
		operand = new JTextArea(3, 30);
		operand.setLocation(0, 100);
		operand.setSize(operand.getPreferredSize());
		
		for(int i = 0; i < 10; i++){
			btn[i] = new JButton(Integer.toString(i));
			btn[i].addActionListener(this);
		}
		decimal = new JButton(".");
		decimal.addActionListener(this);
		equal = new JButton();
		equal.addActionListener(this);
		add = new JButton("+");
		add.addActionListener(this);
		sub = new JButton("-");
		sub.addActionListener(this);
		multi = new JButton("*");
		multi.addActionListener(this);
		div = new JButton("/");
		div.addActionListener(this);
		reset = new JButton("reset");
		reset.addActionListener(this);
		clear = new JButton("clear");
		clear.addActionListener(this);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(5, 4));
		p1.add(btn[7]);
		p1.add(btn[8]);
		p1.add(btn[9]);
		p1.add(add);
		p1.add(btn[4]);
		p1.add(btn[5]);
		p1.add(btn[6]);
		p1.add(sub);
		p1.add(btn[1]);
		p1.add(btn[2]);
		p1.add(btn[3]);
		p1.add(multi);
		p1.add(btn[0]);
		p1.add(decimal);
		p1.add(equal);
		p1.add(div);
		p1.add(reset);
		p1.add(clear);
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.add(label1);
		p2.add(result);
		p2.add(label2);
		p2.add(operand);
		
		this.add(p2, BorderLayout.CENTER);
		this.add(p1, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		for(int i = 1; i <= 9; i++){
			if(e.getActionCommand().equals(Integer.toString(i))){
				operand.setText(operand.getText() + Integer.toString(i));
				check1 = true;
			}
		}
		if(e.getActionCommand().equals("0")){
			if(check3 == true)
				return;
			else{
				operand.setText(operand.getText() + "0");
				check3 = true;
			}
		}
		if(e.getActionCommand().equals(".")){
			if((check1 != true && check3 != true) || check2 == true)
				return;
			else{
				operand.setText(operand.getText() + ".");
				check2 = true;
			}
		}
		if(e.getActionCommand().equals("+")){
			if(result.getText().isEmpty()){
				result.setText(operand.getText());
				operand.setText(null);
				operation = "+";
			}
			else{
				control();
				operation = "+";
			}
			check1 = false;
			check2 = false;
			check3 = false;
		}
		if(e.getActionCommand().equals("-")){
			if(result.getText().isEmpty()){
				result.setText(operand.getText());
				operand.setText(null);
				operation = "-";
			}
			else{
				control();
				operation = "-";
			}
			check1 = false;
			check2 = false;
			check3 = false;
		}
		if(e.getActionCommand().equals("*")){
			if(result.getText().isEmpty()){
				result.setText(operand.getText());
				operand.setText(null);
				operation = "*";
			}
			else{
				control();
				operation = "*";
			}
			check1 = false;
			check2 = false;
			check3 = false;
		}
		if(e.getActionCommand().equals("/")){
			if(result.getText().isEmpty()){
				result.setText(operand.getText());
				operand.setText(null);
				operation = "/";
			}
			else{
				control();
				operation = "/";
			}
			check1 = false;
			check2 = false;
			check3 = false;
		}
		if(e.getActionCommand().equals("reset")){
			result.setText(null);
			check1 = false;
			check2 = false;
			check3 = false;
		}
		if(e.getActionCommand().equals("clear")){
			operand.setText(null);
			check1 = false;
			check2 = false;
			check3 = false;
		}
		
	}
	
	public void control(){
		if(operation == "+"){
			double tempR = Double.parseDouble(result.getText());
			double tempO = Double.parseDouble(operand.getText());
			tempR = tempR + tempO;
			result.setText(String.valueOf(tempR));
			operand.setText(null);
		}
		
		if(operation == "-"){
			double tempR = Double.parseDouble(result.getText());
			double tempO = Double.parseDouble(operand.getText());
			tempR = tempR - tempO;
			result.setText(String.valueOf(tempR));
			operand.setText(null);
		}
		
		if(operation == "*"){
			double tempR = Double.parseDouble(result.getText());
			double tempO = Double.parseDouble(operand.getText());
			tempR = tempR * tempO;
			result.setText(String.valueOf(tempR));
			operand.setText(null);
		}
		
		if(operation == "/"){
			double tempR = Double.parseDouble(result.getText());
			double tempO = Double.parseDouble(operand.getText());
			tempR = tempR / tempO;
			result.setText(String.valueOf(tempR));
			operand.setText(null);
		}
	}

}
