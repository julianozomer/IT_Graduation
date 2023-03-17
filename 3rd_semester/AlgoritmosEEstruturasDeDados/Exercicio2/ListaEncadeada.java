public class ListaEncadeada<T> {
	
	private NoLista<T> primeiro;

	public ListaEncadeada() {
		primeiro = null;
	}
	
	public NoLista<T> getPrimeiro() {
		return this.primeiro;
	}
	
	public void inserir(T info) {
		primeiro = new NoLista<T>(info, primeiro);
	}
	
	public boolean estaVazia() {
		if (primeiro != null) {
			return false;
		} else {
			return true;
		}
	}
	
	public NoLista<T> buscar(T info){
		NoLista<T> p = getPrimeiro();
		while (p != null) {
			if (p.getInfo().equals(info)) {
				return p;
			}
			p.getProximo();
		}
		return null;
	}
	
	public void retirar(T info) {
		NoLista<T> anterior = null;
		NoLista<T> p = getPrimeiro();
		
		while ((p != null) && (!p.getInfo().equals(info))) {
			anterior = p;
			p = p.getProximo();
		}
		
		if (p != null) {
			if (p == primeiro) {
				primeiro = primeiro.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
		}
	}
	
	public int obterComprimento() {
		int qtdNos = 0;
		
		NoLista<T> p = getPrimeiro();
		
		while(p != null) {
			qtdNos++;
			p = p.getProximo();
		}
		
		return qtdNos;
	}
	
	public NoLista<T> obterNo(int idx){
		if (idx < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		NoLista<T> p = getPrimeiro();
		
		while ((p != null) && (idx > 0)) {
			idx--;
			p = p.getProximo();
		}
		
		if (p == null) {
			throw new IndexOutOfBoundsException();
		}
		
		return p;
	}
	
	public String toString() {
		NoLista<T> p = getPrimeiro();
		String resultado = "";
		
		while (p != null) {
			if (p != getPrimeiro()) {
				resultado += ",";
				
				resultado += p.getInfo().toString();
				p = p.getProximo();
			}
		}
		
		return resultado;
	}
	
	
}
