
public class MainSalario {

	public static void main(String[] args) {
		//Instanciamento
		funcionario Pedro = new funcionario();
		funcionario Vagner = new funcionario();
		
		//Atribui��o de valores
		
		//Primeiro funcionario
		Pedro.nome = "Pedro";
		Pedro.SalarioBruto = 2000;
		Pedro.imposto = 300;
		
		//Segundo funcionario
		Vagner.nome = "Vagner";
		Vagner.SalarioBruto = 4000;
		Vagner.imposto = 500;
		
		//Imprimindo e usando os m�todos
		//Salario liquido
		System.out.println("Salario liquido do Pedro � R$" + Pedro.salarioLiquido());
		System.out.println("Salario liquido do Vagner � R$" + Vagner.salarioLiquido());
		
		//Aumentar salario
		System.out.println("Valor atribu�do com sucesso! Agora seu sal�rio bruto � R$" + Pedro.aumentaSalario(500));
		System.out.println("Valor atribu�do com sucesso! Agora seu sal�rio bruto � R$" + Vagner.aumentaSalario(300));

	}

}
