import java.util.*;
public class Exercicio_salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		double salario = 0;
		double aumento = 0;
		System.out.println("digite o salario a ser somado ");
		salario = s.nextDouble();
		aumento = salario + (salario * 15/100);
		System.out.println("seu novo salario é de " + aumento);

	}

}
