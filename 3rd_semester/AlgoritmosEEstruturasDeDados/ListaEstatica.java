
public class ListaEstatica {
	private int tamanho;
	private int[] info;
	
	public ListaEstatica() {
		info = new int[10];
		tamanho = 0;
	}
	
	public void redimencionar() {
		int[] novo = new int[info.length + 10];
		
		for (int i = 0; i<info.length; i++) {
			novo[i] = info[i];
		}
		
		info = novo;
		
	}
	
	public void inserir(int valor) {
		if (tamanho == info.length) {
			this.redimencionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	public void exibir() {
		for (int i = 0; i<info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	public int buscar(int valor) {
		for (int i = 0; i<tamanho; i++) {
			if (info[i] == valor) {
				return i;
			} 
		}
		
		return -1;
	}
	
	
	public void retirar(int valor) {
		int localizacao = buscar(valor);
		
		if (localizacao >= 0) {
			for (int i = localizacao + 1; i < tamanho; i++) {
				info[i-1] = info[i];
			}
		}
		
		tamanho--;
	}
	
	public void liberar() {
		info = new int[10];
		
		tamanho = 0;
	}
	
	public int obterElemento(int posicao) {
		if (posicao >= 0 && (posicao < tamanho)) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public boolean estaVazia() {
		if (tamanho > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public int getTamanho() {
		return info.length;
	}
	
	public String toString(){
		String resultado = "";
		
		for (int i = 0; i<tamanho; i++) {
			if (i > 0) {
				resultado += ",";
				resultado += info[i];
			}
		}
		
		return resultado;
	}
	
}
