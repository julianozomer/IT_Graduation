
public class ArvoreBinaria<T> {
	
	private NoArvoreBinaria<T> raiz;
	
	public ArvoreBinaria() {
		raiz = null;
	}

	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}
	
	public boolean estaVazia() {
		return (raiz == null);
	}
	public boolean pertence(T info) {
		return pertence(raiz, info);
	}
	public boolean pertence(NoArvoreBinaria<T> no, T info) {
		if(no == null) {
			return false;
		}else {
			if (no.getClass().equals(info)) {
				return true;
			}else {
				if(pertence(no.getEsquerda(), info)) {
					return true;
				}else {
					return false;
				}
			}
		}
		
	}
	public String toString() {
		return arvorePre(raiz);

	}
	public String arvorePre(NoArvoreBinaria<T> raiz) {
		if(raiz==null) {
			return "<>";
		}else {
			return "<" + arvorePre(raiz.getEsquerda()) + arvorePre(raiz.getDireita()) + ">";
		}
	}
}
