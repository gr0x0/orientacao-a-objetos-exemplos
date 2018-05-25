package EX0602;

public class Retangulo 
{ 
	protected Ponto[] vert;
	
	public static Retangulo create(Ponto p1, Ponto p3)
	{
		double p1x, p1y, p3x, p3y;
		double distx, disty;
		Ponto p2, p4;
		
		p1x = p1.getX();
		p1y = p1.getY();
		p3x = p3.getX();
		p3y = p3.getY();
		
		distx = p3x - p1x;
		disty = p3y - p1y;
		System.out.printf("Distancias calculadas...\n");
		
		p2 = new Ponto(p1x, p3y);
		p4 = new Ponto(p3x, p1y);
		System.out.printf("Pontos criados...\n");
		
		if(p1x == p3x || p1y == p3y)
			return null;
		else
		{
			System.out.printf("É possível criar o quadrilátero...\n");
			if(distx == disty)
			{
				System.out.printf("Quadrilátero é um quadrado...\n");
				Retangulo q = new Quadrado(p1, p2, p3, p4);
				System.out.printf("Quadrado criado. Retornando...\n");
				return q;
			}
			else
			{
				System.out.printf("Quadrilátero é um retangulo...\n");
				Retangulo r = new Retangulo(p1, p2, p3, p4);
				System.out.printf("Retângulo criado. Retornando...\n");
				return r;
			}
		}

	}
	
	Retangulo()
	{}
	
	Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4)
	{
		vert = new Ponto[4];
		vert[0] = p1;
		vert[1] = p2;
		vert[2] = p3;
		vert[3] = p4;
		System.out.printf("Valores do vetor: %f, %f, %f, %f\n", vert[0], vert[1], vert[2], vert[3]);
	}
	
	public double perimetro()
	{
		double dist1 = vert[0].dist(vert[1]);
		double dist2 = vert[1].dist(vert[2]);		
		return (2*dist1+ 2*dist2);
	}
	
	public String tipo()
	{
		return "Retangulo";
	}
}


