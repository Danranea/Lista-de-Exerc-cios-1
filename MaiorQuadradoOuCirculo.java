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
			System.out.println("A �rea do quadrado � maior que a �rea do c�rculo e e � igual a " + areaquad);
			
		} else {
			System.out.println("A �rea do c�rculo � maior que a �rea do quadrado e � igual a " + areacirc);

		}
		
		
	}

}
