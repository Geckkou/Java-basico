import java.util.Scanner;
public class modularizaçao_exercicio4 {
	
	public static void soma() {
		double x=0;
		double y =0;
		Scanner s = new Scanner(System.in);
		System.out.print("Informe um valor: ");
		x = s.nextInt();
		
		for(int i =1;i <=20;i++) {
			y=y+x*i;
		}
		System.out.println("Y = "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soma();
	
		

	}

}
