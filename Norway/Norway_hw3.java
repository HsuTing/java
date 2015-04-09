import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class Norway_hw3 extends JFrame implements ActionListener{
	private JTextArea text;
	private JButton btn;
	private JMenuBar bar;
	private JMenu fontMenu, styleMenu, sizeMenu;
	private JMenuItem font_one, font_two, font_three, font_four, font_five, style_one, style_two;
	private JMenuItem size_one, size_two, size_three, size_four, size_five, size_six, size_seven;
	private String FontName = Font.DIALOG;
	private int style = Font.PLAIN, size = 12;

	public static void main(String[] args) {
		Norway_hw3 frame = new Norway_hw3();
		frame.setVisible(true);
	}
	
	public Norway_hw3(){
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		text = new JTextArea(5, 10);
		text.setSize(text.getPreferredSize());
		
		btn = new JButton("Display");
		btn.addActionListener(this);
		
		fontMenu = new JMenu("font");
		styleMenu = new JMenu("style");
		sizeMenu = new JMenu("size");
		
		font_one = new JMenuItem("Dialog");
		font_one.addActionListener(this);
		font_two = new JMenuItem("DialogInput");
		font_two.addActionListener(this);
		font_three = new JMenuItem("Monospaced");
		font_three.addActionListener(this);
		font_four = new JMenuItem("SansSerif");
		font_four.addActionListener(this);
		font_five = new JMenuItem("Serif");
		font_five.addActionListener(this);
		style_one = new JMenuItem("Bold");
		style_one.addActionListener(this);
		style_two = new JMenuItem("Italic");
		style_two.addActionListener(this);
		size_one = new JMenuItem("9");
		size_one.addActionListener(this);
		size_two = new JMenuItem("10");
		size_two.addActionListener(this);
		size_three = new JMenuItem("12");
		size_three.addActionListener(this);
		size_four = new JMenuItem("14");
		size_four.addActionListener(this);
		size_five = new JMenuItem("16");
		size_five.addActionListener(this);
		size_six = new JMenuItem("24");
		size_six.addActionListener(this);
		size_seven = new JMenuItem("32");
		size_seven.addActionListener(this);
		
		fontMenu.add(font_one);
		fontMenu.add(font_two);
		fontMenu.add(font_three);
		fontMenu.add(font_four);
		fontMenu.add(font_five);
		
		styleMenu.add(style_one);
		styleMenu.add(style_two);
		
		sizeMenu.add(size_one);
		sizeMenu.add(size_two);
		sizeMenu.add(size_three);
		sizeMenu.add(size_four);
		sizeMenu.add(size_five);
		sizeMenu.add(size_six);
		sizeMenu.add(size_seven);
		
		bar = new JMenuBar();
		
		bar.add(fontMenu);
		bar.add(styleMenu);
		bar.add(sizeMenu);
		
		this.add(bar, BorderLayout.NORTH);
		this.add(this.text, BorderLayout.CENTER);
		this.add(this.btn, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Dialog")){
			FontName = Font.DIALOG;
		}
		if(e.getActionCommand().equals("DialogInput")){
			FontName = Font.DIALOG_INPUT;
		}
		if(e.getActionCommand().equals("Monospaced")){
			FontName = Font.MONOSPACED;
		}
		if(e.getActionCommand().equals("SansSerif")){
			FontName = Font.SANS_SERIF;
		}
		if(e.getActionCommand().equals("Serif")){
			FontName = Font.SERIF;
		}
		if(e.getActionCommand().equals("Bold")){
			style = Font.BOLD;
		}
		if(e.getActionCommand().equals("Italic")){
			style = Font.ITALIC;
		}
		if(e.getActionCommand().equals("9")){
			size = 9;
		}
		if(e.getActionCommand().equals("10")){
			size = 10;
		}
		if(e.getActionCommand().equals("12")){
			size = 12;
		}
		if(e.getActionCommand().equals("14")){
			size = 14;
		}
		if(e.getActionCommand().equals("16")){
			size = 16;
		}
		if(e.getActionCommand().equals("24")){
			size = 24;
		}
		if(e.getActionCommand().equals("32")){
			size = 32;
		}
		if(e.getActionCommand().equals("Display")){
			Font font = new Font(FontName, style, size);
			text.setFont(font);
		}
	}

}
