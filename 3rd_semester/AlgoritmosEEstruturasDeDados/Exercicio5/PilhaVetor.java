import java.util.Arrays;

public class PilhaVetor<T> implements Pilha<T> {
	private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;

    }

    public void push(T info) {
        
        if(tamanho == limite) {
            throw new PilhaCheiaException();
        }

        this.info[tamanho] = info;
        tamanho++;
    }  

    public T pop() {
    	
        T valor = peek();
        info[tamanho - 1] = null;
        tamanho--;
        
        return valor;
    }

    public T peek() {
       
        if(estaVazia()) {
            throw new PilhaVaziaException();
       }
        
       return info[tamanho-1];
       
    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public void liberar() {
    	
    	//1opcao
    	info = (T[]) new Object[limite];
    	tamanho = 0;
    	
    	//2opcao
    	while (!estaVazia()) {
    		pop();
    	}
    	
    	//3opcao
    	try {
    		while (true) {
    			pop();
    		}
    	} catch (PilhaVaziaException e) {
    		
    	}
    }

    @Override
    public String toString() {
    	String resultado = "";
    	
    	for (int i = tamanho - 1; i>= 0; i--) {
    		resultado += info[i].toString();
    		
    		if (i > 0) {
    			resultado = resultado + ",";
    		}
    	}
        return resultado;
    }

    public void concatenar(PilhaVetor<T> p2 ) {
    	
    	//profesor
    	for (int i = 0; i < p2.tamanho; i++) {
    		this.push(p2.info[i]);
    	}
    	
    }   
}
