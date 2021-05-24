import java.util.*;
public class Exercicio_string {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner s = new Scanner (System.in);
		String nome, qualidade;
		System.out.println("fale seu nome: ");
		nome = s.next();
		System.out.println("diga uma qualidade sua ");
		qualidade = s.next();		
		System.out.println(nome +" é "+ qualidade); */
		
	 /*  String s1 = "Banana";
	   String s2 = "banana";
	   System.out.println("metodo equals = " + s1.equals(s2));
	   System.out.println("metodo equalsIgnoreCase = " + s1.equalsIgnoreCase(s2)); */
	   
	   String s1 = "testando uso de funçoes string";
	   int p = s1.length();
	   System.out.println(p);
	   
	   int indice = s1.indexOf("uso");
	   System.out.println(indice);
	   
	   char letra = s1.charAt(5);
	   System.out.println(letra);
		

	}

}
