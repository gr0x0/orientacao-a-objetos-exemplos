package EX1001_Exemplo04;

import java.awt.Color;
import javax.swing.*;

import EX1001_Exemplo02.PrimFrame;
import java.awt.color.*;

public class EX07Frame extends JFrame
{
	//Inicializa as vari�veis de bot�es com JButton
	JButton b1 = new JButton("Bot�o 1");
	JButton b2 = new JButton("Bot�o 2");
	//Cria o JPanel
	JPanel p = new JPanel();
	
	public EX07Frame(String s)
	{
		//Sabendo que o construtor de JPanel recebe ou n�o o t�tulo do frame, delegamos a
		//constru��o do frame EX07Frame para ele com super.
		super(s);
		//Adicionamos os bot�es criados com .add.
		p.add(b1);
		p.add(b2);
		//Adicionamos a cor de background com .setBackground (PS: n�o esquecer de importar o
		//java.awt.color.* que cont�m as constantes de cores!)
		p.setBackground(Color.BLACK);
		//Adicionamos tudo isso definido no Content Pane
		getContentPane().add(p);
		//Definimos o tamanho do frame.
		setSize(400,300);
	}
	
	public static void main(String[] args)
	{
		EX07Frame f = new EX07Frame("Frame de teste com bot�es e fundo preto");
		f.setVisible(true);
	}
}
