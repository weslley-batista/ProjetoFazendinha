import java.util.*;


public abstract class Gado{
	private String brinco;
	private double peso;
	private char genero;
	private String raca;
	private boolean vacina;
	private int anoNascimento;
	public double vender () {
		
	}
}

class GadoCorte extends Gado {
	String nome;
}

interface RepositorioGado {
	void inserir ();
	void remover ();
}



class CadastroGado {
	public void alimentar (Gado g) {
		if (g instanceof Gado) {
			
		} else {
			
		}
	}
}
