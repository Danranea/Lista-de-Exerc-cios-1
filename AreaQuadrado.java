import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		int lado, area;
		
		System.out.println("Digite a medida que corresponde a um dos lados do seu quadrado: ");
		lado = leitor.nextInt();
		
		area = lado*lado;
		
		System.out.print("A área do seu quadrado é: " + area);
		
		
		
		
		
	}

}
