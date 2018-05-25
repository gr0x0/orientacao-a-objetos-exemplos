package EX0502;

public class EX0502 {

	public static void main(String[] args) {
		
		int i;
		
		Contribuinte[] lst = Contribuinte.listaContr();
		final Lista lista = new Lista();
		
		for(i=0;i<lst.length;i++)
		{
			if(lista.insIni(lst[i])==false)
			{
				System.out.printf("Erro de inserção\n");
				System.exit(0);
			}
		}
		
		System.out.printf("NOME                 IMPOSTO\n"); 
		System.out.printf("==================== =========\n\n");
		
		lista.posIni();
		Object cont;
		for(cont = lista.prox(); cont!=null; cont = lista.prox())
		{			
			System.out.printf("%-20s %9.2f\n", ((Contribuinte) cont).getNome(), ((Contribuinte) cont).calcImposto());
		}

	}

}
