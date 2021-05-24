import java.util.*;
public class Exercico_arredondamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double valor = 0, arredondado = 0;
	        int casas = 0, paraCimaOuParaBaixo = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Digite o valor:");
	        valor = s.nextDouble();
	        System.out.println("Digite o número de casas:");
	        casas = s.nextInt();
	        System.out.println("Digite 1 para arredondamento para cima ou 0 para arredondar para baixo:");
	        paraCimaOuParaBaixo= s.nextInt();
	        arredondado = valor;
	        arredondado = arredondado * (Math.pow(10, casas));
	        if (paraCimaOuParaBaixo == 1) {
	            arredondado = (int) (arredondado+1);          
	        } else {
	            arredondado = (int) (arredondado);
	        }
	        arredondado = arredondado / (Math.pow(10, casas));
	        System.out.println("O valor arredondado é: " + arredondado);
		
		

	}

}
