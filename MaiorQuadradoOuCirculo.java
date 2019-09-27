import java.util.Scanner;

public class MaiorQuadradoOuCirculo {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		double valorL, valorR, areaquad, areacirc;
		
		System.out.print("Digite o valor de L: ");
		valorL = leitor.nextDouble();
		
		System.out.print("Digite o valor de R: ");
		valorR = leitor.nextDouble();
		
		areaquad = valorL*valorL;
		
		areacirc = valorR*3.14159;
		
		if (areaquad > areacirc) {
			System.out.println("A área do quadrado é maior que a área do círculo e e é igual a " + areaquad);
			
		} else {
			System.out.println("A área do círculo é maior que a área do quadrado e é igual a " + areacirc);

		}
		
		
	}

}
