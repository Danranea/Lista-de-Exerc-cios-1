import java.util.Scanner;

public class SalárioFuncionário {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int cadastrofunc;
		double horastrab, valorhoras, saláriofunc;
		
		System.out.print("Digite o número do cadastro do funcionário: ");
		cadastrofunc = leitor.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas pelo funcionário: ");
		horastrab = leitor.nextDouble();
		
		System.out.print("Digite o valor de cada hora trabalhada: ");
		valorhoras = leitor.nextDouble();
		
		saláriofunc = (double) horastrab*valorhoras;
		
		System.out.println("O funcionário " + cadastrofunc + " deve receber a quantia de " + saláriofunc);
		
	}

}
