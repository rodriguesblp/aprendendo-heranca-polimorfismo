package entidades;

public class Empregado {

	protected String nome;
	protected Integer horas;
	protected Double valorHoras;
	
	public Empregado() {
		
	}

	public Empregado(String nome, Integer horas, Double valorHoras) {
		this.nome = nome;
		this.horas = horas;
		this.valorHoras = valorHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(Double valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public Double pagamento() {
		return valorHoras * horas;
	}	
	
	public String toString() {
		return nome +" - R$ " + String.format("%.2f", pagamento());
	}
}
