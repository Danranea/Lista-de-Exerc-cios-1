import java.util.Scanner;

public class NúmeroNegativo {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número negativo ou positivo: ");
		numero = leitor.nextInt();
		
		if (numero > 0) {
			System.out.println("Número Positivo");	
		} else {
			System.out.println("Número Negativo");
		} 
		
		
			
		
		
	}

}
