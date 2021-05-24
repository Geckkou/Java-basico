import java.util.Scanner;
public class modularizaçao_exercicio2 {
	
	public static double elevado() {
		double a =0;
		double res =1;
		int b = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		a =s.nextDouble();
		System.out.print("Deseja elevar " + a +" a quanto ? ");
		b =s.nextInt();
		
		for(int i =1; i<= b; i++ ) {
			res = res * a;
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modularizaçao_exercicio2 c1 = new modularizaçao_exercicio2();
		System.out.println(c1.elevado());
	}

}
