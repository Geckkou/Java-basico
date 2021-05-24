import java.util.Scanner;

public class Exercicio_Vetor_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int x [] = new int [5];
		float media = 0;
		 int soma = 0;
		 int cont = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i =0 ; i < x.length;i++) {
			System.out.println("Digite os valores " + (i+1)+ " º valor");
			x[i] = s.nextInt();
			cont++;
			soma += x[i];
			media = soma/cont;
		}				
		System.out.println(media); */
//----------------------------------------------------------------------------------------------------------
	/*	int m [][] = new int [3][3];
		Scanner s  = new Scanner(System.in);
		int impar =0;	
		
		for(int i = 0; i <m.length;i++) {
			for(int j =0; j< m[i].length; j++) {
				System.out.println("Digite os valores");
				m[i][j]= s.nextInt();
			}
			
		}
		for(int i = 0 ; i <m.length;i++) {
			for(int j = 0; j<m[i].length;j++) {
				if(j % 2 == 0) {
					impar += m[i][j];	
				}				
			}		
		}
		System.out.println(impar); */
//--------------------------------------------------------------------------------------------------------------
		int m [][]= new int [3][3];
		Scanner s =new Scanner(System.in);
		int maior =0;
		int l =0;
		int minimax =0;
		
		for(int i =0 ;i <m.length;i++) {
			for(int j =0; j<m[i].length;j++) {
				System.out.println("Digite os valores para o minimax");
				m[i][j] =s.nextInt();
			}
		}
		for(int i =0; i<m.length;i++) {
			for(int j =0; j<m[i].length;j++) {
				if(m[i][j] > maior) {
					maior = m[i][j];
					l = i;				
				}
			}	
		}	
		minimax = m[l][0];
		for(int j =1; j<m[l].length;j++) {
			if(m[l][j]<minimax) {
				minimax = m[l][j];
			}
		}
		System.out.println(minimax);
	}

}
