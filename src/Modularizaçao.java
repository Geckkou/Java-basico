import java.util.Scanner;

public class Modularizaçao {
	
	public static double media() {
		double m = 0;
	double v[]=new double[5];
	Scanner s = new Scanner(System.in);
	
	for(int i = 0; i<v.length;i++) {
		System.out.print("Digite os valores para calcular a media: ");
		v[i] =s.nextInt();
		m = m + v[i] / v.length;
		System.out.println("A m�dia �: " + m);
	}
	return m;
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double calcm =0;
		
		calcm = media();

	}
}

/*public class programa {
public static void main(String[] args) {
double x[] = {10,20,30};
double resposta = media(x);
System.out.println("A m�dia dos valores do vetor �: "+resposta);
}
public static double media(double[] v) {
double soma = 0, media = 0;
for (int i = 0; i< v.length; i++) {
soma = soma + v[i];
}
media = soma / v.length;
return media;
}
}*/  // RESPOSTA DO PROFESSOR
