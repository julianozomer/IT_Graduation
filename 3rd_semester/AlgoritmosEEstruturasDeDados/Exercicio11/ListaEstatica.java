
public class ListaEstatica<T> extends ListaAbstract<T> {
	
	public void inserir(T valor) {
		T[] info = getInfo();
		if (getTamanho() == info.length) {
			this.redimencionar();
		}
		info = getInfo();
		info[getTamanho()] = valor;
		setTamanho(getTamanho() + 1);
	}

	public int buscar(T valor) {
		for (int i = 0; i<getTamanho(); i++) {
			if (getInfo()[i].equals(valor)) {
				return i;
			} 
		}
		
		return -1;
	}
}
