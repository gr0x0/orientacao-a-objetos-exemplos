package EX0502;

public class PFisica extends Contribuinte 
{ 
	protected String cpf; 
	
	public PFisica(String n,double r,String c) 
	{ 
		this.nome = n;
		this.rendaBrt = r;
		this.cpf = c;
	}
	
	public double calcImposto() 
	{ 
		if(this.rendaBrt<=1400.00)
			return (double)(0.0);
		if(this.rendaBrt>=1400.01 && this.rendaBrt<=2100.00)
			return (double)(0.1*this.rendaBrt);
		if(this.rendaBrt>=2100.01 && this.rendaBrt<=2800.00)
			return (double)(0.15*this.rendaBrt);
		if(this.rendaBrt>=2800.01 && this.rendaBrt<=3600.00)
			return (double)(0.25*this.rendaBrt);
		return (double)(0.3*this.rendaBrt);
	} 
} 
