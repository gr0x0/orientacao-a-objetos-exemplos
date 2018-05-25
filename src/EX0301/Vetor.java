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

//Construtor com 1 parâmetro
public Vetor(double valorx)
{
	x = valorx;
	y = 0.0;
}

//Construtor com 2 parâmetros
public Vetor(double valorx, double valory)
{
	x = valorx;
	y = valory;
}

//Bloco de inicialização 
{
	System.out.printf("x = %f, y = %f \n", x, y);
}

//Método soma
void soma(Vetor v)
{
	x += v.x;
	y += v.y;
}

//Método exibe
void exibe()
{
	System.out.printf("x = %f, y = %f \n", x, y);
}

}





