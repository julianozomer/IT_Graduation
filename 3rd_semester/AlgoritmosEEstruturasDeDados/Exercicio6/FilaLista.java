
public class FilaLista<T> implements Fila<T> {
	
	private ListaEncadeada<T> lista;
	
	public FilaLista() {
		lista = new ListaEncadeada<>();
	}

	@Override
	public void inserir(T valor) {
		// TODO Auto-generated method stub
		lista.inserirNoFinal(valor);
	}

	@Override
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return lista.estaVazia();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (estaVazia()) {
			throw new FilaVaziaException();
		}
		return lista.getPrimeiro().getInfo();
	}

	@Override
	public T retirar() {
		// TODO Auto-generated method stub
		T valor;
		valor = peek();
		lista.retirar(valor);
		return valor;
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		lista = new ListaEncadeada<>();
	}

}
