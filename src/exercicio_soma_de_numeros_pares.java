import java.util.*;
public class exercicio_soma_de_numeros_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0, soma_pares =0;
		System.out.println("Digite um n�mero >= 0:");
		Scanner s = new Scanner(System.in);
		numero = s.nextInt();
		if (numero >=0) {
		for (int i=1;i<=numero; i++) {
		if (i % 2 == 0)
		soma_pares = soma_pares + i;
		}
		System.out.println("A soma dos pares entre 0 e "+numero+" �: "+soma_pares);
		}
		else
		System.out.println("N�mero inv�lido informado.");
	}
}