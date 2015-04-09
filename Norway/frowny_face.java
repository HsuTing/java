import javax.swing.JPanel;
import java.awt.Graphics;


public class frowny_face extends JPanel{
	public static final int FACE_DIAMETER = 200;
	public static final int X_FACE = 100;
	public static final int Y_FACE = 100;
	public static final int EYE_WIDTH = 20;
	public static final int X_RIGHT_EYE = X_FACE + 55;
	public static final int Y_RIGHT_EYE = Y_FACE + 30;
	public static final int X_LEFT_EYE = X_FACE + 130;
	public static final int Y_LEFT_EYE = Y_FACE + 30;
	
	public static final int MOUTH_WIDTH = 100;
	public static final int X_MOUNTH = X_FACE + 50;
	public static final int Y_MOUNTH = Y_FACE + 120;

	public void paint(Graphics g){
		super.paint(g);
		g.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
		g.drawArc(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, 70, 180, 180);
		g.drawArc(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, 70, 180, 180);
		g.drawArc(X_MOUNTH, Y_MOUNTH, MOUTH_WIDTH, 70, 0, 180);
	}
}
