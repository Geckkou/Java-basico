import java.util.Scanner;
public class modularizaçao_exercicio3 {
	
	public static int soma() { 
	int x =0;
	int y = 0;
	Scanner s = new Scanner(System.in);
	
	System.out.print("Informe um valor para ser somado de 1 at� 100 : ");
	x =s.nextInt();
	
	
	for(int i =1; i<=100;i++) {
		y = y + x + i;
	}
	
	return y;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modularizaçao_exercicio3 c1 = new modularizaçao_exercicio3();
		System.out.println(c1.soma());

	}

}
