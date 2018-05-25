package EX0602;

public class Ponto {

	private double x, y;

	public Ponto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double dist(Ponto p)
	{
		return Math.sqrt(Math.pow(this.x - p.x,2)*Math.pow(this.y - p.y,2));
	}

}
