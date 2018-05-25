package EX0203;

public class Socio {
	
	//Declaração de atributos
	public String nome, endereco, dtNasc;
	public int matricula;
	
	//Método Socio
	public Socio(int x) 
	{ 
	 matricula=x; 
	}
	
	//Método getMatric
	public String getMatric()
	{
		int dig1, dig2, dig3, dig4, dig5, dig6, dig7, digver;
		digver = matricula%10;
		dig7 = matricula%100;
		dig6 = matricula%1000;
		dig5 = matricula%10000;
		dig4 = matricula%100000;
		dig3 = matricula%1000000;
		dig2 = matricula%10000000;
		dig1 = matricula%100000000;
		
		dig1 = (dig1 - dig2)/10000000;
		dig2 = (dig2 - dig3)/1000000;
		dig3 = (dig3 - dig4)/100000;
		dig4 = (dig4 - dig5)/10000;
		dig5 = (dig5 - dig6)/1000;
		dig6 = (dig6 - dig7)/100;
		dig7 = (dig7 - digver)/10;
		
		return Integer.toString(dig1)+Integer.toString(dig2)+Integer.toString(dig3)+Integer.toString(dig4)+Integer.toString(dig5)+Integer.toString(dig6)+Integer.toString(dig7)+'-'+Integer.toString(digver);
			
	}
}
