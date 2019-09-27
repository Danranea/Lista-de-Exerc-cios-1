import java.util.Scanner;

public class MedriaAritmetica {
public static void main(String args[]) {
	Scanner leitor = new Scanner(System.in);
	
	int nota1, nota2;
	float nota3, nota4;
	double media; 
	
	System.out.print("Digite a nota1: ");
	nota1 = leitor.nextInt();
	System.out.print("Digite a nota2: ");
	nota2 = leitor.nextInt();
	System.out.print("Digite a nota3: ");
	nota3 = leitor.nextFloat();
	System.out.print("Digite a nota4: ");
	nota4 = leitor.nextFloat();
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.println("Sua média é: " + media);
	
	
	
}
}
