package EX0403;

public class Voo {
	
	private Assento assentos[][];
	private int nFila;
	private int nAssentos;
	
	public Voo(int nf,int na) 
	{ 
		 char as = 'A'; 
		 int i, j;
		 nFila = nf; 
		 nAssentos = na; 
		 assentos = new Assento[nf][na];
		 
		 for(i=0;i<nf;i++)
		 {
			 for(j=0;j<na;j++)
			 {
				 assentos[i][j] = new Assento(i,as);
				 as++;
			 }
			 as = 'A';
		 }
	}
	
	public boolean reserva(int f, char a)
	{
		boolean isreserved;
		int a_aux;
		
		a_aux = (int)(a - 65);
		isreserved = assentos[f][a_aux].getEstado();
		
		if(isreserved == true)
		{
			assentos[f][a_aux].reserva();
			return true;
		}
		else
			return false;
			
	}
	
	
	public void imprimeMapa()
	{
		char aux = 'A';
		int iaux, jaux;
		
		System.out.printf("   ");
		
		for(iaux=0;iaux<nAssentos;iaux++)
		{
			System.out.printf("%c ", aux);
			aux++;
		}
		
		for(iaux=0;iaux<nFila;iaux++)
		{
			System.out.printf("\n%2d ", iaux+1);
			for(jaux=0;jaux<nAssentos;jaux++)
			{
				if(assentos[iaux][jaux].getEstado()==true)
					System.out.printf("L ");
				else
					System.out.printf("X ");
			}
		}
	}

}
