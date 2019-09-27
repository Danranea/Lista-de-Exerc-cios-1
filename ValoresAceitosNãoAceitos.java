import java.util.Scanner;

public class ValoresAceitosNãoAceitos {
	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		int n1, n2, n3, n4;
		
		System.out.println("Digite o valor de n1: ");
		n1 = leitor.nextInt();
		System.out.println("Digite o valor de n2: ");
		n2 = leitor.nextInt();
		System.out.println("Digite o valor de n3: ");
		n3 = leitor.nextInt();
		System.out.println("Digite o valor de n4: ");
		n4 = leitor.nextInt();
		
		if (n2>n3 && n4>n1 && (n3+n4)>(n1+n2)&& n3 > 0 && n4 > 0 && n1%2 == 0) {
			System.out.println("Valores Aceitos");
			
		} else {
			System.out.println("Valores não aceitos");

		}
	
	}

}
