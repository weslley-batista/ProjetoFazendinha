package projeto;

class racaoArray implements RepositorioInsumos {
	String [] item = new String[tamanhoArray];
	
	@Override
	public void inserir(String item, int quantitem) {
		for(int i=0; i<tamanhoArray; i++)
		{
			item[i] = item;
		}
	}

	@Override
	public String remover(String item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listar() {
		// TODO Auto-generated method stub
		return null;
	}
}



