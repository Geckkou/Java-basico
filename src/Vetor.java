import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*double notas[];
		notas = new double[5];
		Scanner s  = new Scanner(System.in);
		
		for(int i=0; i < notas.length; i++) {
			System.out.println("Digite a nota");
			notas[i] = s.nextDouble();
		}
		System.out.println("Notas maiores que 7.5");
		for(int i = 0; i < notas.length;i++) {
			if (notas[i] > 7.5)
				System.out.println(notas[i]);
		}*/
//---------------------------------------------------------------------------				
		/*int [] vetor = new int[90];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length;i++) {
			System.out.println("Digite os valores");
			vetor[i] = s.nextInt();
		}
          for(int i = vetor.length - 1; i >= 0;i--) {
        	  System.out.println(vetor[i]);
          }*/
//----------------------------------------------------------------------------		
		/*int resposta [] = new int[5];
		int gabarito [] = new int[5];
		Scanner s = new Scanner(System.in);
		int soma=0;
		
		for(int i = 0; i < resposta.length;i++) {
			System.out.println("Digite o gabarito da " +(i+1) + "º questão");
			resposta[i] = s.nextInt();
		}
		for (int i =0; i < gabarito.length;i++) {
			System.out.println("insira as respostas corretas");
			gabarito[i] =s.nextInt();
			if(resposta[i] == gabarito[i])
			soma++;			
		}
		System.out.println("O número de acertos foi: " + soma);  */
//-------------------------------------------------------------------------------
		int x [] = new int [5];
		int y [] = new int [5];
		Scanner s  = new Scanner(System.in);
		int soma [] = new int[5];
		
		for(int i = 0; i < x.length;i++) {
			System.out.println("Digite os valores " + (i+1)+ " º valor");
			x [i] = s.nextInt();
		}
		
		for(int i = 0; i <y.length;i++) {
			System.out.println("Digite mais 5 valores " + (i+1)+ " º valor");
			y[i] = s.nextInt();		
		}
		for(int i =0; i<soma.length;i++) {
			soma[i] = x[i] + y[i];
			System.out.println(soma[i]);
		}
		
	}

}
