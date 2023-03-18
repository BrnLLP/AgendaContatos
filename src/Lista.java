
public class Lista {
	No inicio;
	No fim;
	int tamanho;
	
	public void inserir(Contato info) {
		No no = new No();
		if(this.inicio == null && this.fim == null) {
			no.setInfo(info);
			this.inicio=no;
			this.fim=no;
	}
		else {
			no.setInfo(info);
			this.fim.setProx(no);
			this.fim=no;
			
		}
		this.tamanho++;
	}
	public Contato buscar(String nome) {
		No no = inicio;
		while(no != null) {
			if(no.getInfo().getNome()==nome) {
				return no.getInfo();
			}
			no=no.getProx();
		}
		return null;
	}
	public void excluir(String nome) {
		No anterior = null;
		No atual = this.inicio;
		for(int i=0; i<this.tamanho;i++) {
			if(atual.getInfo().getNome().equalsIgnoreCase(nome)){
				if(this.tamanho == 1) {
					this.inicio=null;
					this.fim=null;
				}
				else if(atual==inicio){
					this.inicio=atual.getProx();
					atual.setProx(null);
				}
				else if(atual==fim) {
					this.fim=anterior;
					anterior.setProx(null);
				}
				else {
					anterior.setProx(atual.getProx());
					atual=null;
				}
				this.tamanho--;
				break;
				
	}
			anterior=atual;
			atual=atual.getProx();
		}
	}
	public String toString() {
		String r = "";
		No no = inicio;
		while(no != null) {
			r += no.getInfo() + " ";
			no = no.getProx();
		}
		return r;
	}

	
}
