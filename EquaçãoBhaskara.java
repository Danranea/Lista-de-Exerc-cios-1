import java.util.Scanner;
class Main {
  public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		double valorA, valorB, valorC, valorX, valorXpositivo, delta;
		
		System.out.print("Digite o valorA em números decimais: ");
		valorA = leitor.nextDouble();
		System.out.print("Digite o valorB em números decimais: ");
		valorB = leitor.nextDouble();
		System.out.print("Digite o valorC em números decimais: ");
		valorC = leitor.nextDouble();

    delta = (Math.pow(valorB, 2) - 4*valorA*valorC);
    valorX = Math.sqrt(delta);
		valorX = (-valorB-valorX)/(2*valorA);
		valorXpositivo = (-valorB+valorX)/(2*valorA);
    
		
		if (valorA == 0 || delta<0) {
			System.out.println("Impossível Calcular");
						
		} else {
			System.out.println("O valor de X é: " + valorX + "\n" + valorXpositivo);
			
		}     
   	}{

		}
		
	}