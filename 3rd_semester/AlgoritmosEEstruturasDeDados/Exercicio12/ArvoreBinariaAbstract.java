
public abstract class ArvoreBinariaAbstract<T> {
private NoArvoreBinaria<T> raiz;
	
	public ArvoreBinariaAbstract() {
		raiz = null;
	}

	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	protected void setRaiz(NoArvoreBinaria<T> raiz) {
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
			if (no.getDireita().equals(info)) {
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
	
	public boolean isDegenerada() {
		NoArvoreBinaria<T> p = getRaiz();
		
		if (p == null) {
			return false;
		} 
		
		if((p.getEsquerda() == null && p.getDireita() == null) || (p.getEsquerda() != null && p.getDireita() != null)) {
			return false;
		} else {
			while (p != null) {
				if (p.getEsquerda() != null) {
					p = p.getEsquerda();
					
					if(p.getEsquerda() != null && p.getDireita() != null) {
						return false;
					}
				} else {
					if (p.getDireita() != null) {
						p = p.getDireita();
						if(p.getEsquerda() != null && p.getDireita() != null) {
							return false;
						}
					}
				}
			}
			return true;
		}
	
	}
	
	public abstract NoArvoreBinaria<T> buscar(T info);
}
