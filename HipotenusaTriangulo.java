import java.util.Scanner;

public class HipotenusaTriangulo {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		double ladoA, ladoB, quadradoA, quadradoB, somaquadrados, hipotenusa;
		
		System.out.println("Digita o Lado A: ");
		ladoA = leitor.nextDouble();
		System.out.println("Digite o Lado B: ");
		ladoB = leitor.nextDouble();
		
		quadradoA = (double) Math.pow(ladoA, 2);
		quadradoB = (double) Math.pow(ladoB, 2);
		
		
		
		somaquadrados = quadradoA + quadradoB;
		
		hipotenusa = Math.sqrt(somaquadrados);
		
		System.out.println("A hipotenusa do seu triângulo retângulo é: " + hipotenusa);
		
				
		
		
		
	}
	

}
