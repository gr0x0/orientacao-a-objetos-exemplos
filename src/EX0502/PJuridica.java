package EX0502;

public class PJuridica extends Contribuinte 
{ 
	protected String cnpj; 
	public PJuridica(String n,double r,String c) 
	{ 
		this.nome = n;
		this.rendaBrt = r;
		this.cnpj = c;
	} 

	public double calcImposto() 
	{ 
		return 0.1*this.rendaBrt;
	} 
}
