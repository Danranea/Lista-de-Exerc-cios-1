import java.util.Scanner;

public class HorasDoJogo {
	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		double horainicial, horafinal, horasjogo1, horasjogo2;
		final double horaminima = 1, horamaxima = 24;
		
		System.out.println("Digite a hora inicial: ");
		horainicial = leitor.nextDouble();
		System.out.println("Digite a hora final: ");
		horafinal = leitor.nextDouble();
		
		horasjogo1 = horafinal - horainicial;
		horasjogo2 = (24-horainicial)+ horafinal;
		
		if (horasjogo1 > horaminima && horasjogo1 < horamaxima) {
			System.out.println("O jogo durou: " + horasjogo1 + " h");
			
		} else if (horasjogo2 > horaminima && horasjogo2 < horamaxima) {
			System.out.println("O jogo durou: " + horasjogo2 + " h");
			
		} else {
			System.out.println("O jogo não respeitou o tempo máximo e o tempo mínimo estabelecido.");

		}{
			
		}
	}
	

}
