import java.util.*;
public class exercico_repetição {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 1;
		
		
		while( y >=0) {
			System.out.println("Informe um valor, para encerrar digite um n�mero negativo: ");
			Scanner s = new Scanner(System.in);
			y = s.nextInt();
			if (y % 2  == 0) {
				if(y >0) 
					System.out.println(y + " � um n�mero par ");
			}else 
					System.out.println(y + " � um n�mero impar ");
			System.out.println();
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
		 int num = 0;
	        System.out.println( "Para sair, entre com um valor < 0");
	        System.out.println( "Digite um n�mero:");           
	        Scanner s = new Scanner(System.in);
	        num = s.nextInt();
	        while (num >=0)  {
	            if (num % 2 == 0)
	                System.out.println("O n�mero " + num + " � par");
	            else
	                System.out.println("O n�mero " + num + " � impar");
	            System.out.println( "Digite o pr�ximo n�mero:");       
	            num = s.nextInt();
	        }
	        System.out.println("Tchau�");
	}

}
