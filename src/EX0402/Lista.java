package EX0402;

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
		//retorna true se a lista estiver vazia e false caso contr�rio.
		if(this.tam == 0)
			return true;
		else
			return false;	 
	} 
	public boolean insIni(Object x) 
	{ 
		//insere o objeto x no in�cio da lista. Caso a inclus�o seja feita corretamente o m�todo deve 
		//retornar true, caso contr�rio deve retornar false. 
		No novo_no = new No(x,ini);
		this.ini = novo_no;
		if(novo_no != null)
			return true;
		else
			return false;
	} 
	public boolean insFin(Object x) 
	{ 
		//insere o objeto x no final da lista. Caso a inclus�o seja feita corretamente o m�todo deve
		//retornar true, caso contr�rio deve retornar false.
		No novo_no = new No(x,fin);
		if(novo_no != null)
			return true;
		else
			return false;
	} 
	public Object retIni() 
	{
		//retira o primeiro elemento da lista e retorna uma refer�ncia o mesmo. Caso a lista esteja 
		//vazia o m�todo deve retornar null.
		No primeiro = ini;
		if(primeiro == null)
			return null;
		else
		{
			ini = primeiro.getProx();
			primeiro.setProx(null);
			return primeiro;
		}
	} 
	public Object retFin() 
	{ 
		//retira o �ltimo elemento da lista e retorna uma refer�ncia o mesmo. Caso a lista esteja
		//vazia o m�todo deve retornar null.
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
			return ultimo;
		}
	} 
	public void posIni() 
	{ 
		//o primeiro elemento da lista passa a ser o elemento corrente (vari�vel corr). Caso a lista
		//esteja vazia corr ir� conter o valor null ap�s a execu��o desta opera��o
		corr = ini;		
		if(ini == null)
			corr = null;
	} 
	public Object prox() 
	{ 
		//retorna o objeto armazenado no n� corrente (vari�vel corr) e faz com que a vari�vel 
		//corr referencie o pr�ximo n� da lista. Caso a vari�vel corr contenha o valor null esta 
		//opera��o dever� retornar o valor null.
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