package EX0601;

public class Venda 
{ 
	private Produto[] lstProd = new Produto[100]; 
	private int qtdProd[] = new int[100]; 
	private int qtdItens = 0; 

	public void setProd(Produto p, int qtd) 
	{ 
		lstProd[qtdItens] = p;
		qtdProd[qtdItens] = qtd;
		this.qtdItens++;
	} 

	public double valorTotal() 
	{ 
		int i;
		double precototal = 0;
		
		for(i=0;i<qtdItens;i++)
		{
			precototal += lstProd[i].getPrecoUnit()*qtdProd[i];
		}
		
		return precototal;
	} 
} 
