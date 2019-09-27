import java.util.Scanner;

public class ProdutoDeDoisNumeros {
	public static void main(String args[]) {
		int n1, n2, produto;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite n1: ");
		n1 = entrada.nextInt();
		System.out.print("Digite n2: ");
		n2 = entrada.nextInt();
		
		produto = n1 * n2;
		
		System.out.print("O resultado do produto de n1 e n2 é: " + produto);
		
		
	}

}
