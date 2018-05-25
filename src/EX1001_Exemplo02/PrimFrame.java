package EX1001_Exemplo02;

import javax.swing.*;

public class PrimFrame extends JFrame
{
	public final int LARG_DEFAULT=400;
	public final int ALT_DEFAULT=300;
	
	public PrimFrame()
	{
		setSize(LARG_DEFAULT,ALT_DEFAULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		PrimFrame f=new PrimFrame();
		f.setTitle("Minha Primeira GUI");
		f.setVisible(true);
	}
}