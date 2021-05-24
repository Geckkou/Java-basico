import java.util.Scanner;
public class Modularizaçao_Exercicio {
	
	public static double arredondar() {
		double valor = 0;
		double ar = 0;
		int casas=0;
		int cimaoubaixo =0;
		
		Scanner s  = new Scanner(System.in);
		
		System.out.print("Informe um n�mero ");
		valor = s.nextDouble();
		System.out.print("Informe o n�mero de casas ");
		casas = s.nextInt();
		System.out.print("Digite 1 para arredondamento para cima ou 0 para arredondar para baixo: ");
		cimaoubaixo = s.nextInt();
		
		ar = valor;
		ar = ar * (Math.pow(10, casas));
		
		if(cimaoubaixo == 1 ) {
			ar = (int) (ar +1);
		}else {
			ar = (int) (ar);
		}
		 ar = ar / (Math.pow(10, casas));
	     return ar;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modularizaçao_Exercicio c1  = new Modularizaçao_Exercicio();
		System.out.println(c1.arredondar());

	}

}
