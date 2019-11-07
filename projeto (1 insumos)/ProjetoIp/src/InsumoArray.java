
public class InsumoArray implements RepositorioInsumos{
	private String [] item = new String[1];
	private int index=0;
	
	public InsumoArray (int tamanho)
	{
		this.item=new String [tamanho];
	}
	public void inserir(Insumo insumo) {
		
		index++;
		
	}
	
	public String remover(Insumo insumo) {
		
		return null;
	}
	
	public String listar() {
		
		return null;
	}

}
