import java.util.Scanner;
public class Modularizaçao_RaizQuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner (System.in);
		System.out.println("Digite um n�mero");
		int n = s.nextInt();
		raizquadrada(n);	
	}

		
		public static void raizquadrada(int numero) {
		int i = 1, contador = 0, n = numero;
		while (n >0)   {
			n = n - i;
			i = i+2;
			contador = contador +1;
		}
		if (n ==0)
			System.out.println("Raiz exata de " + numero + ": " + contador);
		else  {
			contador = contador - 1;
			System.out.println("Raiz aprox. de " +numero+ ": " + contador);
		}  
	}
}

	