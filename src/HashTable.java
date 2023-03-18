
public class HashTable {
	int operador;
	Lista[] vetor;
	
	public HashTable(int operador) {
		this.operador=operador;
		vetor = new Lista[operador];
		for(int i = 0; i < operador; i++) {
			vetor[i] = new Lista();
		}
	}
	public void inserir(Contato contato) {
		int key = contato.getNome().length() % 5;
		vetor[key].inserir(contato);
	}
	public Contato buscar(String nome) {
		int key = nome.length() % 5;
		return vetor[key].buscar(nome);
	}
	public void excluir(String nome) {
		int key = nome.length() % 5;
		vetor[key].excluir(nome);
	}
	public String toString() {
		String r = "";
		for(int i = 0; i<operador;i++) {
			r += ""+i+":";
			r += vetor[i%operador] + "\n";
		}
		return r;
	}
	
	
	
} 
