package EX0402;

public class EX0402 {

	public static void main(String[] args) {
		
		//Inicializando 3 vetores
		final Vetor vet1 = new Vetor(1.00 , 2.00);
		final Vetor vet2 = vet1.clone();
		final Vetor vet3 = vet1.clone();
		
		//System.out.printf("%s\n", vet1.toString());
		//System.out.printf("%s\n", vet2.toString());
		//System.out.printf("%s\n", vet3.toString());
		
		//Inicializando a lista lis
		final Lista lis = new Lista();
		
		//Inserindo os 3 vetores em lis
		if(lis.insIni(vet1)==false)
		{
			System.out.printf("Erro de inserção\n");
			System.exit(0);
		}		
		if(lis.insIni(vet2)==false)
		{
			System.out.printf("Erro de inserção\n");
			System.exit(0);
		}
		if(lis.insIni(vet3)==false)
		{
			System.out.printf("Erro de inserção\n");
			System.exit(0);
		}
		
		//Posicionando Corr no início da lista
		lis.posIni();
		
		//loop para imprimir toda a lista
		Object vetaux;
		for(vetaux = lis.prox(); vetaux!=null; vetaux = lis.prox())
		{
			System.out.printf("Elemento armazenado: %s\n", vetaux.toString());
		}	
	}

}
