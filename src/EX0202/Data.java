package EX0202;

public class Data {
	
	//Atributos inteiros dia, mes, ano
	int dia, mes, ano;
	
	//Construtor p�blico Data
	public Data(int d,int m,int a) 
	{ 
	 dia=d; 
	 mes=m; 
	 ano=a; 
	}
	
	//M�todo p�blico "get"
	//O m�todo get(int e) deve retornar o dia (par�metro e==1), o m�s(par�metro e==2) ou o ano 
	//(par�metro e==3). Para outros valores retorna -1.
	public  int get(int e)
	{
		switch(e)
		{
		case 1: return dia; 
		case 2: return mes;
		case 3: return ano;
		default: return -1;
		}
	}
	
	//M�todo p�blico "getString"
	//O m�todo getString() deve retornar a data no formato dd/mm/aaaa (String);
	public String getString()
	{
		return Integer.toString(dia)+'/'+Integer.toString(mes)+'/'+Integer.toString(ano);
	}

}
