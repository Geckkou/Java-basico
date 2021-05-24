import java.util.*;
public class ProjetoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float nota1 = 0, nota2 = 0;
		double media = 0;
		String nome;
		
		System.out.println("digite o nome do aluno");
		nome = s.next();
		
		System.out.println("digite a primeira nota");
		nota1 = s.nextFloat();
		System.out.println("digite a segunda nota");
		nota2 = s.nextFloat();
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("o aluno " + nome + " foi aprovado ");
		}else
			if (media <= 4 ) {
				System.out.println("o aluno" + nome + "foi reprovado ");
			}else
				if (media >= 5 &&  media <= 6) {
					System.out.println("o aluno " + nome + " foi para recuperação ");
					
		}
		System.out.println("nota final: " + media);
	}

}