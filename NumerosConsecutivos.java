import java.util.Scanner;

public class NumerosConsecutivos {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		long num1, num2, consecutivonum1, consecutivonum2;
		
		System.out.println("Digite o n�mero 1: ");
		num1 = leitor.nextLong();
		
		System.out.println("Digite o n�mero 2: ");
		num2 = leitor.nextLong();
		
		consecutivonum1 = num1 + 1;
					
		System.out.println("O consecutivo do n�mero 1 �: " + consecutivonum1);
		
		consecutivonum2 = num2 + 1;
		
		System.out.println("O consecutivo do n�mero 2 �: " + consecutivonum2);
				
		
	}

}
