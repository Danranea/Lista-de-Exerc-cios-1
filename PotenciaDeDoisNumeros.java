import java.util.Scanner;

public class PotenciaDeDoisNumeros {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double base, expoente, potência;
		
		System.out.print("Digite o valor correspondente a base: ");
		base = entrada.nextDouble();
		System.out.print("Digite o valor correspondente ao expoente: ");
		expoente = entrada.nextDouble();
		
		potência = Math.pow(base, expoente);
		
		System.out.print("O resultado da base elevado ao expoente é: " + potência);
		
	}

}
