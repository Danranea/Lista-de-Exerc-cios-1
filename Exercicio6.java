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
		System.out.println("A �rea do tri�ngulo ret�ngulo �: " + areatriret);
		
		areacirc = (double) (valorC*3.14159);
		System.out.println("A �rea do seu c�rculo �: " + areacirc);
		
		areatrap = (double) ((valorA+valorB) * valorC) / 2;
		System.out.println("A �rea do seu trap�zio �: " + areatrap);
		
		areaquad = valorB*valorB;
		System.out.println("A �rea do seu quadrado �: " + areaquad);
		
		arearet = valorA*valorB;
		System.out.println("A �rea do seu ret�ngulo �: " + arearet);
		
		periret = 2 * (valorA + valorB);
		System.out.println("O per�metro do seu ret�ngulo �: " + periret);
		
		
	}
	

}
