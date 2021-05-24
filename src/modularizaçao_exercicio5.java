import java.util.Scanner;
public class modularizaçao_exercicio5 {
	
	public static void pg() {
		int pg =1;
		int x =0;
		int razao =1;
		Scanner s  = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero da PG : ");
		x = s.nextInt();
		System.out.print("Informe a raz�o : ");
		razao =s.nextInt();
		
		for(int i =1; i <= 15;i++) {
			pg =pg *razao;
			System.out.println(pg);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pg();

	}

}
