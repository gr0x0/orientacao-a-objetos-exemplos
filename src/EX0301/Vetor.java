package EX0301;

public class Vetor 
{ 
	// variaveis 
	private double x; 
	private double y; 


//Construtor default
public Vetor()
{
	x = 0.0;
	y = 0.0;
}

//Construtor com 1 par�metro
public Vetor(double valorx)
{
	x = valorx;
	y = 0.0;
}

//Construtor com 2 par�metros
public Vetor(double valorx, double valory)
{
	x = valorx;
	y = valory;
}

//Bloco de inicializa��o 
{
	System.out.printf("x = %f, y = %f \n", x, y);
}

//M�todo soma
void soma(Vetor v)
{
	x += v.x;
	y += v.y;
}

//M�todo exibe
void exibe()
{
	System.out.printf("x = %f, y = %f \n", x, y);
}

}





