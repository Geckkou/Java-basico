import java.util.*;
public class Exercico_DigitoVerificador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int conta = 0, inverso = 0,digito = 0, d1 = 0, d2 = 0, d3 = 0, soma = 0;
        System.out.println("Digite o número da conta (3 dígitos apenas):");
         Scanner s = new Scanner(System.in);
         conta = s.nextInt();
        d1 = conta / 100;
        d2 = (conta % 100) / 10;
        d3 = conta % 10;
        inverso = d3 * 100 + d2 * 10 + d1;
        soma = conta + inverso;
        d1 = (soma /100)*1;
        d2 = ((soma /10) % 10 )*2;
        d3 = (soma %10)*3;
        digito = (d1 + d2 + d3)% 10;
        System.out.println("digito verificador = "+ digito);
		
	}

}
