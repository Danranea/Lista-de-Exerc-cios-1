import java.util.Scanner;

public class Sal�rioFuncion�rio {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int cadastrofunc;
		double horastrab, valorhoras, sal�riofunc;
		
		System.out.print("Digite o n�mero do cadastro do funcion�rio: ");
		cadastrofunc = leitor.nextInt();
		
		System.out.print("Digite o n�mero de horas trabalhadas pelo funcion�rio: ");
		horastrab = leitor.nextDouble();
		
		System.out.print("Digite o valor de cada hora trabalhada: ");
		valorhoras = leitor.nextDouble();
		
		sal�riofunc = (double) horastrab*valorhoras;
		
		System.out.println("O funcion�rio " + cadastrofunc + " deve receber a quantia de " + sal�riofunc);
		
	}

}
