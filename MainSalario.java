
public class MainSalario {

	public static void main(String[] args) {
		//Instanciamento
		funcionario Pedro = new funcionario();
		funcionario Vagner = new funcionario();
		
		//Atribuição de valores
		
		//Primeiro funcionario
		Pedro.nome = "Pedro";
		Pedro.SalarioBruto = 2000;
		Pedro.imposto = 300;
		
		//Segundo funcionario
		Vagner.nome = "Vagner";
		Vagner.SalarioBruto = 4000;
		Vagner.imposto = 500;
		
		//Imprimindo e usando os métodos
		//Salario liquido
		System.out.println("Salario liquido do Pedro é R$" + Pedro.salarioLiquido());
		System.out.println("Salario liquido do Vagner é R$" + Vagner.salarioLiquido());
		
		//Aumentar salario
		System.out.println("Valor atribuído com sucesso! Agora seu salário bruto é R$" + Pedro.aumentaSalario(500));
		System.out.println("Valor atribuído com sucesso! Agora seu salário bruto é R$" + Vagner.aumentaSalario(300));

	}

}
