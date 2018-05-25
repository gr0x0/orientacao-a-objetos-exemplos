package EX0702;

import EX0502.*;

public class Pilha {

	Lista lis = new Lista();
		
	public boolean push(Object x)
	{
		return lis.insFin(x);
	}
	public Object pop()
	{
		return lis.retIni();
	}
	public boolean empty()
	{
		return lis.vazio();
	}

}
