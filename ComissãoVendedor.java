import java.util.Scanner;

public class ComissãoVendedor {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		String nomevendedor;
		double salariofix, comissao, valortotalvendas, salarioecomissao;
				
		System.out.print("Digite o nome do Vendedor: ");
		nomevendedor = leitor.next();
		System.out.print("Digite o salário fixo do vendedor: ");
		salariofix = leitor.nextDouble();
		System.out.print("Digite o valor total de vendas efetuadas do vendedor: ");
		valortotalvendas = leitor.nextDouble();
		
		comissao = valortotalvendas*0.15;
		
		salarioecomissao = salariofix + comissao;
		
		System.out.println("Os proventos do funcionário " + nomevendedor + " que incluem o seu salário fixo e sua comissão serão de " + salarioecomissao);
		
		
		
		
		
		
		
		
		
	}

}
