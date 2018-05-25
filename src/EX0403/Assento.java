package EX0403;

public class Assento {
	
	private int fila; //fila a qual o assento pertence.
	private char assento; //coluna a qual o assento pertence.
	private boolean livre=true; //status do assento (true – livre e false – ocupado)
	
	public Assento(int f, char a)
	{
		this.fila = f;
		this.assento = a;
	}
	
	public boolean getEstado()
	{
		return livre;
	}
	
	public void reserva()
	{
		if(this.livre==true)
			this.livre = false;
	}

}
