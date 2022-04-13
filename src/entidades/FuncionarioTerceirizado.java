package entidades;

public class FuncionarioTerceirizado extends Funcionario{

	private Double taxaAdicional;

	public FuncionarioTerceirizado() {
		super();
	}
	
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double taxaAdicional) {
		super(nome, horas, valorPorHora);
		this.taxaAdicional = taxaAdicional;
	}

	public Double getTaxaAdicional() {
		return taxaAdicional;
	}

	public void setTaxaAdicional(Double taxaAdicional) {
		this.taxaAdicional = taxaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + taxaAdicional * 1.1; 
	}
	
}
