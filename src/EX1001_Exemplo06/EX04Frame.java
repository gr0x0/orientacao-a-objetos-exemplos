package EX1001_Exemplo06;

import java.awt.*;
import javax.swing.*;

import EX1001_Exemplo04.EX07Frame;

public class EX04Frame extends JFrame
{
	public final int LARG_DEFAULT=400;
	public final int ALT_DEFAULT=400;
	
	public EX04Frame()
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl=screenSize.width;
		int sa=screenSize.height;
		int x=sl/2-LARG_DEFAULT/2;
		int y=sa/2-ALT_DEFAULT/2;
		setBounds(x,y,LARG_DEFAULT,ALT_DEFAULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(new ExPanel());
	}
	
	public static void main(String[] args)
	{
		EX04Frame f = new EX04Frame();
		f.setVisible(true);
	}
}
