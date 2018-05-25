package EX0502;

class No 
{ 
	private Object elem; 
	private No prox; 

	public No(Object e, No p) 
	{
		elem=e;
		prox=p; 
	}

	public Object getElem() 
	{ 
		return this.elem;
	}

	public No getProx() 
	{ 
		return this.prox;
	}

	public void setProx(No o) 
	{ 
		this.prox = o;
	} 
}

public class Lista 
{ 
	private int tam=0; 
	private No ini=null; 
	private No fin=null; 
	private No corr=null; 
	
	public boolean vazio() 
	{ 
		//retorna true se a lista estiver vazia e false caso contrário.
		if(this.ini == null)
			return true;
		else
			return false;	 
	} 
	public boolean insIni(Object x) 
	{ 
		//insere o objeto x no início da lista. Caso a inclusão seja feita corretamente o método deve 
		//retornar true, caso contrário deve retornar false. 
		No novo_no = new No(x,ini);
		this.ini = novo_no;
		if(novo_no != null)
		{
			this.tam++;
			return true;
		}
		else
			return false;
	} 
	public boolean insFin(Object x) 
	{ 
		//insere o objeto x no final da lista. Caso a inclusão seja feita corretamente o método deve
		//retornar true, caso contrário deve retornar false.
		No novo_no = new No(x,null);
		if(this.fin != null)
		{
			this.fin.setProx(novo_no);
		}
		if(novo_no != null)
		{
			this.fin = novo_no;
			this.tam++;
			return true;
		}
		else
			return false;
	} 
	public Object retIni() 
	{
		//retira o primeiro elemento da lista e retorna uma referência o mesmo. Caso a lista esteja 
		//vazia o método deve retornar null.
		if(this.tam == 0)
		{
			System.out.printf("ninguem na lista");
			return null;
		}
		No primeiro = this.ini;		
		this.ini = primeiro.getProx();
		primeiro.setProx(null);
		this.tam--;
		return primeiro;
	} 
	public Object retFin() 
	{ 
		//retira o último elemento da lista e retorna uma referência o mesmo. Caso a lista esteja
		//vazia o método deve retornar null.
		No aux = null, ultimo = fin;
		if(ultimo == null)
			return null;
		else
		{
			for(ultimo = ini; ultimo!=null; ultimo = ultimo.getProx())
			{
				aux = ultimo;
			}
			aux.setProx(null);
			this.tam--;
			return ultimo;
		}
	} 
	public void posIni() 
	{ 
		//o primeiro elemento da lista passa a ser o elemento corrente (variável corr). Caso a lista
		//esteja vazia corr irá conter o valor null após a execução desta operação
		corr = ini;		
		if(ini == null)
			corr = null;
	} 
	public Object prox() 
	{ 
		//retorna o objeto armazenado no nó corrente (variável corr) e faz com que a variável 
		//corr referencie o próximo nó da lista. Caso a variável corr contenha o valor null esta 
		//operação deverá retornar o valor null.
		Object elemento;
		if(corr == null)
			return null;
		else
		{
			elemento = corr.getElem();
			corr = corr.getProx();
			return elemento;
		}
	} 
}