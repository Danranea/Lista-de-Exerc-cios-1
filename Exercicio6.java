import java.util.Scanner;

public class Exercicio6 {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		long valorA, valorB, valorC, areaquad, arearet, periret;
		double areacirc, areatriret, areatrap;
				
		System.out.println("Digite o valor 1: ");
		valorA = leitor.nextLong();
		System.out.println("Digite o valor 2: ");
		valorB = leitor.nextLong();
		System.out.println("Digite o valor 3: ");
		valorC = leitor.nextLong();
		
		areatriret = (double)(valorA*valorC) / 2;
		System.out.println("A área do triângulo retângulo é: " + areatriret);
		
		areacirc = (double) (valorC*3.14159);
		System.out.println("A área do seu círculo é: " + areacirc);
		
		areatrap = (double) ((valorA+valorB) * valorC) / 2;
		System.out.println("A área do seu trapézio é: " + areatrap);
		
		areaquad = valorB*valorB;
		System.out.println("A área do seu quadrado é: " + areaquad);
		
		arearet = valorA*valorB;
		System.out.println("A área do seu retângulo é: " + arearet);
		
		periret = 2 * (valorA + valorB);
		System.out.println("O perímetro do seu retângulo é: " + periret);
		
		
	}
	

}
