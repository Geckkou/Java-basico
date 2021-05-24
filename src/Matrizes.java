import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		// Declaração
		/*int[][] matriz = {{1,2}, {3,4}};
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[ i ].length; j++) {
		System.out.print(matriz[ i ][ j ]);
		}
		}*/
		
		int m[][] = new int [2][2];
		int soma =0;
		int maior =0;
	    Scanner s  = new Scanner(System.in);
	    
	    for(int i = 0; i<m.length;i++) {
	    	for(int j = 0; j<m[i].length;j++) {
	    		System.out.print("Digite os valores: ");
	    		m[i][j] = s.nextInt();
	    	}
	    }
		for (int i = 0; i<m.length;i++) {
			for(int j= 0; j<m[i].length;j++) {							
				if(m[i][j] >maior) {
					maior = m[i][j];
				}
				soma+=m[i][j];
			}
				
		}
		System.out.println("A soma as matrizes é igual a: " + soma );
		System.out.print("O maior valor da matriz é: " + maior);
		
	}

}
