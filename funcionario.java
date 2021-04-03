
public class funcionario {
	String nome;
	double SalarioBruto;
	double imposto;
	
	double salarioLiquido() {
		return SalarioBruto - imposto;
	}
	
	double aumentaSalario(double acrescimo) {
		return SalarioBruto + acrescimo;
	}

}
