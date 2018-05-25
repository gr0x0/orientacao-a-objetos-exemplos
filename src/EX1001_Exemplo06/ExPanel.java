package EX1001_Exemplo06;

import javax.swing.JPanel;

import EX1001_Exemplo05.EX04Frame;

import java.awt.*;
import java.awt.geom.*;

public class ExPanel extends JPanel
{
	public static final int TXT_X=120;
	public static final int TXT_Y=140;

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D) g;
		// Desenha ret�ngulo
		double leftX=100.0;
		double topY=100.0;
		double larg=200.0;
		double alt=150.0;
		Rectangle2D rt=new Rectangle2D.Double(leftX,topY,larg,alt);
		g2d.draw(rt);
		// Desenha a elipse interna ao ret�ngulo
		Ellipse2D e=new Ellipse2D.Double();
		e.setFrame(rt);
		g2d.draw(e);
		// Desenha uma diagonal do ret�ngulo
		Point2D p1=new Point2D.Double(leftX,topY);
		Point2D p2=new Point2D.Double(leftX+larg,topY+alt);
		g2d.draw(new Line2D.Double(p1,p2));
		// Desenha c�rculo com o mesmo centro
		double cX=rt.getCenterX();
		double cY=rt.getCenterY();
		double raio=150.0;
		Ellipse2D circ=new Ellipse2D.Double();
		circ.setFrameFromCenter(cX,cY,cX+raio,cY+raio);
		g2d.draw(circ);
	}
}
