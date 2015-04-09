import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class China_hw4 extends JFrame implements ActionListener{
	private JLabel information;
	private JButton[][] btn = new JButton[3][3];
	private int count = 0;
	private int[][] map = new int[3][3];

	public static void main(String[] args) {
		China_hw4 frame = new China_hw4();
		frame.setVisible(true);
	}
	
	public China_hw4(){
		this.setMap();
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.information = new JLabel("Wellcome!");
		this.information.setSize(200, 50);
		this.add(information, BorderLayout.NORTH);
		
		for(int j = 0; j < 3; j++){
			for(int i = 0; i < 3; i++){
				btn[j][i] = new JButton();
				btn[j][i].addActionListener(this);
			}
		}
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 3));
		
		for(int j = 0; j < 3; j++){
			for(int i = 0; i < 3; i++){
				p1.add(btn[j][i]);
			}
		}
		this.add(p1, BorderLayout.CENTER);
	}
	
	private void setMap(){
		for(int j = 0; j < 3; j++){
			for(int i = 0; i < 3; i++){
				map[j][i] = 0;
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(count <= 9){
			for(int j = 0; j < 3; j++){
				for(int i = 0; i < 3; i++){
					if(e.getSource() == btn[j][i]){
						if(this.map[j][i] !=0)
							continue;
						if(this.count % 2 ==0){
							btn[j][i].setText("O");
							this.map[j][i] = 1;
						}
						else{
							btn[j][i].setText("X");
							this.map[j][i] = -1;
						}
						
						this.count = this.count + 1;
					}
				}
			}
		}
		if(count == 9 && check() == 0){
			information.setText("There is a tie!");
		}
		
		if(check() == 1){
			information.setText("Frist player win!");
			count = 10;
		}
		else if(check() == -1){
			information.setText("Second player win!");
			count = 10;
		}
	}
	
	public int check(){
		int[] check = new int[8];
		for(int i = 0; i < 8; i++)
			check[i] = 0;
		for(int i = 0; i < 3; i++){
			check[0] = map[0][i] + check[0];
		}
		
		for(int i = 0; i < 3; i++){
			check[1] = map[1][i] + check[1];
		}
		
		for(int i = 0; i < 3; i++){
			check[2] = map[2][i] + check[2];
		}
		
		for(int j = 0; j < 3; j++){
			check[3] = map[j][0] + check[3];
		}
		
		for(int j = 0; j < 3; j++){
			check[4] = map[j][1] + check[4];
		}
		
		for(int j = 0; j < 3; j++){
			check[5] = map[j][2] + check[5];
		}
		
		check[6] = map[0][0] + map[1][1] + map[2][2];
		check[7] = map[2][0] + map[1][1] + map[0][2];
		
		for(int i = 0; i < 8; i++){
			if(check[i] == 3)
				return 1;
			else if(check[i] == -3)
				return -1;
		}
		
		return 0;
	}
}
