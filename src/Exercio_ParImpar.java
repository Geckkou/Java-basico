import java.util.*;
public class Exercio_ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*Scanner s = new Scanner (System.in);
		int num = 0;
		
		System.out.println("digite um n�mero para saber se � par ou impar");
		num= s.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("o n�mero � par");
		}else {
			System.out.println("o n�mero � Impar");
		}*/
		
		
		
		
		
		 Scanner entrada = new Scanner(System.in);
	        int num = entrada.nextInt();
	        for (int i = 1 ; i <= num; i++) { 
	          if(i % 2 != 0){
	            System.out.println(i);
	          }
	    }
	}

}
