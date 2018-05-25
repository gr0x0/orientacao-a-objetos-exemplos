package EX0501;

public class EX0501 
{ 
	public static void main(String[] args) 
	{ 
		int i;
		Contribuinte[] lst; 		
		lst = Contribuinte.listaContr();
		
		System.out.printf("NOME                 IMPOSTO\n"); 
		System.out.printf("==================== =========\n\n"); 
		
		for(i=0;i<lst.length;i++)
		{
			System.out.printf("%-20s %9.2f\n", lst[i].getNome(), lst[i].calcImposto()); 
		} 
	} 
}
