package EX0602;

public class Quadrado extends Retangulo 
{ 	
	Quadrado (Ponto p1, Ponto p2, Ponto p3, Ponto p4)
	{
		vert = new Ponto[4];
		vert[0] = p1;
		vert[1] = p2;
		vert[2] = p3;
		vert[3] = p4;
	} 
	
	public double perimetro()
	{
		double dist1 = vert[0].dist(vert[1]);
		double dist2 = vert[1].dist(vert[2]);		
		return (2*dist1+ 2*dist2);
	}
	
	public String tipo()
	{
		return "Quadrado";
	}
} 
