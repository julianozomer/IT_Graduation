import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno {
	private int ano;

	// construtor
	public AlunoEnsinoMedio(String nome, LocalDate date, int ano) {
		super(nome, date);  // fazendo a chamada ao construtor da superclasse (Aluno)
		this.setAno(ano);
	}

	// destrutor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("destrutor de AlunoEnsinoMedio em a��o - "+this.getNome());
		super.finalize();
	}	
	
	// m�todos
	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		if (ano >0 && ano < 4) {
			this.ano = ano;
		}
		else {
			throw new IllegalArgumentException("Ano inv�lido. Deve estar entre 1 e 3.");
		}
	}

	@Override
	public String mostra() {
		// Carlos Pinheiro est� cursando o 1o ano do ensino m�dio e tem 14 anos.
		return this.getNome()+" est� cursando o "+this.ano
				+"o ano do ensino m�dio e tem "+this.getIdade()+" anos.";
	}

}