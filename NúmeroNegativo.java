import java.util.Scanner;

public class N�meroNegativo {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero negativo ou positivo: ");
		numero = leitor.nextInt();
		
		if (numero > 0) {
			System.out.println("N�mero Positivo");	
		} else {
			System.out.println("N�mero Negativo");
		} 
		
		
			
		
		
	}

}
