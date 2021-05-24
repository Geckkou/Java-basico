import java.util.*;
public class Exercico_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s  = new Scanner (System.in);
		double nota1 =0;
		double nota2 =0;
		double media =0;

		System.out.println("Insira a primeira nota");
		nota1= s.nextDouble();
		System.out.println("Insira a segunda nota");
		nota2= s.nextDouble();
		media = (nota1 + nota2) / 2;
		
		if(media >=7) {
			System.out.println("aluno aprovado ");
		}else
			if (media >=4) {
				System.out.println("Aluno ira fazer prova final ");
			}else {
				System.out.println("Aluno reprovado ");												
			}
		}
	}


