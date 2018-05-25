package EX0202;

public class Data {
	
	//Atributos inteiros dia, mes, ano
	int dia, mes, ano;
	
	//Construtor público Data
	public Data(int d,int m,int a) 
	{ 
	 dia=d; 
	 mes=m; 
	 ano=a; 
	}
	
	//Método público "get"
	//O método get(int e) deve retornar o dia (parâmetro e==1), o mês(parâmetro e==2) ou o ano 
	//(parâmetro e==3). Para outros valores retorna -1.
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
	
	//Método público "getString"
	//O método getString() deve retornar a data no formato dd/mm/aaaa (String);
	public String getString()
	{
		return Integer.toString(dia)+'/'+Integer.toString(mes)+'/'+Integer.toString(ano);
	}

}
