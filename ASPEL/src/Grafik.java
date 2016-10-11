import java.awt.*;
import javax.swing.*;

public class Grafik extends JPanel {
private int width = 100;
private int height = 100;

private int d = 500;


	

}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Grafik grafik = new Grafik();
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
		setTitle("WINDOWS DEFENDER 2003 PREMIUM EDITION");
		setResizable(true);
		
	}

public void paint(Graphics g){
	g.setColor(Color.MAGENTA);
	g.fillRect(0, 0, 2000, 900);
	g.setColor(Color.WHITE);
	g.drawRect(70, 100, width, height);
	g.setColor(Color.WHITE);
	g.fillRect(160, 200, width, height);
	g.setColor(Color.WHITE);
	g.drawOval(300, 250, d, d);
}
}