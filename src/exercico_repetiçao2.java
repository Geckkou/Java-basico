import java.util.*;
public class exercico_repetiçao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =0;
		int y = 0;
		Scanner s =new Scanner(System.in);	
		
	for(int contador = 1; contador <= 10; contador++) {
	System.out.println("digite os valores ");
	x= s.nextInt();
	if(x % 2 != 0) 
		y++;
	}
		
	
System.out.println("numeros impares foi: " + y);
}
}