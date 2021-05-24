import java.util.*;
public class exercicio_maiormenor_repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 0;
		double cont= 0;
		double maior = 0;
        double menor = num;
        double soma= num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Para encerrar, Digite -1. ");
		System.out.println("Digite um n�mero: ");
		num = s.nextDouble();
		maior= num;
		menor = num;
		
		while(num != -1) {
			cont++;
			soma =+ num;
			if(num > maior)
				maior= num;
			else if( num < menor)
				menor = num;
			System.out.println("Digite um n�mero: ");
			num =s.nextDouble();
			
		}
		if (maior != -1) {
			System.out.println("O maior n�mero digitado foi: " + maior);
			System.out.println("O menor n�mero digitado foi: " + menor);
			System.out.println("A m�dia dos n�meros digitados �: " + soma/cont);	
		}
		else
			System.out.println("Nenhum n�mero v�lido foi informado");
		
	}

}


