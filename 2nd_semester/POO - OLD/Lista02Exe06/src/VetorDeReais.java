
public class VetorDeReais {
	private double[] vetor;
	
	public VetorDeReais(int tamanho) {
		vetor = new double[tamanho];
	}
	
	
	//item a)
	public void setValor(double valor, int posicao) {
		vetor[posicao] = valor;
	}
	
	//item b)
	public int quantosPares() {
		int qtdPares = 0;
		
		for (int i=0; i < this.vetor.length; i++) {
			if ((int)this.vetor[i] % 2 == 0) {   //transforma o valor double do vetor em int pra considerar a parte inteira do numero conforme enunciado.
				qtdPares++;
			}
		}
		
		return qtdPares;
	}
	
	//item c)
	public VetorDeReais divide(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return null;
		}
		
		VetorDeReais novo = new VetorDeReais(this.getTamanho());
		double valor;
		
		for (int i=0; i < this.vetor.length; i++) {
		  //valor = this.vetor[i] / outro.vetor[i];    // quebra o encapsulamento ao acessar diretamente o atributo do outro objeto.
			valor = this.vetor[i] / outro.getValor(i); // característica Orientação a Objetos
			novo.setValor(valor, i);
		}
		return novo;
	}
	
	//item d)
	public double multiplica(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return Double.NaN;
		}
		
		double m = 0;
		int j = this.vetor.length;
		
		for (int i = 0; i < this.vetor.length; i++) {
			j--;
			m += this.vetor[i] * outro.getValor(j);
		}
		
		return m;
	}
	
	
	//item e)
	public void inverte() {
		double temporaria;
		int cont = this.vetor.length;
		
		for (int i = 0; i < (this.vetor.length / 2); i++) {
			cont--;
			temporaria = this.vetor[cont];
			this.vetor[cont] = this.vetor[i];
			this.vetor[i] = temporaria;
		}
	}
	
	//item f)
	public double maiorDiferencaConsecutivos() {
		double diferenca;
		double maiorDiferenca = 0;
		
		for (int i = 0; i < this.vetor.length - 1; i++) { //vetor.length -1 pra não somar a ultima posição com nada.
			diferenca = Math.abs(this.vetor[i] - this.vetor[i + 1]);
			
			if (diferenca > maiorDiferenca) {
				maiorDiferenca = diferenca;
			}		
		}
		
		return maiorDiferenca;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getTamanho() {
		return this.vetor.length;
	}
	
	public double getValor(int posicao) {
		return this.vetor[posicao];
	}
	
	public String exibir() {
		String str = "[";
		for (int i=0; i < this.vetor.length; i++) {
			str = str + this.vetor[i]+", ";
		}
		str +="]";
		
		return str;
	}
	
	
	
}















