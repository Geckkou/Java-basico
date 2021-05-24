import java.util.*;
public class exercicio_tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, mult =0, cont = 0;
		Scanner s =new Scanner(System.in);
		
		System.out.println("Digite o número da tabuada");
		num = s.nextInt();
		
		while (num <= 10) {
		System.out.println("Tabuada de : " + num);
		cont = 1;
		while (cont <= 10) {
		mult = num * cont;
		System.out.println(num + "X" +cont + "="+ mult);
		cont = cont + 1;
		}
		num = num + 1;
		}
		
	}

}
