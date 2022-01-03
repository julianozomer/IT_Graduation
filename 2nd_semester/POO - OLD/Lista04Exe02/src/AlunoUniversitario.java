import java.time.LocalDate;

public class AlunoUniversitario extends Aluno{
	private char formaIngresso;
	private Curso curso;

//Construtor
	public AlunoUniversitario(String nome, LocalDate dataNascimento, char formaIngresso, Curso curso) {
		super(nome, dataNascimento);
		this.setFormaIngresso(formaIngresso);
		this.setCurso(curso);
	}

//Destrutor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de AlunoUniversit�rio em a��o - " + this.getNome());
		super.finalize();
	}

	public char getFormaIngresso() {
		return formaIngresso;
	}
	
	public String getFormaIngressoExtenso() {
		switch (this.formaIngresso) {
			case 'V': return "Vestibular";
			case 'E': return "Enem";
			case 'S': return "Seletivo Especial";
			case 'T': return "Transf.Externa";
			case 'I': return "Transf.Interna";
			default: return "inv�lida";
		}
	}

	public void setFormaIngresso(char formaIngresso) {
		//if ("VESTI".contains(String.valueOf(formaIngresso))
		if (formaIngresso == 'V' || formaIngresso == 'E' || formaIngresso == 'S'
			|| formaIngresso == 'T' || formaIngresso == 'I'){
				this.formaIngresso = formaIngresso;
			}
			else {
				throw new IllegalArgumentException("Forma de ingresso inv�lida");
			}
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		if (curso != null) {
			this.curso = curso;
		}
		else {
			throw new IllegalArgumentException("Aluno deve estar matriculado em algum curso");
		}
	}

	public String mostra() {
//Jo�o Carlos � aluno universit�rio do curso de SIS � Sistemas de Informa��o, ingressando por ENEM.
		return this.getNome() + " � aluno universit�rio do curso de " + this.curso.getSigla() 
					+ " - "+this.curso.getNome()+ ", ingressando por "
					+ this.getFormaIngressoExtenso();
	}

}