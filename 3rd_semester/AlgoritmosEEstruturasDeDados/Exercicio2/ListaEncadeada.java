public class ListaEncadeada<T> {
	
	private NoLista<T> primeiro;

	public ListaEncadeada() {
		primeiro = null;
	}
	
	public NoLista<T> getPrimeiro() {
		return primeiro;
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
		NoLista<T> p = primeiro;
		while (p != null) {
			if (p == info) {
				return p;
			}
			p.setProximo(p);
		}
		return null;
	}
	
	
}
