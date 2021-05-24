import java.util.*;
public class exercicio_fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cont = 0;
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Digite um número a ser fatorado");
		num = s.nextInt();
		cont = num;
		
		while(num > 1) {
			cont = cont * (num - 1);
			num--;
		}
		
		System.out.println(cont);
	}

}
