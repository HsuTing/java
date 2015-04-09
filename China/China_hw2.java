import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class China_hw2 extends JFrame implements ActionListener{
	private JTextArea inputlines;

	public static void main(String[] args) {
		China_hw2 frame = new China_hw2();
		frame.setVisible(true);
	}

	public China_hw2(){
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		JButton btn1 = new JButton("Load");
		btn1.setLocation(25, 310);
		btn1.setSize(btn1.getPreferredSize());
		btn1.addActionListener(this);
		this.add(btn1);
		
		JButton btn2 = new JButton("Save");
		btn2.setLocation(100, 310);
		btn2.setSize(btn2.getPreferredSize());
		btn2.addActionListener(this);
		this.add(btn2);
		
		inputlines = new JTextArea(15, 48);
		inputlines.setLocation(25, 25);
		inputlines.setSize(inputlines.getPreferredSize());
		inputlines.setText("<Input your text here>");
		add(inputlines);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Load")){
			Scanner filein = null;
			try{
				filein = new Scanner(new FileInputStream("China_hw2.txt"));
				String result = "", temp ="";
				
				while(filein.hasNextLine()){
					temp = filein.nextLine();
					result = result + temp + "\n";
				}
				inputlines.setText(result);
			}
			catch(FileNotFoundException ex){
				try {
					PrintWriter writer = new PrintWriter(new FileOutputStream("China_hw2.txt"));

					writer.flush();
					writer.close();
				}
				catch (FileNotFoundException except) {
					except.printStackTrace();
				}
			}
			filein.close();
		}
		else if(e.getActionCommand().equals("Save")){
			try {
				PrintWriter writer = new PrintWriter(new FileOutputStream("China_hw2.txt"));

				writer.println(inputlines.getText());
				writer.flush();
				writer.close();
			}
			catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}
		}
	}
}
