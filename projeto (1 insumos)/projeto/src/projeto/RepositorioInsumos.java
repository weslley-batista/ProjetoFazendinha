package projeto;

public interface RepositorioInsumos {
	void inserir(String item, int quantitem);
	String remover(String item);	// Enviar mensagem de remo��o realizada
	String listar();				// Ver o que existe no estoque
}
