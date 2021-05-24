import java.util.*;
public class Exercicio_sorveteIFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner s = new Scanner (System.in);
		int bolas= 0;
		int sorvete = 0;
		
		System.out.println("que sorvete voc� deseja ? 1 = chocolate, 2 = morango");
		sorvete = s.nextInt();
		System.out.println("digite quantas bolas voc� deseja");
		bolas = s.nextInt();
		
		if (sorvete  == 1 && bolas > 3) {
			System.out.println("10% de desconto no sorvete de chocolate");
		}else
			if( sorvete == 1 && bolas <=3) {
				System.out.println("5% de desconto no sorvete de chocolate ");
			}else
				if(sorvete == 2) {
					System.out.println("sorvete de morango sem desconto ");	
		} */
		
		
		int bolas, sorvete =0;
		double preço,valor,desconto = 0;
		Scanner s = new Scanner (System.in);
		System.out.println("Sorvete de chocolate 4 ou mais bolas: R$ 15,00 ");
		System.out.println("Sorvete de chocolate 3 ou menos bolas: R$ 10,00 ");
		System.out.println("Sorvete de morango bolas: R$ 10,00 ");
		System.out.println();
		            
		            System.out.println("Informe o pre�o bruto do sorvete: ");			       
		            preço = s.nextFloat();
			    					
					System.out.println("Digite 1 para sorvete de chocolate ou 2 para Morango.");		
					sorvete = s.nextInt();
					
					System.out.println("Informe quantas bolas voc� deseja.");
					bolas = s.nextInt();
					
				if (sorvete == 1 && bolas >3) {
					desconto = (preço * 15)/100;
					valor = preço - desconto;
					System.out.println("10% de desconto no sorvete de chocolate: " + valor );
				
									
				}else if (sorvete == 1 && bolas <= 3) {
						desconto = (preço * 5)/100;
						valor = preço - desconto;
						System.out.println("5% de desconto no sorvete de chocolate: " + valor );
															
				}else {
					System.out.println("Sorverte sem desconto: " + preço);								
				}	                      
	    }
	}
