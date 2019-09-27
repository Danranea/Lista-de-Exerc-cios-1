import java.util.Scanner;

public class DivisãoMaiorPeloMenor {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		double n1, n2, maiorn1, maiorn2;
		
	System.out.print("Digite o número 1: ");
	n1 = leitor.nextDouble();
	System.out.print("Digite o número 2: ");
	n2 = leitor.nextDouble();
	
	maiorn1 = n1 / n2;
	maiorn2 = n2 / n1;

	
	if (n1>n2) {
		System.out.println(maiorn1);
		
		
	} else {
		System.out.println(maiorn2);

	}
	
	}

}
