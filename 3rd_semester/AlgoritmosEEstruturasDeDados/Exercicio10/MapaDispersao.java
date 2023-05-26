
public class MapaDispersao<T> {
	private ListaEncadeada<NoMapa<T>> info[];
	
	public MapaDispersao(int tamanho){
		info = new ListaEncadeada[tamanho];
	}
	
	private int calcularHash(int chave) {
		int tamanho = info.length;
		
		return chave % tamanho;
	}
	
	
}
