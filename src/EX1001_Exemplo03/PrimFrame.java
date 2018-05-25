package EX1001_Exemplo03;

import java.awt.*;
import javax.swing.*;

public class PrimFrame extends JFrame
{
	public final int LARG_DEFAULT=400;
	public final int ALT_DEFAULT=300;
	
	public PrimFrame()
	{
		// Instancia um toolkit
		Toolkit tk = Toolkit.getDefaultToolkit();
		// Instancia um dimension com as dimensões da resolução do pc obtidas através do toolkit
		Dimension screenSize = tk.getScreenSize();
		//Pega width e height da resolução do pc através do dimension
		int sl = screenSize.width;
		int sa = screenSize.height;
		//Faz as contas para criar o frame na posição desejada do monitor
		int x = sl/2-LARG_DEFAULT/2;
		int y = sa/2-ALT_DEFAULT/2;
		setBounds(x,y,LARG_DEFAULT,ALT_DEFAULT);
		//Delibera o tipo de fechamento do frame
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		PrimFrame f=new PrimFrame();
		f.setTitle("Minha Primeira GUI");
		f.setVisible(true);
	}
}
