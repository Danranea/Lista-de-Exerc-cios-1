import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    		float medida1, medida2, medida3;
		Scanner entrada = new Scanner(System.in);
		
		// Inserir as medidas em ordem decrescente//
		
		 System.out.print("Entre com a medida 1: ");
		 medida1 = entrada.nextFloat();
		 System.out.print("Entre com a medida 2: ");
		 medida2 = entrada.nextFloat();
		 System.out.print("Entre com a medida 3: ");
		 medida3 = entrada.nextFloat();
		 
		 
		 if (medida1 >= medida2 + medida3) {
			 System.out.println("N�o forma Tri�ngulo");
        } else 
        	
        	if (medida1*medida1 == (medida2*medida2)+ (medida3*medida3)){
			 System.out.println("Tri�ngulo Ret�ngulo");
		} else 
			
			if (medida1*medida1 > (medida2*medida2)+(medida3*medida3)) {
			System.out.println("Tri�ngulo Obtus�ngulo");
		} else 
			
			if (medida1*medida1 < (medida2*medida2)+(medida3*medida3)) {
			System.out.println("Tri�ngulo Acut�ngulo");
		}  
			
			if (medida1 == medida2 && medida1 == medida3) {
			System.out.println("Tri�ngulo Equil�tero");	
		} else 
			
			if ((medida1==medida2 || medida1==medida3 || medida2==medida3)) {
				System.out.println("Tri�ngulo Is�sceles");
			} else {

			} 
			
			}{

		}{

		}{
			
                 }
    
    
    }
			
			}{

		}{

		}{
			
                 }
    
    
    }




