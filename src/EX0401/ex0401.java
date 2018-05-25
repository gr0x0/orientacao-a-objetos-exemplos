package EX0401;

public class ex0401 {

	public static void main(String[] args) {
		Vetor vet1 = new Vetor(1.35, 3.406);
		Vetor vet2 = vet1.criadefault(5.02, 0.09);
		Vetor vet3 = vet1.clone();
		
		System.out.printf("vet1 = %s\n", vet1.toString());
		System.out.printf("vet2 = %s\n", vet2.toString());
		System.out.printf("vet3 = %s\n", vet3.toString());

	}

}

