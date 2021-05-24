import java.util.Scanner;

public class modularizaçao_fatorial {
	
	public static int fatorial() {
		int num, cont = 0;
		Scanner s  = new Scanner(System.in);
		
		System.out.print("Digite um n�mero a ser fatorado: ");
		num = s.nextInt();
		cont = num;
		
		while(num > 1) {
			cont = cont * (num - 1);
			num--;
		}
		return cont;
		}
	
	public static void main(String[] args) {
		modularizaçao_fatorial c1 = new modularizaçao_fatorial();
		System.out.println(c1.fatorial());
		}
		
		}