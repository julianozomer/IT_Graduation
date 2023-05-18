
public class NoArvore<T> {
	
	private T info;
	private NoArvore<T> primeiro;
	private NoArvore<T> proximo;
	
	public NoArvore(T info) {
		this.info= info;
		primeiro = null;
		proximo = null;
	}
	
	public T getInfo() {
		return info;
	}
	
	public void inserirFilho(NoArvore<T> sa) {
		sa.setProximo(this.primeiro);
		this.setPrimeiro(sa);
	}
	
	public void setInfo(T info) {
		this.info = info;
	}

	public NoArvore<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoArvore<T> primeiro) {
		this.primeiro = primeiro;
	}

	public NoArvore<T> getProximo() {
		return proximo;
	}

	public void setProximo(NoArvore<T> proximo) {
		this.proximo = proximo;
	}
	
	
	
}
