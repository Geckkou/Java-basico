import java.util.*;
public class Exercicio_Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double c = 0, f = 0;
		System.out.println(" digite uma temperatura em celsius");
		c = s.nextDouble();
		f = (9*c/5 + 32);
		System.out.println("temperatua em Fahrenheit: " + f);
		
		

	}

}
