import java.util.*;
public class Exemplo_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int matricula= 0, ultimo_digito = 0;
		
		System.out.println("digite o número da matricula");
		matricula = s.nextInt();
		ultimo_digito = matricula %10;
		
		switch (ultimo_digito) {
		
		case 0:
			System.out.println("pagamento em janeiro ");
			break;
		
		case 1:
			System.out.println("pagamento em fevereiro ");
			break;
			
		case 2:
			System.out.println("pagamento em março");
			break;
			default:
				System.out.println("pagamento em abril");
		}
		

	}

}
