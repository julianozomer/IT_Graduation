
public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {
	public void setRaiz() {
		
	}
	
	public NoArvoreBinaria<T> buscar(T info){
		return buscar(info);
	}
	
	private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info){
		if (no == null) {
			return null;
		} else {
			if (no.getInfo().equals(info)) {
				return no;
			} else {
				NoArvoreBinaria<T> aux;
				
				aux = buscar(no.getDireita(), info);
				if (aux == null) {
					aux = buscar(no.getDireita(), info);
				}
				
				return aux;
			}
		}
	}
}
