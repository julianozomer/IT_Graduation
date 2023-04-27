
public class FilaVetor<T> implements Fila<T> {
	private T[] info;
	private int limite;
	private int tamanho;
	private int inicio;
	
	public FilaVetor(int limit){
		info = (T[]) new FilaVetor[limit];
		this.limite = limit;
		this.tamanho = 0;
		this.inicio = 0;
	}

	@Override
	public void inserir(T valor) {
		// TODO Auto-generated method stub
		if (tamanho == limite) {
			throw new FilaCheiaException();
		}
		
		int posicaoInserir = (inicio + tamanho) % limite;
		this.info[posicaoInserir] = valor;
		tamanho++;
		
	}

	@Override
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		
		return(tamanho == 0);
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (estaVazia()) {
			throw new FilaVaziaException();
		}
		
		return info[inicio];
	}

	@Override
	public T retirar() {
		// TODO Auto-generated method stub
		T valor = this.peek();
		info[inicio] = null;
		
		inicio = (inicio + 1) % limite;
		tamanho--;
		
		return valor;
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		info = (T[]) new FilaVetor[limite];
		tamanho = 0;
		
	}
	
	public int getLimite() {
		return limite;
	}

	public int getTamanho() {
		return tamanho;
	}

	public int getInicio() {
		return inicio;
	}
	
	public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
		FilaVetor<T> f3 =  new FilaVetor(this.limite + f2.getLimite());
		
		int indice = inicio;
		for (int i = 0; i < tamanho; i++) {
			T valor = info[indice];
			f3.inserir(valor);
			
			indice = (indice + 1) % limite;
		}
		
		indice = f2.getInicio();
		for (int i = 0; i < f2.getTamanho(); i++) {
			T valor = f2.info[indice];
			f3.inserir(valor);
			
			indice = (indice + 1) % f2.limite;
		}
		
		//Não preciso usar os getters porque está tudo na mesma classe
		return f3;
	}
	
	public String toString() {
		String retorno = "";
		
		int indice = inicio;
		
		for (int i = 0; i < tamanho; i++) {
			if(i > 0) {
				retorno += ",";
			}
			retorno += info[indice];
			indice = (indice + 1) % limite;
		}
		return retorno;
	}
	
	
}


