package EX0303;

public class Matematica {
	
	//método pi
	public static double pi(int n)
	{
		double valPi = 1.0;		
		
		for(int i=2; i<=n; i++)
		{
			valPi += (1.0/(2*i-1))*Math.pow(-1,i+1);
		}
		
		return 4*valPi;
	}

}
