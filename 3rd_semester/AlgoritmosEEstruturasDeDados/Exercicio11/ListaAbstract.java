
public abstract class ListaAbstract<T> {
	private int tamanho;
	private T[] info;
	
	public ListaAbstract() {
		info = (T[]) new Object[10];
		tamanho = 0;
	}
	
	
	
	protected T[] getInfo() {
		return info;
	}



	protected void setInfo(T[] info) {
		this.info = info;
	}


	protected void redimencionar() {
		T[] novo = (T[]) new Object[info.length + 10];
		
		for (int i = 0; i<info.length; i++) {
			novo[i] = info[i];
		}
		
		info = novo;
		
	}
	
	public abstract void inserir(T valor);
	
	public abstract int buscar(T valor);
	
	
	
	public void exibir() {
		for (int i = 0; i<info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	
	public void retirar(T valor) {
		int localizacao = buscar(valor);
		
		if (localizacao >= 0) {
			for (int i = localizacao + 1; i < tamanho; i++) {
				info[i-1] = info[i];
			}
		}
		
		tamanho--;
		info[tamanho] = null;
	}
	
	public void liberar() {
		info = (T[]) new Object[10];
		
		tamanho = 0;
	}
	
	public T obterElemento(int posicao) {
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
	
	protected int getTamanho() {
		return info.length;
	}
	
	protected void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String toString(){
		String resultado = "";
		
		for (int i = 0; i<tamanho; i++) {
			if (i > 0) {
				resultado += ",";
			}
			resultado += info[i].toString();
		}
		
		return resultado;
	}
	
	public void inverter() {

        T aux;

        // 3, 4, 1, 2, 8
         for(int i = 0; i <= tamanho/2; i++) {
             //var auxiliar p receber valor do vetor na ultima posição (5º)
             aux = info[tamanho - i - 1];
             // exemplo 6 - 0 - 1 = 5, ou seja, a ultima posicao do vetor info recebe oq tava no i = posicao 0 
             info[tamanho - i - 1] = info[i];
             // feito isso, agora a posicao 0 recebe oq tava no ultima pso, salva pelo aux
             info[i] = aux;
         }
	}
	
}
