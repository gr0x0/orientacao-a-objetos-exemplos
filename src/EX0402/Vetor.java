package EX0402;

public class Vetor {
	
	private double x,y; 
	 public Vetor(double x,double y) 
	 {
		 this.x=x;
		 this.y=y; 
	 } 
	 private Vetor() 
	 { 
	 } 
	 public Vetor clone() 
	 { 
		 Vetor novovet = new Vetor(this.x, this.y);
		 return novovet;
	 } 
	 public String toString() 
	 { 
		 return String.format("( x = %.2f , y = %.2f )", this.x, this.y);
	 }
	 public Vetor criadefault(double x, double y)
	 {
		 Vetor vet = new Vetor();
		 vet.x = x;
		 vet.y = y;
		 return vet;
	 }
}
