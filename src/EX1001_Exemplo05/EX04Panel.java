package EX1001_Exemplo05;

import javax.swing.*;
import java.awt.*;

public class EX04Panel extends JPanel
{
	public static final int TXT_X=120;
	public static final int TXT_Y=140;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Primeiro Programa Gr�fico",TXT_X,TXT_Y);
	}
}
