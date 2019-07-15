package entidades;

public class EmpregadoTerceiro extends Empregado{

	private Double valorAdicional;
	
	public EmpregadoTerceiro() {
		super();
	}
		
	public EmpregadoTerceiro(String nome, Integer horas, Double valorHoras, Double valorAdicional) {
		super(nome, horas, valorHoras);
		this.valorAdicional = valorAdicional;
	}

	@Override
	public Double pagamento() {
		return horas * valorHoras + 1.1*valorAdicional;		
	}	
}
