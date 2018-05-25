package EX0602;

import java.util.Scanner;

public class EX0602 {

	public static void main(String[] args) {
		double x1, y1, x3, y3;		
		Scanner s = new Scanner(System.in);
				
		System.out.printf("Insira x de p1: ");
		x1 = s.nextDouble();
		System.out.printf("Insira y de p1: ");
		y1 = s.nextDouble();
		System.out.printf("Insira x de p3: ");
		x3 = s.nextDouble();
		System.out.printf("Insira y de p3: ");
		y3 = s.nextDouble();
		
		Ponto p1 = new Ponto(x1, y1);
		Ponto p3 = new Ponto(x3, y3);
		
		Retangulo r = Retangulo.create(p1, p3);
		
		if(r == null)
			System.out.printf("O retangulo não pode ser criado!\n");
		else
		{
			System.out.printf("Foi criado um %s\n", r.tipo());
		}
	}

}
