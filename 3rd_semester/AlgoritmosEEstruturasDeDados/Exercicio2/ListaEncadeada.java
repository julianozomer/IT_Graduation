public class ListaEncadeada<T> {
	
	private NoLista primeiro;

	public ListaEncadeada() {
		ListaEncadeada[] lista = (ListaEncadeada[]) new Object ListaEncadeada();
		primeiro = null;
	}
	
	public NoLista getPrimeiro() {
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
		for 
	}
	
	
}
