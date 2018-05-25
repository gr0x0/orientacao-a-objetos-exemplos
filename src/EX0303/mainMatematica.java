package EX0303;

public class mainMatematica {

	public static void main(String[] args) {
		
		double valorpi;
		int iteracoes = 200000000;
		
		valorpi = Matematica.pi(iteracoes);
		System.out.printf("Valor de pi com %d = %f", iteracoes, valorpi);

	}

}
