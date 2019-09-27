import java.util.Scanner;

public class SomaDosQuadrados {
	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		int num1, num2, quadrado1, quadrado2, soma;
		
		System.out.print("Digite o número 1: ");
		num1 = leitor.nextInt();
		
		System.out.print("Digite o número 2: ");
		num2 = leitor.nextInt();
		
		quadrado1 = num1*num1;
		
		quadrado2 = num2*num2;
		
		soma = quadrado1 + quadrado2;
		
		System.out.print("A soma dos quadrados dos números digitados acima é: " + soma);
				
		
	}

}
