// Juliano Zomer Filho

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Telefonia {
	private String nome;
	private String tipoLinha;
	private String internet;
	private String atividade;
	private String endereco;
	private LocalDate dataInstalacao;
	private int qtdOcorrencias;
	private String telefone;
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoLinha() {
		return tipoLinha;
	}
	public void setTipoLinha(String tipoLinha) {
		this.tipoLinha = tipoLinha;
	}
	public String getInternet() {
		return internet;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}
	public void setDataInstalacao(LocalDate dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}
	public int getQtdOcorrencias() {
		return qtdOcorrencias;
	}
	public void setQtdOcorrencias(int qtdOcorrencias) {
		this.qtdOcorrencias = qtdOcorrencias;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String numero) {
		this.telefone = numero;
	}
	
	public double custoFixo() {
		double valor = 0;
		String dataComparativa = "01/01/2019";
		LocalDate data = LocalDate.parse(dataComparativa, formatador);
		
		if (this.getTipoLinha().equals("Residencial")) {
			valor = 15;
		}
		
		if (this.getTipoLinha().equals("Comercial")) {
			if (this.getDataInstalacao().isBefore(data)) {
				valor = 25;
			} else {
				valor = 37.50;
			}
		}
		
		if (this.getTipoLinha().equals("Especializada")) {
			if (this.getQtdOcorrencias() > 0 && this.getQtdOcorrencias() <= 1000) {
				valor = 50;
			}
			
			if (this.getQtdOcorrencias() >= 1001 && this.getQtdOcorrencias() <= 5000) {
				valor = 67.80;
			}
			
			if (this.getQtdOcorrencias() >= 5001 && this.getQtdOcorrencias() <= 10000) {
				valor = 98.50;
			}
			
			if (this.getQtdOcorrencias() >= 10001 && this.getQtdOcorrencias() <= 50000) {
				valor = 123.90;
			}
			
			if (this.getQtdOcorrencias() > 50000) {
				valor = 187.82;
			}
		}
			
		return valor;
	}
	
	
	
	
	
	
	
	
	
}
