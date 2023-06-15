
public class ListaOrdenada<T extends Comparable<T>> extends ListaAbstract<T> {

	public void inserir(T valor) {
		T[] info = getInfo();
		
		//redimensionar caso falte espaço
		if (info.length == getTamanho()) {
			redimencionar();
		}
		
		//procurar onde devo posicionar o elemento
		int posicao = procurarPosicaoInclusao(valor);
		
		if (posicao < getTamanho()) {
			deslocarDados(posicao);
		}
		
		info = getInfo();
		info[posicao] = valor;
		
		setTamanho(getTamanho() +1);
		
		
	}

	public int buscar(T valor) {
		Object[] info = getInfo();
		
		int inicio = 0;
		int fim = getTamanho() - 1;
		int meio;
		
		while(inicio <= fim) {
			meio = (inicio + fim)/2;
			
			int comparacao = valor.compareTo((T)info[meio]);
			if (comparacao < 0) {
				fim = meio - 1;
			} else {
				if (comparacao > 0)
					inicio = meio + 1;
				else
					return meio;
			}
		}
		return -1;
	}

	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private int procurarPosicaoInclusao(T dadoAdicionar) {
		Object[] info = getInfo();
		int i;
		
		for (i = 0; i <= getTamanho(); i++) {
			//if (info[i] > itemAdicionar)
			if (((Comparable)info[i]).compareTo(dadoAdicionar) > 0) {
				break;
			}
		}
		return i;
	}
	
	private void deslocarDados(int posicao) {
		Object[] info = getInfo();
		for (int i = getTamanho() -1; i >= posicao ; i--) {
			info[i+1] = info[i];
		}
	}

}
