import java.util.*;
public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int idade  = 0;
		
		System.out.println("digite sua idade");
		idade = s.nextInt();
		
		if (idade <= 17) {
			System.out.println("voc� � menor de idade");
		}else
			if(idade <= 15) {
				System.out.println("voc� � uma crian�a");
		 }else 
			 if (idade >= 18 & idade <=49) {
			System.out.println("voc� � maior de idade");
			 }else
				 if (idade >= 50) {
					 System.out.println("Voc� � velho");
					 
		}

	}

}
